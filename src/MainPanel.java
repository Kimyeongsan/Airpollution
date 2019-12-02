
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

public class MainPanel extends JPanel{
	private JButton btnNewButton;
	private JButton btnGraphType;
	private MainGraph_Stick Graphpanel;
	private MainGraph_Polygonal Graphpanel_2;
	private JComboBox start_Month, start_Date, end_Month, end_Date;
	
	public MainPanel(JFrame frame) {
		super();
		panelInit(frame);
		graphInit();
		graphInit_2();
	}
	
	private void panelInit(JFrame frame) {
		// ���� ȭ�� �г�
		this.setBackground(new Color(225, 240, 255));
		this.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(this);
		this.setLayout(null);

		// ���� ȭ�� ��
		JLabel tilteLabel = new JLabel("Air Pollution");
		tilteLabel.setFont(new Font("Arial", Font.BOLD, 30));
		tilteLabel.setForeground(new Color(0, 35, 110));
		tilteLabel.setHorizontalAlignment(JLabel.CENTER);
		tilteLabel.setBounds(180, 10, 270, 28);
		this.add(tilteLabel);

		JLabel lblDay = new JLabel("��¥ �Է�");
		lblDay.setBounds(27, 288, 57, 15);
		this.add(lblDay);

		// ���� ��¥
		String MonthList[] = new String[12];
		for (int m = 1; m < 13; m++) {
			MonthList[m - 1] = Integer.toString(m) + "��";
		}

		start_Month = new JComboBox(MonthList);
		start_Month.setBounds(96, 285, 116, 21);
		start_Month.setSize(new Dimension(55, 20));
		this.add(start_Month);

		// ��¥ ����Ʈ
		String DateList[] = new String[31];
		for (int d = 1; d < 32; d++) {
			DateList[d - 1] = Integer.toString(d) + "��";
		}

		// ���� ��¥
		start_Date = new JComboBox(DateList);
		start_Date.setBounds(155, 285, 116, 21);
		start_Date.setSize(new Dimension(55, 20));
		this.add(start_Date);

		// �Ⱓ(~) ��
		JLabel termLabel = new JLabel(" ~ ");
		termLabel.setBounds(210, 288, 57, 15);
		this.add(termLabel);

	

		// �� ��¥
		end_Month = new JComboBox(MonthList);
		end_Month.setBounds(224, 285, 116, 21);
		end_Month.setSize(new Dimension(55, 20));
		this.add(end_Month);

		end_Date = new JComboBox(DateList);
		end_Date.setBounds(284, 285, 116, 21);
		end_Date.setSize(new Dimension(55, 20));
		this.add(end_Date);

		JButton btnApply = new JButton("��¥ ����");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//���� ������,
				//��� ������ get �޼ҵ� ���� ����־�����
				
				//���� �׷��� 1 ����
			Graphpanel.setNO2(22);
			Graphpanel.setOZ(75);
			Graphpanel.setCO2(140);
			Graphpanel.setSO2(25);
			Graphpanel.setFd(155);
			Graphpanel.setUd(130);
			Graphpanel.setVisible(true);
			
			
			//���� �׷���2 ����
			Graphpanel_2.setNO2("0,11,12,22,21,33,50");
			Graphpanel_2.setOZ("10,13,15,12,25,40,40");
			Graphpanel_2.setCO2("50,101,52,102,51,13,30");
			Graphpanel_2.setSO2("70,31,82,62,91,23,79");
			Graphpanel_2.setNO2("30,90,60,122,51,73,20");
			Graphpanel_2.setNO2("90,51,22,32,31,63,100");
			//��������
			Graphpanel.repaint();
			Graphpanel_2.repaint();
			
			
			//��ư �������� ������ �г� �����°� ����
			if(Graphpanel_2.isVisible()==true) {
				Graphpanel.setVisible(false);
			}else if(Graphpanel.isVisible()==true) {
				Graphpanel_2.setVisible(false);
			}
			
			
			}
		});

		btnApply.setBounds(343, 284, 97, 23);
		this.add(btnApply);

		// ���� �׷���
		btnNewButton = new JButton("���� �׷���");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphpanel.setVisible(true);
				Graphpanel_2.setVisible(false);
				
				
			}
		});
		btnNewButton.setBounds(498, 206, 126, 23);
		this.add(btnNewButton);

		// ������
		// �׷���///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		btnGraphType = new JButton("������ �׷���");
		btnGraphType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphpanel.setVisible(false);
				Graphpanel_2.setVisible(true);
				
			}
		});
		btnGraphType.setBounds(498, 239, 126, 23);
		this.add(btnGraphType);

		// ���� ��ư
		JButton btnExit = new JButton("����");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(527, 327, 97, 23);
		this.add(btnExit);

		JLabel lblSerch = new JLabel("���� �˻�");
		lblSerch.setBounds(27, 319, 57, 15);
		this.add(lblSerch);

		// sample list
		String Arealist[] = { "������", "���ϱ�", "������" };
		JComboBox comboBox = new JComboBox(Arealist);
		comboBox.setBounds(96, 317, 116, 19);
		this.add(comboBox);
	}

	private void graphInit() {
		Graphpanel = new MainGraph_Stick();
		Graphpanel.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel.setBounds(27, 48, 447, 214);
		this.add(Graphpanel);

	/*
		Graphpanel.setNO2(22);
		Graphpanel.setOZ(75);
		Graphpanel.setCO2(140);
		Graphpanel.setSO2(25);
		Graphpanel.setFd(155);
		Graphpanel.setUd(130);
		*/
	}
	
	private void graphInit_2() {
		Graphpanel_2 = new MainGraph_Polygonal();
		Graphpanel_2.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel_2.setBounds(27, 48, 447, 214);
		this.add(Graphpanel_2);

		Graphpanel_2.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel_2.setBounds(27, 48, 447, 214);
		Graphpanel_2.setBackground(Color.DARK_GRAY);
		this.add(Graphpanel_2);
		//������ �̷�������.
		//int temp[]= {100,120,40,100,80,60,60};
		//((Draw_M_Graph2) Graphpanel2).setNO2(temp);
		
		Graphpanel_2.setVisible(false);
		
	}
	
}
