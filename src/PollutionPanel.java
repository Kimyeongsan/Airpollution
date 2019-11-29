import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PollutionPanel extends JPanel {
	private JTextField textField_D1;
	private JTextField textField_D2;
	private GraphPollution Graphpanel;
	private GraphPollution Graphpanel_2;
	
	public PollutionPanel(JFrame frame) {
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

		// ������ ������ ȭ�� Ÿ��Ʋ
		JLabel CompareNewLabel = new JLabel("Pollution Compare");
		CompareNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		CompareNewLabel.setForeground(Color.BLUE);
		CompareNewLabel.setHorizontalAlignment(JLabel.CENTER);
		CompareNewLabel.setBounds(192, 10, 245, 30);
		this.add(CompareNewLabel);
		/*
		 * JPanel first_compareGraph = new JPanel();//// �׷��� 1 �� �г�////////////
		 * first_compareGraph.setBounds(38, 131, 228, 200);
		 * first_compareGraph.setBorder(BorderFactory.createLineBorder(Color.red));
		 * Comparepanel.add(first_compareGraph); // first_compareGraph.add(new
		 * JLabel("NO2"));
		 */
		JLabel fisrt_compareLabel = new JLabel("��������A");
		fisrt_compareLabel.setBounds(38, 64, 63, 15);
		this.add(fisrt_compareLabel);

		//// ��������1
		String Arealist[] = { "������", "���ϱ�", "������" };
		JComboBox comboBoxArea1 = new JComboBox(Arealist);
		comboBoxArea1.setBounds(113, 61, 96, 21);
		this.add(comboBoxArea1);
		//// ��������2
		JComboBox comboBoxArea2 = new JComboBox(Arealist);
		comboBoxArea2.setBounds(440, 61, 96, 21);
		this.add(comboBoxArea2);

		JLabel lblNewLabel_2 = new JLabel("��¥ �Է�");
		lblNewLabel_2.setBounds(38, 101, 63, 15);
		this.add(lblNewLabel_2);
		/*
		 * JPanel second_comparGraph = new JPanel();//// �׷��� 2�� �г�///////////
		 * second_comparGraph.setBounds(382, 131, 228, 200);
		 * second_comparGraph.setBorder(BorderFactory.createLineBorder(Color.red));
		 * Comparepanel.add(second_comparGraph);
		 */
		JLabel lblNewLabel_3 = new JLabel("��������B");
		lblNewLabel_3.setBounds(360, 64, 68, 15);
		this.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("��¥ �Է�");
		lblNewLabel_4.setBounds(360, 101, 68, 15);
		this.add(lblNewLabel_4);
		//
		


//�̽ĵ� �׷��� �׷��� �ǳ�

//ù �� �ǳڿ� �߰����ֱ�

//      button.addActionListener(new DrawActionListener(text1, text2, text3, drawingPanel));

		//

		// ù��° ��¥ �Է�
		textField_D1 = new JTextField();
		textField_D1.setBounds(113, 98, 96, 21);
		this.add(textField_D1);
		textField_D1.setColumns(10);

		// �ι�° ��¥ �Է�
		textField_D2 = new JTextField();
		textField_D2.setBounds(440, 98, 96, 21);
		this.add(textField_D2);
		textField_D2.setColumns(10);

		// �����ư ���� ^^7
		JButton btnCompareSet = new JButton("����");
		/*
		 * �����ư �׳� ���� btnCompareSet.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) {
		 * 
		 * } }); btnCompareSet.setBounds(278, 308, 97, 23);
		 */
		//
		// �����ư �̽Ĺ���

		//
		// �����ư ��ġ �� �ǳڿ� �߰�
		btnCompareSet.setBounds(278, 308, 97, 23);
		this.add(btnCompareSet);

		this.setVisible(false); // Compare panel ������ ���߱�
	}
	
	private void graphInit() {
		// �׷��� �õ��غ���
		// �� �׷��� �׷��� Ŭ����1
		// �̰Ŷ� ���� �� �ϳ� ������ 2�� ������
		Graphpanel = new GraphPollution();//// �׷��� 1 �� �г�////////////
		Graphpanel.setBounds(38, 131, 228, 200);
		Graphpanel.setBorder(BorderFactory.createLineBorder(Color.black));
		// �� ������ �̷�������
		Graphpanel.setFd(12);
		Graphpanel.setFd(32);

		this.add(Graphpanel);
		Graphpanel.setVisible(true);
	}
	
	private void graphInit_2() {
		Graphpanel_2 = new GraphPollution();//// �׷��� 2�� �г�///////////
		Graphpanel_2.setBounds(382, 131, 228, 200);
		Graphpanel_2.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(Graphpanel_2);
		Graphpanel_2.setFd(70);
		Graphpanel_2.setUd(30);
	}

}
