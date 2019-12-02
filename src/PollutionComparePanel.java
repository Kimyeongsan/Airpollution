import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PollutionComparePanel extends JPanel {
	private JTextField textField_D1;
	private JTextField textField_D2;
	private GraphPollution_Compare Graphpanel;
	private GraphPollution_Compare Graphpanel_2;

	public PollutionComparePanel(JFrame frame) {
		super();
		panelInit(frame);
		graphInit();
		graphInit_2();
	}

	private void panelInit(JFrame frame) {
		this.setBackground(new Color(225, 240, 255));
		this.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(this);
		this.setLayout(null);

		// 지역별 오염도 화면 타이틀
		JLabel CompareNewLabel = new JLabel("Pollution Compare");
		CompareNewLabel.setFont(new Font("Arial", Font.BOLD, 35));
		CompareNewLabel.setForeground(new Color(0, 35, 110));
		CompareNewLabel.setHorizontalAlignment(JLabel.CENTER);
		CompareNewLabel.setBounds(70, 5, 500, 40);
		this.add(CompareNewLabel);
		
		JLabel lbl_choiceArea1 = new JLabel("지역 선택 A");
		lbl_choiceArea1.setBounds(43, 70, 70, 15);
		this.add(lbl_choiceArea1);

		JLabel lbl_writeDate1 = new JLabel("날짜 입력");
		lbl_writeDate1.setBounds(43, 98, 150, 15);
		this.add(lbl_writeDate1);

		
		//// 지역선택1
		String Arealist[] = { "강서구", "강북구", "강동구" };
		final JComboBox comboBoxArea1 = new JComboBox(Arealist);
		comboBoxArea1.setBounds(140, 67, 96, 21);
		this.add(comboBoxArea1);
		//// 지역선택2
		final JComboBox comboBoxArea2 = new JComboBox(Arealist);
		comboBoxArea2.setBounds(498, 67, 96, 21);
		this.add(comboBoxArea2);

		JLabel lbl_choiceArea2 = new JLabel("지역 선택 B");
		lbl_choiceArea2.setBounds(400, 70, 70, 15);
		this.add(lbl_choiceArea2);

		JLabel lbl_writeDate2 = new JLabel("날짜 입력");
		lbl_writeDate2.setBounds(400, 98, 68, 15);
		this.add(lbl_writeDate2);

		//
		//
		// 시작 날짜
		String MonthList[] = new String[12];
		for (int m = 1; m < 13; m++) {
			MonthList[m - 1] = Integer.toString(m) + "월";
		}
		// 날짜 리스트
		String DateList[] = new String[31];
		for (int d = 1; d < 32; d++) {
			DateList[d - 1] = Integer.toString(d) + "일";
		}
		
		//  지역 A 월
		JComboBox a_Month = new JComboBox(MonthList);
		a_Month.setBounds(130, 95, 96, 21);
		a_Month.setSize(new Dimension(55, 20));
		this.add(a_Month);
		//  지역 A 일
		JComboBox a_Date = new JComboBox(DateList);
		a_Date.setBounds(190, 95, 96, 21);
		a_Date.setSize(new Dimension(55, 20));
		this.add(a_Date);
		//  지역 B 월
		JComboBox b_Month = new JComboBox(MonthList);
		b_Month.setBounds(490, 95, 96, 21);
		b_Month.setSize(new Dimension(55, 20));
		this.add(b_Month);
		//  지역 B 일
		JComboBox b_Date = new JComboBox(DateList);
		b_Date.setBounds(550, 95, 96, 21);
		b_Date.setSize(new Dimension(55, 20));
		this.add(b_Date);

		JButton btnCompareSet = new JButton("적용");

		// 적용버튼 위치 및 판넬에 추가
		btnCompareSet.setBounds(268, 314, 97, 23);
		this.add(btnCompareSet);
		// 적용버튼 리스너
		btnCompareSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String data1,data2;//디비 끌어왔을때 사용할 최종 데이터 
				String Area1,Area2;
				
				//선택된 날짜 불러오기
				Area1=(String) comboBoxArea1.getSelectedItem();
				Area2=(String) comboBoxArea2.getSelectedItem();

				
				int monthA = a_Month.getSelectedIndex() + 1; //선택된 월
		        int dateA = a_Date.getSelectedIndex() + 1;   //선택된 일

				int monthB = b_Month.getSelectedIndex() + 1; //선택된 월
		        int dateB = b_Date.getSelectedIndex() + 1;   //선택된 일
		        
	            CheckDate checkD = new CheckDate();
	            checkD.setDate(monthA, dateA);
				data1 = checkD.getDate() + "," + Area1;
	            checkD.setDate(monthB, dateB);
				data2 = checkD.getDate() + "," + Area2;
				
				System.out.println("비교패널 데이터1 입력 테스트: " + data1);
				System.out.println("비교패널 데이터2 입력 테스트: " + data2);
				graph_1Set(0, 0);
				graph_2Set(0, 0);
				
			}
		});

		this.setVisible(false); // Compare panel 페이지 감추기
	}

	private void graphInit() {
		
		Graphpanel = new GraphPollution_Compare();//// 그래프 1 들어갈 패널////////////
		Graphpanel.setBounds(25, 137, 228, 200);
		Graphpanel.setBackground(Color.white);
		Graphpanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		this.add(Graphpanel);
		Graphpanel.setVisible(true);

	}

	private void graphInit_2() {
		Graphpanel_2 = new GraphPollution_Compare();//// 그래프 2들어갈 패널///////////
		Graphpanel_2.setBounds(382, 137, 228, 200);
		Graphpanel_2.setBackground(Color.white);
		Graphpanel_2.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(Graphpanel_2);
		Graphpanel_2.setFd(70);
		Graphpanel_2.setUd(30);
	}

	// 작동함
	public void graph_1Set(int fd, int ud) {

		// Graphpanel.setFd(fd);//추후 이런식으로 사용
		// Graphpanel.setUd(ud);
		Graphpanel.setFd(110);
		Graphpanel.setUd(100);
		add(Graphpanel);
		Graphpanel.setVisible(true);
		Graphpanel.repaint();
	}

	public void graph_2Set(int fd, int ud) {

		// Graphpanel.setFd(fd);
		// Graphpanel.setUd(ud);
		Graphpanel_2.setFd(27);
		Graphpanel_2.setUd(100);
		add(Graphpanel_2);
		Graphpanel_2.setVisible(true);
		Graphpanel_2.repaint();
	}

}
