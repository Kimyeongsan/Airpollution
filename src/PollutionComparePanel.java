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

		// ������ ������ ȭ�� Ÿ��Ʋ
		JLabel CompareNewLabel = new JLabel("Pollution Compare");
		CompareNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		CompareNewLabel.setForeground(Color.BLUE);
		CompareNewLabel.setHorizontalAlignment(JLabel.CENTER);
		CompareNewLabel.setBounds(192, 10, 245, 30);
		this.add(CompareNewLabel);

		String Arealist[] = { "������", "�������", "������", "�����Ϸ�", "���ϱ�", "������", "���״��", "���Ǳ�", "������", "���α�", "��õ��", "�����",
				"������", "������", "���빮��", "���۱�", "���۴��", "������", "���빮��", "���ʱ�", "������", "���ϱ�", "���ı�", "���̷�", "��õ��", "��������",
				"��������", "��걸", "����", "������", "����", "���α�", "�߱�", "�߶���", "õȣ���", "û��õ��", "�Ѱ����", "ȫ����", "ȭ����" };

		//// ��������1
		comboBoxArea1 = new JComboBox(Arealist);
		comboBoxArea1.setBounds(113, 61, 96, 21);
		this.add(comboBoxArea1);

		//// ��������2
		comboBoxArea2 = new JComboBox(Arealist);
		comboBoxArea2.setBounds(440, 61, 96, 21);
		this.add(comboBoxArea2);

		JLabel A_compareLabel = new JLabel("��������A");
		A_compareLabel.setBounds(38, 64, 63, 15);
		this.add(A_compareLabel);

		JLabel Label_A = new JLabel("��¥ �Է�");
		Label_A.setBounds(38, 101, 63, 15);
		this.add(Label_A);

		JLabel B_compareLabel = new JLabel("��������B");
		B_compareLabel.setBounds(360, 64, 68, 15);
		this.add(B_compareLabel);

		JLabel Label_B = new JLabel("��¥ �Է�");
		Label_B.setBounds(360, 101, 68, 15);
		this.add(Label_B);

		// ù��° ��¥ �Է�
		textField_A = new JTextField();
		textField_A.setBounds(113, 98, 96, 21);
		this.add(textField_A);
		textField_A.setColumns(10);

		// �ι�° ��¥ �Է�
		textField_B = new JTextField();
		textField_B.setBounds(440, 98, 96, 21);
		this.add(textField_B);
		textField_B.setColumns(10);

		JButton btnCompareSet = new JButton("����");
		btnCompareSet.setBounds(278, 308, 97, 23);
		this.add(btnCompareSet);
		// �����ư ������
		btnCompareSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1, data2;
				String Area1, Area2;
				String date1, date2;

				ResultSet rs_A, rs_B;

				date1 = textField_A.getText();
				date2 = textField_B.getText();

				// ��¥ �� �ޱ�
				data1 = (String) textField_A.getSelectedText();
				data2 = (String) textField_B.getSelectedText();

				// ������ �ޱ�
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

		this.setVisible(false); // Compare panel ������ ���߱�
	}

	private void graphInit() {

		Graphpanel = new GraphPollution_Compare();//// �׷��� 1 �� �г�////////////
		Graphpanel.setBounds(38, 131, 228, 200);
		Graphpanel.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(Graphpanel);
		Graphpanel.setVisible(true);

	}

	private void graphInit_2() {
		Graphpanel_2 = new GraphPollution_Compare();//// �׷��� 2�� �г�///////////
		Graphpanel_2.setBounds(382, 131, 228, 200);
		Graphpanel_2.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(Graphpanel_2);
		Graphpanel.setVisible(true);
	}
}
