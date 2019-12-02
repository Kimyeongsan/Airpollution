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
		
		JLabel lblNewLabel_3 = new JLabel("지역선택B");
		lblNewLabel_3.setBounds(360, 64, 68, 15);
		this.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("날짜 입력");
		lblNewLabel_4.setBounds(360, 101, 68, 15);
		this.add(lblNewLabel_4);
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

				String data1,data2;//디비 끌어왔을때 사용할 최종 데이터 

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
