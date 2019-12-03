import java.awt.Color;
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
import javax.swing.JTextField;

import Database.PollutionDB;

public class PollutionComparePanel extends JPanel {
	private JTextField textField_A, textField_B;
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
		CompareNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		CompareNewLabel.setForeground(Color.BLUE);
		CompareNewLabel.setHorizontalAlignment(JLabel.CENTER);
		CompareNewLabel.setBounds(192, 10, 245, 30);
		this.add(CompareNewLabel);

		String Arealist[] = { "강남구", "강남대로", "강동구", "강변북로", "강북구", "강서구", "공항대로", "관악구", "광진구", "구로구", "금천구", "노원구",
				"도봉구", "도산대로", "동대문구", "동작구", "동작대로", "마포구", "서대문구", "서초구", "성동구", "성북구", "송파구", "신촌로", "양천구", "영등포구",
				"영등포로", "용산구", "은평구", "정릉로", "종로", "종로구", "중구", "중랑구", "천호대로", "청계천로", "한강대로", "홍릉로", "화랑로" };

		//// 지역선택1
		comboBoxArea1 = new JComboBox(Arealist);
		comboBoxArea1.setBounds(113, 61, 96, 21);
		this.add(comboBoxArea1);

		//// 지역선택2
		comboBoxArea2 = new JComboBox(Arealist);
		comboBoxArea2.setBounds(440, 61, 96, 21);
		this.add(comboBoxArea2);

		JLabel A_compareLabel = new JLabel("지역선택A");
		A_compareLabel.setBounds(38, 64, 63, 15);
		this.add(A_compareLabel);

		JLabel Label_A = new JLabel("날짜 입력");
		Label_A.setBounds(38, 101, 63, 15);
		this.add(Label_A);

		JLabel B_compareLabel = new JLabel("지역선택B");
		B_compareLabel.setBounds(360, 64, 68, 15);
		this.add(B_compareLabel);

		JLabel Label_B = new JLabel("날짜 입력");
		Label_B.setBounds(360, 101, 68, 15);
		this.add(Label_B);

		// 첫번째 날짜 입력
		textField_A = new JTextField();
		textField_A.setBounds(113, 98, 96, 21);
		this.add(textField_A);
		textField_A.setColumns(10);

		// 두번째 날짜 입력
		textField_B = new JTextField();
		textField_B.setBounds(440, 98, 96, 21);
		this.add(textField_B);
		textField_B.setColumns(10);

		JButton btnCompareSet = new JButton("적용");
		btnCompareSet.setBounds(278, 308, 97, 23);
		this.add(btnCompareSet);
		// 적용버튼 리스너
		btnCompareSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1, data2;
				String Area1, Area2;
				String date1, date2;

				ResultSet rs_A, rs_B;

				date1 = textField_A.getText();
				date2 = textField_B.getText();

				// 날짜 값 받기
				data1 = (String) textField_A.getSelectedText();
				data2 = (String) textField_B.getSelectedText();

				// 지역값 받기
				Area1 = (String) comboBoxArea1.getSelectedItem();
				Area2 = (String) comboBoxArea2.getSelectedItem();

				data1 = date1 + "," + Area1;
				data2 = date2 + "," + Area2;

				PollutionDB pollution = new PollutionDB();

				rs_A = pollution.getPollutionDataWith(date1, Area1);
				rs_B = pollution.getPollutionDataWith(date2, Area2);

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
		Graphpanel.setBounds(38, 131, 228, 200);
		Graphpanel.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(Graphpanel);
		Graphpanel.setVisible(true);

	}

	private void graphInit_2() {
		Graphpanel_2 = new GraphPollution_Compare();//// 그래프 2들어갈 패널///////////
		Graphpanel_2.setBounds(382, 131, 228, 200);
		Graphpanel_2.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(Graphpanel_2);
		Graphpanel.setVisible(true);
	}
}
