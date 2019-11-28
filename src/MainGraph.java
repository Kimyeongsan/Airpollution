import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

<<<<<<< HEAD
// 변수 데이터 여기에 선언
class MainGraph_Stick extends JPanel {
	int NO2 = 100;
	int OZ = 70;
	int CO2 = 32;
	int SO2 = 22;
	int Fd = 45;
	int Ud = 100;

// 대충 이걸로 조절하려고 했는데 작동안하쥬~~ 토요일 해야쥬~~

	public void setNO2(int x) {
		this.NO2 = x;
	}

	public void setOZ(int x) {
		this.OZ = x;
	}

	public void setCO2(int x) {
		this.CO2 = x;
	}

	public void setSO2(int x) {
		this.SO2 = x;
	}

	public void setFd(int x) {
		this.Fd = x;
	}

	public void setUd(int x) {
		this.Ud = x;
	}

	@Override
	public void paintComponent(Graphics g) { // drawXXX 말고 fillXXX는 내부가 채워짐.
		super.paintComponent(g);

		g.setColor(Color.BLACK);// 글자
		g.drawString("NO2", 5, 20);// 내용,x좌표,y좌표
		g.setColor(Color.ORANGE);
		g.fillRect(80, 7, NO2, 20);

		g.setColor(Color.BLACK);// 글자
		g.drawString("OZ", 5, 50);// 내용,x좌표,y좌표
		g.setColor(Color.GREEN);
		g.fillRect(80, 37, OZ, 20);

		g.setColor(Color.BLACK);// 글자
		g.drawString("CO2", 5, 80);// 내용,x좌표,y좌표
		g.setColor(Color.ORANGE);
		g.fillRect(80, 67, CO2, 20);

		g.setColor(Color.BLACK);// 글자
		g.drawString("SO2", 5, 110);// 내용,x좌표,y좌표
		g.setColor(Color.GREEN);
		g.fillRect(80, 97, SO2, 20);

		g.setColor(Color.BLACK);// 글자
		g.drawString("Fd", 5, 140);// 내용,x좌표,y좌표
		g.setColor(Color.ORANGE);
		g.fillRect(80, 127, Fd, 20);

		g.setColor(Color.BLACK);// 글자
		g.drawString("Ud", 5, 170);// 내용,x좌표,y좌표
		g.setColor(Color.GREEN);
		g.fillRect(80, 157, Ud, 20);

=======


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
>>>>>>> branch 'master' of https://github.com/Kimyeongsan/Airpollution.git
	}
}

//메인에 들어가는 꺾은선 그래프
class MainGraph_Polygonal extends JPanel {
// 변수 데이터 여기에 선언

	int[] NO2 = { 100, 90, 70, 120, 100, 80, 50 };
	int[] OZ = { 70, 75, 80, 85, 60, 70, 65 };
	int[] CO2 = { 32, 125, 40, 75, 85, 40, 30 };
	int[] SO2 = { 122, 120, 17, 55, 70, 80, 50 };
	int[] Fd = { 100, 66, 46, 98, 120, 134, 155 };
	int[] Ud = { 120, 60, 150, 100, 80, 90, 120 };

// 대충 이걸로 조절하려고 했는데 작동안하쥬~~ 토요일 해야쥬~~

	public void setNO2(int x1, int x2, int x3, int x4, int x5, int x6, int x7) {

	}

	public void setOZ(int x) {

	}

	public void setCO2(int x) {

	}

	public void setSO2(int x) {
		// this.SO2 = x;
	}

	public void setFd(int x) {
		// this.Fd = x;
	}

	public void setUd(int x) {
		// this.Ud = x;
	}

	@Override
	public void paintComponent(Graphics g) { // drawXXX 말고 fillXXX는 내부가 채워짐.
		super.paintComponent(g);

		// 종류Y축
		g.setColor(Color.PINK);// 글자
		g.drawString("NO2", 5, 20);// 내용,x좌표,y좌표
		g.setColor(Color.RED);// 글자
		g.drawString("OZ", 5, 50);// 내용,x좌표,y좌표
		g.setColor(Color.YELLOW);// 글자
		g.drawString("CO2", 5, 80);// 내용,x좌표,y좌표
		g.setColor(Color.GREEN);// 글자
		g.drawString("SO2", 5, 110);// 내용,x좌표,y좌표
		g.setColor(Color.BLUE);// 글자
		g.drawString("Fd", 5, 140);// 내용,x좌표,y좌표
		g.setColor(Color.WHITE);// 글자
		g.drawString("Ud", 5, 170);// 내용,x좌표,y좌표

		// 기간 1~7일 X축
		g.drawString("DAY1", 50, 200);// 내용,x좌표,y좌표
		g.drawString("DAY2", 100, 200);
		g.drawString("DAY3", 150, 200);
		g.drawString("DAY4", 200, 200);
		g.drawString("DAY5", 250, 200);
		g.drawString("DAY6", 300, 200);
		g.drawString("DAY7", 350, 200);

		int x1 = 60;// 초기 x좌표

/////////////NO2시작

		// 점찍 반복문으로 수정//
		for (int i = 0; i <= 6; i++) {
			g.setColor(Color.PINK);
			g.fillOval(x1, NO2[i], 5, 5);
			x1 += 50;
		}
		x1 = 60;// 다시 x 초기 값으로 셋팅
		// 직선 반복으로 수정
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, NO2[i] + 3, x1 + 50, NO2[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;//

//////////////////Oz그래프 시작
		g.setColor(Color.RED);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, OZ[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, OZ[i] + 3, x1 + 50, OZ[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// 그래프 그리고 다시 원위치

//////////////////CO2그래프 시작
		g.setColor(Color.YELLOW);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, CO2[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, CO2[i] + 3, x1 + 50, CO2[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// 그래프 그리고 다시 원위치

/////////SO2시작
		g.setColor(Color.GREEN);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, SO2[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, SO2[i] + 3, x1 + 50, SO2[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// 그래프 그리고 다시 원위치

//////////////Fd 시작
		g.setColor(Color.BLUE);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, Fd[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, Fd[i] + 3, x1 + 50, Fd[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// 그래프 그리고 다시 원위치
//////////Ud
		g.setColor(Color.WHITE);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, Ud[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, Ud[i] + 3, x1 + 50, Ud[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// 그래프 그리고 다시 원위치

	}
}
