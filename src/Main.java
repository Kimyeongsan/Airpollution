import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

class Mainpanel extends JPanel {

	private JButton btnNewButton;
	private JButton btnGraphType;
	private JComboBox start_Month, start_Date, end_Month, end_Date;
	
	public Mainpanel() {
		JPanel Mainpanel = new JPanel();
		final Graphpanel_1 graphpanel_1 = new Graphpanel_1();
		final Graphpanel_2 graphpanel_2 = new Graphpanel_2();

		Mainpanel.setBackground(new Color(225, 240, 255));
		Mainpanel.setBounds(0, 0, 636, 360);
		Mainpanel.setLayout(null);

		JLabel tilte = new JLabel("Air Pollution");
		tilte.setFont(new Font("Arial", Font.BOLD, 30));
		tilte.setForeground(new Color(0, 35, 110));
		tilte.setHorizontalAlignment(JLabel.CENTER);
		tilte.setBounds(180, 10, 270, 28);
		add(tilte);

		JLabel lblDay = new JLabel("��¥ �Է�");
		lblDay.setBounds(27, 288, 57, 15);
		Mainpanel.add(lblDay);

		// ���� ��¥
		String MonthList[] = new String[12];
		for (int m = 1; m < 13; m++) {
			MonthList[m - 1] = Integer.toString(m) + "��";
		}

		start_Month = new JComboBox(MonthList);
		start_Month.setBounds(96, 285, 116, 21);
		start_Month.setSize(new Dimension(55, 20));
		Mainpanel.add(start_Month);

		// ��¥ ����Ʈ
		String DateList[] = new String[31];
		for (int d = 1; d < 32; d++) {
			DateList[d - 1] = Integer.toString(d) + "��";
		}

		// ���� ��¥
		start_Date = new JComboBox(DateList);
		start_Date.setBounds(155, 285, 116, 21);
		start_Date.setSize(new Dimension(55, 20));
		Mainpanel.add(start_Date);

		// �Ⱓ(~) ��
		JLabel termLabel = new JLabel(" ~ ");
		termLabel.setBounds(210, 288, 57, 15);
		Mainpanel.add(termLabel);

		// �� ��¥
		end_Month = new JComboBox(MonthList);
		end_Month.setBounds(224, 285, 116, 21);
		end_Month.setSize(new Dimension(55, 20));
		Mainpanel.add(end_Month);

		end_Date = new JComboBox(DateList);
		end_Date.setBounds(284, 285, 116, 21);
		end_Date.setSize(new Dimension(55, 20));
		Mainpanel.add(end_Date);

		JButton btnApply = new JButton("��¥ ����");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnApply.setBounds(343, 284, 97, 23);
		Mainpanel.add(btnApply);
		

		// ���� �׷���
		Mainpanel.add(graphpanel_1);
		
		btnNewButton = new JButton("����׷���");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				graphpanel_1.setVisible(true);

			}
		});
		btnNewButton.setBounds(498, 206, 126, 23);
		Mainpanel.add(btnNewButton);
		
		
		// ������
		// �׷���///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Mainpanel.add(graphpanel_2);
		
		btnGraphType = new JButton("�׷��� Ÿ��2");
		btnGraphType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				graphpanel_1.setVisible(false);
				graphpanel_2.setVisible(true);
			}
		});
		btnGraphType.setBounds(498, 239, 126, 23);
		Mainpanel.add(btnGraphType);

		// ���� ��ư
		JButton btnExit = new JButton("����");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(527, 327, 97, 23);
		Mainpanel.add(btnExit);

		JLabel lblSerch = new JLabel("���� �˻�");
		lblSerch.setBounds(27, 319, 57, 15);
		Mainpanel.add(lblSerch);

		// sample list
		String Arealist[] = { "������", "���ϱ�", "������" };
		JComboBox comboBox = new JComboBox(Arealist);
		comboBox.setBounds(96, 317, 116, 19);
		Mainpanel.add(comboBox);

	}
}

class Graphpanel_1 extends JPanel {
	public Graphpanel_1() {
		JLabel Graphpanel_1 = new JLabel();

		Graphpanel_1.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel_1.setBounds(27, 48, 447, 214);
		add(Graphpanel_1);

		MainGraph_Stick mainGraph_Stick = new MainGraph_Stick();
		add(mainGraph_Stick);

	}
}

class Graphpanel_2 extends JPanel {
	public Graphpanel_2() {
		JLabel Graphpanel_2 = new JLabel();

		Graphpanel_2.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel_2.setBounds(27, 48, 447, 214);
		Graphpanel_2.setBackground(Color.DARK_GRAY);
		add(Graphpanel_2);

		MainGraph_Polygonal mainGraph_Polygonal = new MainGraph_Polygonal();
		add(mainGraph_Polygonal);

	}
}

public class Main extends JFrame {
	static JMenuBar mb;
	static JMenu x;
	static JMenuItem m1, m2, m3;
	JFrame frame = new JFrame();

	public Main() {
		frame.setTitle("Air Pollution Project");
		frame.setLocation(500, 200);
		frame.setSize(575, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Mainpanel Mainpanel = new Mainpanel();
		frame.add(Mainpanel);

		////// �޴��� ����
		mb = new JMenuBar();
		x = new JMenu("Menu");

		m1 = new JMenuItem("Main ȭ��");
		m2 = new JMenuItem("������ ������ ��");
		m3 = new JMenuItem("�̼����� ���� �� ��");

		x.add(m1);
		x.add(m2);
		x.add(m3);

		mb.add(x);

		frame.setJMenuBar(mb);
		frame.setSize(500, 500);
		frame.setVisible(true);

		m1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				m1.setVisible(true);
				m2.setVisible(false);
				m3.setVisible(false);
			}
		});

		m2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				m1.setVisible(false);
				m2.setVisible(true);
				m3.setVisible(false);
			}
		});

		m3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				m1.setVisible(false);
				m2.setVisible(false);
				m3.setVisible(true);
			}
		});
	}

	public static void main(String[] args) {
		new Main();
	}
}
