import java.awt.Color;
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
		CompareNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		CompareNewLabel.setForeground(Color.BLUE);
		CompareNewLabel.setHorizontalAlignment(JLabel.CENTER);
		CompareNewLabel.setBounds(192, 10, 245, 30);
		this.add(CompareNewLabel);
		/*
		 * JPanel first_compareGraph = new JPanel();//// 그래프 1 들어갈 패널////////////
		 * first_compareGraph.setBounds(38, 131, 228, 200);
		 * first_compareGraph.setBorder(BorderFactory.createLineBorder(Color.red));
		 * Comparepanel.add(first_compareGraph); // first_compareGraph.add(new
		 * JLabel("NO2"));
		 */
		JLabel fisrt_compareLabel = new JLabel("지역선택A");
		fisrt_compareLabel.setBounds(38, 64, 63, 15);
		this.add(fisrt_compareLabel);

		//// 지역선택1
		String Arealist[] = { "강서구", "강북구", "강동구" };
		final JComboBox comboBoxArea1 = new JComboBox(Arealist);
		comboBoxArea1.setBounds(113, 61, 96, 21);
		this.add(comboBoxArea1);
		//// 지역선택2
		final JComboBox comboBoxArea2 = new JComboBox(Arealist);
		comboBoxArea2.setBounds(440, 61, 96, 21);
		this.add(comboBoxArea2);

		JLabel lblNewLabel_2 = new JLabel("날짜 입력");
		lblNewLabel_2.setBounds(38, 101, 63, 15);
		this.add(lblNewLabel_2);
		/*
		 * JPanel second_comparGraph = new JPanel();//// 그래프 2들어갈 패널///////////
		 * second_comparGraph.setBounds(382, 131, 228, 200);
		 * second_comparGraph.setBorder(BorderFactory.createLineBorder(Color.red));
		 * Comparepanel.add(second_comparGraph);
		 */
		JLabel lblNewLabel_3 = new JLabel("지역선택B");
		lblNewLabel_3.setBounds(360, 64, 68, 15);
		this.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("날짜 입력");
		lblNewLabel_4.setBounds(360, 101, 68, 15);
		this.add(lblNewLabel_4);
		//

//이식된 그래프 그려질 판넬

//첫 비교 판넬에 추가해주기

//      button.addActionListener(new DrawActionListener(text1, text2, text3, drawingPanel));

		//

		// 첫번째 날짜 입력
		textField_D1 = new JTextField();
		textField_D1.setBounds(113, 98, 96, 21);
		this.add(textField_D1);
		textField_D1.setColumns(10);

		// 두번째 날짜 입력
		textField_D2 = new JTextField();
		textField_D2.setBounds(440, 98, 96, 21);
		this.add(textField_D2);
		textField_D2.setColumns(10);

		JButton btnCompareSet = new JButton("적용");

		// 적용버튼 위치 및 판넬에 추가
		btnCompareSet.setBounds(278, 308, 97, 23);
		this.add(btnCompareSet);
		// 적용버튼 리스너
		btnCompareSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1,data2;
				String Area1,Area2;
				String date1,date2;
				Area1=(String) comboBoxArea1.getSelectedItem();
				Area2=(String) comboBoxArea2.getSelectedItem();
				date1=textField_D1.getText();//
				date2=textField_D2.getText();
				data1=date1+","+Area1;
				data2=date2+","+Area2;
				System.out.println("비교패널 데이터1 입력 테스트: "+data1);
				System.out.println("비교패널 데이터2 입력 테스트: "+data2);
				graph_1Set(0, 0);
				graph_2Set(0, 0);
				// 작동함
			}
		});
		//

		this.setVisible(false); // Compare panel 페이지 감추기
	}

	private void graphInit() {
		// 그래프 시도해보자
		// 비교 그래프 그려줄 클래스1
		// 이거랑 같은 거 하나 더만들어서 2로 쓸꺼야
		Graphpanel = new GraphPollution_Compare();//// 그래프 1 들어갈 패널////////////
		Graphpanel.setBounds(38, 131, 228, 200);
		Graphpanel.setBorder(BorderFactory.createLineBorder(Color.black));
		// 값 수정은 이런식으로
		// Graphpanel.setFd(0);
		// Graphpanel.setUd(30);
		this.add(Graphpanel);
		Graphpanel.setVisible(true);

	}

	private void graphInit_2() {
		Graphpanel_2 = new GraphPollution_Compare();//// 그래프 2들어갈 패널///////////
		Graphpanel_2.setBounds(382, 131, 228, 200);
		Graphpanel_2.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(Graphpanel_2);
		Graphpanel_2.setFd(70);
		Graphpanel_2.setUd(30);
	}

	// 작동함
	public void graph_1Set(int fd, int ud) {
		// Graphpanel.setFd(fd);
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
