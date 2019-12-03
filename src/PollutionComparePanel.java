import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Database.PollutionDB;

public class PollutionComparePanel extends JPanel {
	private JComboBox comboBoxArea1, comboBoxArea2;
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

		String Arealist[] = { "강남구", "강남대로", "강동구", "강변북로", "강북구", "강서구", "공항대로", "관악구", "광진구", "구로구", "금천구", "노원구",
				"도봉구", "도산대로", "동대문구", "동작구", "동작대로", "마포구", "서대문구", "서초구", "성동구", "성북구", "송파구", "신촌로", "양천구", "영등포구",
				"영등포로", "용산구", "은평구", "정릉로", "종로", "종로구", "중구", "중랑구", "천호대로", "청계천로", "한강대로", "홍릉로", "화랑로" };

		//// 지역선택1
		comboBoxArea1 = new JComboBox(Arealist);
		comboBoxArea1.setBounds(140, 67, 96, 21);
		this.add(comboBoxArea1);

		//// 지역선택2
		comboBoxArea2 = new JComboBox(Arealist);
		comboBoxArea2.setBounds(498, 67, 96, 21);
		this.add(comboBoxArea2);

		JLabel A_compareLabel = new JLabel("지역 선택 A");
		A_compareLabel.setBounds(43, 70, 70, 15);
		this.add(A_compareLabel);

		JLabel Label_A = new JLabel("날짜 입력");
		Label_A.setBounds(43, 98, 150, 15);
		this.add(Label_A);

		JLabel B_compareLabel = new JLabel("지역 선택 B");
		B_compareLabel.setBounds(400, 70, 70, 15);
		this.add(B_compareLabel);

		JLabel Label_B = new JLabel("날짜 입력");
		Label_B.setBounds(400, 98, 68, 15);
		this.add(Label_B);

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
		
		//A 지역 날짜 받아오기
		JComboBox a_month = new JComboBox(MonthList);
		a_month.setBounds(130, 95, 96, 21);
		a_month.setSize(new Dimension(55, 20));
		this.add(a_month);
		
		JComboBox a_date = new JComboBox(DateList);
		a_date.setBounds(190, 95, 96, 21);
		a_date.setSize(new Dimension(55, 20));
		this.add(a_date);
		
		//B지역 날짜 받아오기
		JComboBox b_month = new JComboBox(MonthList);
		b_month.setBounds(490, 95, 96, 21);
		b_month.setSize(new Dimension(55, 20));
		this.add(b_month);
		
		JComboBox b_date = new JComboBox(DateList);
		b_date.setBounds(550, 95, 96, 21);
		b_date.setSize(new Dimension(55, 20));
		this.add(b_date);
		

		JButton btnCompareSet = new JButton("적용");
		btnCompareSet.setBounds(268, 314, 97, 23);
		this.add(btnCompareSet);
		// 적용버튼 리스너
		btnCompareSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Area1, Area2;

				ResultSet rs_A, rs_B;

				// 지역값 받기
				Area1 = (String) comboBoxArea1.getSelectedItem();
				Area2 = (String) comboBoxArea2.getSelectedItem();

				// 날짜값 받기
				int monthA = a_month.getSelectedIndex() + 1;
				int dateA = a_date.getSelectedIndex() + 1;
				
				int monthB = b_month.getSelectedIndex() + 1;
				int dateB = b_date.getSelectedIndex() + 1;
				
				CheckDate poll_check = new CheckDate();
				
				PollutionDB pollution = new PollutionDB();
				poll_check.setDate(monthA, dateA);
				rs_A = pollution.getPollutionDataWith(poll_check.getDate(), Area1);			
				poll_check.setDate(monthB, dateB);
				rs_B = pollution.getPollutionDataWith(poll_check.getDate(), Area2);

				try {
					rs_A.next();

					Graphpanel.setFd((int) Double.parseDouble(rs_A.getString("FINEDUST")));
					Graphpanel.setUd((int) Double.parseDouble(rs_A.getString("TINYDUST")));
					Graphpanel.setVisible(true);

					Graphpanel.repaint();

					rs_B.next();

					Graphpanel_2.setFd((int) Double.parseDouble(rs_B.getString("FINEDUST")));
					Graphpanel_2.setUd((int) Double.parseDouble(rs_B.getString("TINYDUST")));
					Graphpanel_2.setVisible(true);

					Graphpanel_2.repaint();

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			private String String(JComboBox comboBoxArea1, JComboBox comboBoxArea2) {
				return null;
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
		Graphpanel.setVisible(true);
	}
}
