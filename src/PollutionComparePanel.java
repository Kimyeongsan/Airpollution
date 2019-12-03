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

		// ������ ������ ȭ�� Ÿ��Ʋ
		JLabel CompareNewLabel = new JLabel("Pollution Compare");
		CompareNewLabel.setFont(new Font("Arial", Font.BOLD, 35));
		CompareNewLabel.setForeground(new Color(0, 35, 110));
		CompareNewLabel.setHorizontalAlignment(JLabel.CENTER);
		CompareNewLabel.setBounds(70, 5, 500, 40);
		this.add(CompareNewLabel);

		String Arealist[] = { "������", "�������", "������", "�����Ϸ�", "���ϱ�", "������", "���״��", "���Ǳ�", "������", "���α�", "��õ��", "�����",
				"������", "������", "���빮��", "���۱�", "���۴��", "������", "���빮��", "���ʱ�", "������", "���ϱ�", "���ı�", "���̷�", "��õ��", "��������",
				"��������", "��걸", "����", "������", "����", "���α�", "�߱�", "�߶���", "õȣ���", "û��õ��", "�Ѱ����", "ȫ����", "ȭ����" };

		//// ��������1
		comboBoxArea1 = new JComboBox(Arealist);
		comboBoxArea1.setBounds(140, 67, 96, 21);
		this.add(comboBoxArea1);

		//// ��������2
		comboBoxArea2 = new JComboBox(Arealist);
		comboBoxArea2.setBounds(498, 67, 96, 21);
		this.add(comboBoxArea2);

		JLabel A_compareLabel = new JLabel("���� ���� A");
		A_compareLabel.setBounds(43, 70, 70, 15);
		this.add(A_compareLabel);

		JLabel Label_A = new JLabel("��¥ �Է�");
		Label_A.setBounds(43, 98, 150, 15);
		this.add(Label_A);

		JLabel B_compareLabel = new JLabel("���� ���� B");
		B_compareLabel.setBounds(400, 70, 70, 15);
		this.add(B_compareLabel);

		JLabel Label_B = new JLabel("��¥ �Է�");
		Label_B.setBounds(400, 98, 68, 15);
		this.add(Label_B);

		// ���� ��¥
		String MonthList[] = new String[12];
		for (int m = 1; m < 13; m++) {
			MonthList[m - 1] = Integer.toString(m) + "��";
		}
		// ��¥ ����Ʈ
		String DateList[] = new String[31];
		for (int d = 1; d < 32; d++) {
			DateList[d - 1] = Integer.toString(d) + "��";
		}
		
		//A ���� ��¥ �޾ƿ���
		JComboBox a_month = new JComboBox(MonthList);
		a_month.setBounds(130, 95, 96, 21);
		a_month.setSize(new Dimension(55, 20));
		this.add(a_month);
		
		JComboBox a_date = new JComboBox(DateList);
		a_date.setBounds(190, 95, 96, 21);
		a_date.setSize(new Dimension(55, 20));
		this.add(a_date);
		
		//B���� ��¥ �޾ƿ���
		JComboBox b_month = new JComboBox(MonthList);
		b_month.setBounds(490, 95, 96, 21);
		b_month.setSize(new Dimension(55, 20));
		this.add(b_month);
		
		JComboBox b_date = new JComboBox(DateList);
		b_date.setBounds(550, 95, 96, 21);
		b_date.setSize(new Dimension(55, 20));
		this.add(b_date);
		

		JButton btnCompareSet = new JButton("����");
		btnCompareSet.setBounds(268, 314, 97, 23);
		this.add(btnCompareSet);
		// �����ư ������
		btnCompareSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Area1, Area2;

				ResultSet rs_A, rs_B;

				// ������ �ޱ�
				Area1 = (String) comboBoxArea1.getSelectedItem();
				Area2 = (String) comboBoxArea2.getSelectedItem();

				// ��¥�� �ޱ�
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

		this.setVisible(false); // Compare panel ������ ���߱�
	}

	private void graphInit() {

		Graphpanel = new GraphPollution_Compare();//// �׷��� 1 �� �г�////////////
		Graphpanel.setBounds(25, 137, 228, 200);
		Graphpanel.setBackground(Color.white);
		Graphpanel.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(Graphpanel);
		Graphpanel.setVisible(true);

	}

	private void graphInit_2() {
		Graphpanel_2 = new GraphPollution_Compare();//// �׷��� 2�� �г�///////////
		Graphpanel_2.setBounds(382, 137, 228, 200);
		Graphpanel_2.setBackground(Color.white);
		Graphpanel_2.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(Graphpanel_2);
		Graphpanel.setVisible(true);
	}
}
