import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class MainGraph {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Pollution Graph");
		frame.setLocation(500,200);
		frame.setPreferredSize(new Dimension(400,350));
		Container contentPane = frame.getContentPane();
  
		DrawingPanel drawingPanel = new DrawingPanel();
		contentPane.add(drawingPanel, BorderLayout.CENTER);
		//그래프를 그릴 패널
  
		JPanel controlPanel = new JPanel();
		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);
		JButton button = new JButton("그래프 그리기");
		controlPanel.add(new JLabel("강서구"));
		controlPanel.add(text1);
		controlPanel.add(new JLabel("서대문구"));
		controlPanel.add(text2);
		controlPanel.add(new JLabel("강남구"));
		controlPanel.add(text3);
		controlPanel.add(button);
		contentPane.add(controlPanel, BorderLayout.SOUTH);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(new DrawActionListener(text1,text2,text3,drawingPanel));
		//"그래프 그리기" 버튼을 눌렀을때 작동 할 리스터등록
		frame.pack();
		frame.setVisible(true);
	}
}

//그래피를 그리는 패널 클래스 ++ 추후 수정예정

class DrawingPanel extends JPanel {
	int korean, english, math;
	
	public void paint(Graphics g){
		g.clearRect(0,0,getWidth(),getHeight());
		g.drawLine(50,250,350,250);
		
		for(int cnt = 1 ;cnt<11;cnt++) {
			g.drawString(cnt *10 +"",25,255-20*cnt);
			g.drawLine(50, 250-20*cnt, 350,250-20*cnt);
		}
 
		g.drawLine(50,20,50,250);
		g.drawString("강서구",100,270);
		g.drawString("서대문구",200,270);
		g.drawString("강남구",300,270);
		g.setColor(Color.RED);
 
		if (korean>0)
			g.fillRect(110,250-korean*2,10,korean*2);
		if(english>0)
			g.fillRect(210,250-english*2,10,english*2);
		if(math>0)
			g.fillRect(310,250-math*2,10,math*2);
		}
 
	void setScores(int korean, int english, int math){
		this.korean=korean;
		this.english=english;
		this.math=math;
		}
	}

//버튼 눌렀을때 동작하는 리스너
class DrawActionListener implements ActionListener {
	JTextField text1,text2,text3;
 
	DrawingPanel drawingPanel;
 
	DrawActionListener(JTextField text1, JTextField text2, JTextField text3, DrawingPanel drawingPanel) {
		this.text1=text1;
		this.text2=text2;
		this.text3=text3;
		this.drawingPanel = drawingPanel;
	}
	
 public void actionPerformed(ActionEvent e) {
	 try{
		 int korean = Integer.parseInt(text1.getText());
		 int english = Integer.parseInt(text2.getText());
		 int math = Integer.parseInt(text3.getText());
		 drawingPanel.setScores(korean, english, math);
		 drawingPanel.repaint();
		 }
	 catch (NumberFormatException nfe){
		 JOptionPane.showMessageDialog(drawingPanel,"잘못된 숫자 입력입니다","에러메시지",JOptionPane.ERROR_MESSAGE);
		 }
	 }
}