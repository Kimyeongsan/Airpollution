<<<<<<< HEAD
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//����ȭ�鿡 ���� �׷��� Ŭ����
class Draw_M_Graph1 extends JPanel {
	// ���� ������ ���⿡ ����

	int NO2 = 100;
	int OZ = 70;
	int CO2 = 32;
	int SO2 = 22;
	int Fd = 45;
	int Ud = 100;

	// ���� �̰ɷ� �����Ϸ��� �ߴµ� �۵�������~~ ����� �ؾ���~~

	public void setNO2(int x) {
		this.NO2 = x;
	}

	public void setOZ(int x) {
		this.OZ = x;
	}

	public void setCO2(int x) {
		this.CO2 = x;
	}

	public void setSO2(int x) {
		this.SO2 = x;
	}

	public void setFd(int x) {
		this.Fd = x;
	}

	public void setUd(int x) {
		this.Ud = x;
	}

	@Override
	public void paintComponent(Graphics g) { // drawXXX ���� fillXXX�� ���ΰ� ä����.
		super.paintComponent(g);

		g.setColor(Color.BLACK);// ����
		g.drawString("NO2", 5, 20);// ����,x��ǥ,y��ǥ
		g.setColor(Color.ORANGE);
		g.fillRect(80, 7, NO2, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("OZ", 5, 50);// ����,x��ǥ,y��ǥ
		g.setColor(Color.GREEN);
		g.fillRect(80, 37, OZ, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("CO2", 5, 80);// ����,x��ǥ,y��ǥ
		g.setColor(Color.ORANGE);
		g.fillRect(80, 67, CO2, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("SO2", 5, 110);// ����,x��ǥ,y��ǥ
		g.setColor(Color.GREEN);
		g.fillRect(80, 97, SO2, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("Fd", 5, 140);// ����,x��ǥ,y��ǥ
		g.setColor(Color.ORANGE);
		g.fillRect(80, 127, Fd, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("Ud", 5, 170);// ����,x��ǥ,y��ǥ
		g.setColor(Color.GREEN);
		g.fillRect(80, 157, Ud, 20);

	}
}

//���ο� ���� ������ �׷���
class Draw_M_Graph2 extends JPanel {
	// ���� ������ ���⿡ ����
//�ְ���� 0, �������� 160
//160-[�����]->Y��ǥ�� ���?
//������ ���� 0 �ְ� 150
	int[] NO2 = { 0, 60, 70, 75, 85, 80, 150 };
	int[] OZ = { 70, 75, 80, 85, 50, 55, 60 };
	int[] CO2 = { 30, 25, 40, 55, 65, 70, 80 };
	int[] SO2 = {90,100,117,120,130,110,100};
	int[] Fd = {100,126,96,98,86,104,115};
	int[] Ud = {50,60,70,50,70,90,100};

	// ���� �̰ɷ� �����Ϸ��� �ߴµ� �۵�������~~ ����� �ؾ���~~
	
	//�� �����ε� �迭�� �޾Ƽ� yy����
	public void setNO2(int arr[]) {
		for(int i=0;i<=6;i++) {
			this.NO2[i]=arr[i];
		}
	}

	public void setOZ(int arr[]) {
		for(int i=0;i<=6;i++) {
			this.OZ[i]=arr[i];
		}
	}

	public void setCO2(int arr[]) {
		for(int i=0;i<=6;i++) {
			this.CO2[i]=arr[i];
		}
	}

	public void setSO2(int arr[]) {
		//this.SO2 = x;
		for(int i=0;i<=6;i++) {
			this.SO2[i]=arr[i];
		}
	}

	public void setFd(int arr[]) {
		//this.Fd = x;
		for(int i=0;i<=6;i++) {
			this.Fd[i]=arr[i];
		}
	}

	public void setUd(int arr[]) {
		//this.Ud = x;
		for(int i=0;i<=6;i++) {
			this.Ud[i]=arr[i];
		}
	}
	

	@Override
	public void paintComponent(Graphics g) { // drawXXX ���� fillXXX�� ���ΰ� ä����.
		super.paintComponent(g);

		// ����Y��
		g.setColor(Color.PINK);// ����
		g.drawString("NO2", 5, 20);// ����,x��ǥ,y��ǥ
		g.setColor(Color.RED);// ����
		g.drawString("OZ", 5, 50);// ����,x��ǥ,y��ǥ
		g.setColor(Color.YELLOW);// ����
		g.drawString("CO2", 5, 80);// ����,x��ǥ,y��ǥ
		g.setColor(Color.GREEN);// ����
		g.drawString("SO2", 5, 110);// ����,x��ǥ,y��ǥ
		g.setColor(Color.BLUE);// ����
		g.drawString("Fd", 5, 140);// ����,x��ǥ,y��ǥ
		g.setColor(Color.WHITE);// ����
		g.drawString("Ud", 5, 170);// ����,x��ǥ,y��ǥ

		// �Ⱓ 1~7�� X��
		g.drawString("DAY1", 50, 200);// ����,x��ǥ,y��ǥ
		g.drawString("DAY2", 100, 200);
		g.drawString("DAY3", 150, 200);
		g.drawString("DAY4", 200, 200);
		g.drawString("DAY5", 250, 200);
		g.drawString("DAY6", 300, 200);
		g.drawString("DAY7", 350, 200);

		int x1 = 60;// �ʱ� x��ǥ

/////////////NO2����

		// ���� �ݺ������� ����//
		for (int i = 0; i <= 6; i++) {
			g.setColor(Color.PINK);
			g.fillOval(x1, 160-NO2[i], 5, 5);
			x1 += 50;
		}
		x1 = 60;// �ٽ� x �ʱ� ������ ����
		// ���� �ݺ����� ����
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, 160-(NO2[i] - 3), x1 + 50, 160-(NO2[i + 1] - 3));
			x1 += 50;
		}
		x1 = 60;//

//////////////////Oz�׷��� ����
		g.setColor(Color.RED);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-OZ[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, 160-(OZ[i]- 3), x1 + 50, 160-(OZ[i + 1] -3));
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ

//////////////////CO2�׷��� ����
		g.setColor(Color.YELLOW);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-CO2[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			//g.drawLine(x1, CO2[i] + 3, x1 + 50, CO2[i + 1] + 3);
			g.drawLine(x1, 160-(CO2[i]- 3), x1 + 50, 160-(CO2[i + 1] -3));
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ
		
/////////SO2����
		g.setColor(Color.GREEN);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-SO2[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
		//	g.drawLine(x1, SO2[i] + 3, x1 + 50, SO2[i + 1] + 3);
			g.drawLine(x1, 160-(SO2[i]- 3), x1 + 50, 160-(SO2[i + 1] -3));
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ

//////////////Fd ����
		g.setColor(Color.BLUE);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-Fd[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
		//	g.drawLine(x1, Fd[i] + 3, x1 + 50, Fd[i + 1] + 3); //���� �Լ��� Ȥ�� �𸣴� ���ܵ���
			g.drawLine(x1, 160-(Fd[i]- 3), x1 + 50, 160-(Fd[i + 1] -3));
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ
//////////Ud
		g.setColor(Color.WHITE);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-Ud[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			//g.drawLine(x1, Ud[i] + 3, x1 + 50, Ud[i + 1] + 3);
			g.drawLine(x1, 160-(Ud[i]- 3), x1 + 50, 160-(Ud[i + 1] -3));
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ
	}
}

//��ȭ�鿡 �� �׷��� Ŭ����
class Draw_C_Graph1 extends JPanel {
	// ���� ������ ���⿡ ����
	int Fd = 45;
	int Ud = 100;
	
	
	public void setFd(int x) {
		this.Fd = x;
	}

	public void setUd(int x) {
		this.Ud = x;
	}

	@Override
	public void paintComponent(Graphics g) { // drawXXX ���� fillXXX�� ���ΰ� ä����.
		super.paintComponent(g);

		g.setColor(Color.BLACK);// ����
		g.drawString("�̼�����", 5, 50);// ����,x��ǥ,y��ǥ
		g.setColor(Color.ORANGE);
		g.fillRect(80, 37, Fd, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("�ʹ̼�����", 5, 100);// ����,x��ǥ,y��ǥ
		g.setColor(Color.GREEN);
		g.fillRect(80, 87, Ud, 20);
	}
}

public class Mains {

	private JFrame frame;
	private JTextField textField_main1;
	private JTextField textField_main2;
	private JButton btnNewButton;
	private JButton btnGraphType;
	private JTextField textField_A1;
	private JTextField textField_D1;
	private JTextField textField_A2;
	private JTextField textField_D2;
	private JComboBox start_Month, start_Date, end_Month, end_Date;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mains window = new Mains();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mains() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// ������ ������ �� �г�
		final JPanel Pollutionpanel = new JPanel(); // Pollution panel ȭ��
		Pollutionpanel.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(Pollutionpanel);
		Pollutionpanel.setLayout(null);

		// �̼����� ������ �� �� �г� Ÿ��Ʋ
		JLabel PollutionLabel = new JLabel("Local Pollution degree of risk");
		PollutionLabel.setFont(new Font("Arial", Font.BOLD, 25));
		PollutionLabel.setForeground(Color.BLUE);
		PollutionLabel.setHorizontalAlignment(JLabel.CENTER);
		PollutionLabel.setBounds(118, 10, 393, 28);
		Pollutionpanel.add(PollutionLabel);

		// ���� ȭ�� �г�
		final JPanel Mainpanel = new JPanel();
		Mainpanel.setBackground(new Color(225, 240, 255));
		Mainpanel.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(Mainpanel);
		Mainpanel.setLayout(null);

		// ���� ȭ�� ��
		JLabel tilteLabel = new JLabel("Air Pollution");
		tilteLabel.setFont(new Font("Arial", Font.BOLD, 30));
		tilteLabel.setForeground(new Color(0, 35, 110));
		tilteLabel.setHorizontalAlignment(JLabel.CENTER);
		tilteLabel.setBounds(180, 10, 270, 28);
		Mainpanel.add(tilteLabel);

		// Graph����
		// ���/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		final JPanel Graphpanel = new Draw_M_Graph1();
		Graphpanel.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel.setBounds(27, 48, 447, 214);
		Mainpanel.add(Graphpanel);
		// ���� �׽�Ʈ
		/// *
		((Draw_M_Graph1) Graphpanel).setNO2(22);// ���Ĳ� �̷��� �����ϸ� �ѹ��̳�
		((Draw_M_Graph1) Graphpanel).setOZ(75);
		((Draw_M_Graph1) Graphpanel).setCO2(140);
		((Draw_M_Graph1) Graphpanel).setSO2(25);
		((Draw_M_Graph1) Graphpanel).setFd(155);
		((Draw_M_Graph1) Graphpanel).setUd(130);
		// */

		// Graph ������
		
		final JPanel Graphpanel2 = new Draw_M_Graph2();
		Graphpanel2.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel2.setBounds(27, 48, 447, 214);
		Graphpanel2.setBackground(Color.DARK_GRAY);
		Mainpanel.add(Graphpanel2);
		//������ �̷�������.
		//int temp[]= {100,120,40,100,80,60,60};
		//((Draw_M_Graph2) Graphpanel2).setNO2(temp);
		Graphpanel2.setVisible(false);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
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

		// ���� ��¥
		/*
		 * textField_main1 = new JTextField(); textField_main1.setBounds(160, 285, 106,
		 * 21); textField_main1.setSize(new Dimension(50, 20));
		 * textField_main1.setColumns(5); Mainpanel.add(textField_main1);
		 */

		// ������ ��¥
		/*
		 * textField_main2 = new JTextField(); textField_main2.setBounds(224, 285, 107,
		 * 21); textField_main2.setColumns(10); Mainpanel.add(textField_main2);
		 */

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
		btnNewButton = new JButton("����׷���");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphpanel.setVisible(true);

			}
		});
		btnNewButton.setBounds(498, 206, 126, 23);
		Mainpanel.add(btnNewButton);

		// ������
		// �׷���///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		btnGraphType = new JButton("�׷��� Ÿ��2");
		btnGraphType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphpanel.setVisible(false);
				;
				Graphpanel2.setVisible(true);
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

/////////////////////////////������ ������ �� �г�/////////////////////////////////////////////////////////////////////////////////�伭
		final JPanel Comparepanel = new JPanel();
		Comparepanel.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(Comparepanel);
		Comparepanel.setLayout(null);

		// ������ ������ ȭ�� Ÿ��Ʋ
		JLabel CompareNewLabel = new JLabel("Pollution Compare");
		CompareNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		CompareNewLabel.setForeground(Color.BLUE);
		CompareNewLabel.setHorizontalAlignment(JLabel.CENTER);
		CompareNewLabel.setBounds(192, 10, 245, 30);
		Comparepanel.add(CompareNewLabel);
		/*
		 * JPanel first_compareGraph = new JPanel();//// �׷��� 1 �� �г�////////////
		 * first_compareGraph.setBounds(38, 131, 228, 200);
		 * first_compareGraph.setBorder(BorderFactory.createLineBorder(Color.red));
		 * Comparepanel.add(first_compareGraph); // first_compareGraph.add(new
		 * JLabel("NO2"));
		 */
		JLabel fisrt_compareLabel = new JLabel("��������A");
		fisrt_compareLabel.setBounds(38, 64, 63, 15);
		Comparepanel.add(fisrt_compareLabel);

		//// ��������1
		JComboBox comboBoxArea1 = new JComboBox(Arealist);
		comboBoxArea1.setBounds(113, 61, 96, 21);
		Comparepanel.add(comboBoxArea1);
		//// ��������2
		JComboBox comboBoxArea2 = new JComboBox(Arealist);
		comboBoxArea2.setBounds(440, 61, 96, 21);
		Comparepanel.add(comboBoxArea2);

		JLabel lblNewLabel_2 = new JLabel("��¥ �Է�");
		lblNewLabel_2.setBounds(38, 101, 63, 15);
		Comparepanel.add(lblNewLabel_2);
		/*
		 * JPanel second_comparGraph = new JPanel();//// �׷��� 2�� �г�///////////
		 * second_comparGraph.setBounds(382, 131, 228, 200);
		 * second_comparGraph.setBorder(BorderFactory.createLineBorder(Color.red));
		 * Comparepanel.add(second_comparGraph);
		 */
		JLabel lblNewLabel_3 = new JLabel("��������B");
		lblNewLabel_3.setBounds(360, 64, 68, 15);
		Comparepanel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("��¥ �Է�");
		lblNewLabel_4.setBounds(360, 101, 68, 15);
		Comparepanel.add(lblNewLabel_4);
		//
		// �׷��� �õ��غ���
		// �� �׷��� �׷��� Ŭ����1
		// �̰Ŷ� ���� �� �ϳ� ������ 2�� ������

		JPanel first_compareGraph_R = new Draw_C_Graph1();//// �׷��� 1 �� �г�////////////
		first_compareGraph_R.setBounds(38, 131, 228, 200);
		first_compareGraph_R.setBorder(BorderFactory.createLineBorder(Color.red));
		// �� ������ �̷�������
		((Draw_C_Graph1) first_compareGraph_R).setFd(12);
		((Draw_C_Graph1) first_compareGraph_R).setFd(32);

		Comparepanel.add(first_compareGraph_R);
		first_compareGraph_R.setVisible(true);

		JPanel second_comparGraph = new Draw_C_Graph1();//// �׷��� 2�� �г�///////////
		second_comparGraph.setBounds(382, 131, 228, 200);
		second_comparGraph.setBorder(BorderFactory.createLineBorder(Color.red));
		Comparepanel.add(second_comparGraph);
		((Draw_C_Graph1) second_comparGraph).setFd(70);
		((Draw_C_Graph1) second_comparGraph).setUd(30);
		// Draw_C_Graph2 �����ص� ��.
		// ((Draw_C_Graph2) second_comparGraph).setFd(99);
		// ((Draw_C_Graph2) second_comparGraph).setFd(127);

		/*
		 * setSize(800, 600); setContentPane(new Test02());
		 * 
		 * setVisible(true);
		 */

//�̽ĵ� �׷��� �׷��� �ǳ�

//ù �� �ǳڿ� �߰����ֱ�

//      button.addActionListener(new DrawActionListener(text1, text2, text3, drawingPanel));

		//

		// ù��° ��¥ �Է�
		textField_D1 = new JTextField();
		textField_D1.setBounds(113, 98, 96, 21);
		Comparepanel.add(textField_D1);
		textField_D1.setColumns(10);

		// �ι�° ��¥ �Է�
		textField_D2 = new JTextField();
		textField_D2.setBounds(440, 98, 96, 21);
		Comparepanel.add(textField_D2);
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
		Comparepanel.add(btnCompareSet);

		Comparepanel.setVisible(false); // Compare panel ������ ���߱�

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Pollutionpanel.setVisible(false); // Pollution panel ������ ���߱�

		JMenuBar menuBar = new JMenuBar(); // Menu bar ����
		menuBar.setBackground(new Color(0, 35, 110));
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Menu");
		mnNewMenu.setForeground(Color.WHITE);
		mnNewMenu.setFont(new Font("����", Font.BOLD, 15));
		menuBar.add(mnNewMenu);

		JMenuItem mainNewMenuItem = new JMenuItem("���θ޴�");
		mnNewMenu.add(mainNewMenuItem);
		mainNewMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Mainpanel.setVisible(true);
				Comparepanel.setVisible(false);
				Pollutionpanel.setVisible(false);
			}
		});

		JMenuItem CompareMenuItem = new JMenuItem("������ ������ ��");
		mnNewMenu.add(CompareMenuItem);
		CompareMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Mainpanel.setVisible(false);
				Comparepanel.setVisible(true);
				Pollutionpanel.setVisible(false);
			}
		});

		JMenuItem PollutionMenuItem = new JMenuItem("�̼����� ���� �� ��");
		mnNewMenu.add(PollutionMenuItem);
		PollutionMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Mainpanel.setVisible(false);
				Comparepanel.setVisible(false);
				Pollutionpanel.setVisible(true);
			}
		});
	}
=======
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//����ȭ�鿡 ���� �׷��� Ŭ����
class Draw_M_Graph1 extends JPanel {
	// ���� ������ ���⿡ ����

	int NO2 = 100;
	int OZ = 70;
	int CO2 = 32;
	int SO2 = 22;
	int Fd = 45;
	int Ud = 100;

	// ���� �̰ɷ� �����Ϸ��� �ߴµ� �۵�������~~ ����� �ؾ���~~

	public void setNO2(int x) {
		this.NO2 = x;
	}

	public void setOZ(int x) {
		this.OZ = x;
	}

	public void setCO2(int x) {
		this.CO2 = x;
	}

	public void setSO2(int x) {
		this.SO2 = x;
	}

	public void setFd(int x) {
		this.Fd = x;
	}

	public void setUd(int x) {
		this.Ud = x;
	}

	@Override
	public void paintComponent(Graphics g) { // drawXXX ���� fillXXX�� ���ΰ� ä����.
		super.paintComponent(g);

		g.setColor(Color.BLACK);// ����
		g.drawString("NO2", 5, 20);// ����,x��ǥ,y��ǥ
		g.setColor(Color.ORANGE);
		g.fillRect(80, 7, NO2, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("OZ", 5, 50);// ����,x��ǥ,y��ǥ
		g.setColor(Color.GREEN);
		g.fillRect(80, 37, OZ, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("CO2", 5, 80);// ����,x��ǥ,y��ǥ
		g.setColor(Color.ORANGE);
		g.fillRect(80, 67, CO2, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("SO2", 5, 110);// ����,x��ǥ,y��ǥ
		g.setColor(Color.GREEN);
		g.fillRect(80, 97, SO2, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("Fd", 5, 140);// ����,x��ǥ,y��ǥ
		g.setColor(Color.ORANGE);
		g.fillRect(80, 127, Fd, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("Ud", 5, 170);// ����,x��ǥ,y��ǥ
		g.setColor(Color.GREEN);
		g.fillRect(80, 157, Ud, 20);

	}
}

//���ο� ���� ������ �׷���
class Draw_M_Graph2 extends JPanel {
	// ���� ������ ���⿡ ����
//�ְ���� 0, �������� 160
//160-[�����]->Y��ǥ�� ���?
//������ ���� 0 �ְ� 150
	int[] NO2 = { 0, 60, 70, 75, 85, 80, 150 };
	int[] OZ = { 70, 75, 80, 85, 50, 55, 60 };
	int[] CO2 = { 30, 25, 40, 55, 65, 70, 80 };
	int[] SO2 = {90,100,117,120,130,110,100};
	int[] Fd = {100,126,96,98,86,104,115};
	int[] Ud = {50,60,70,50,70,90,100};

	// ���� �̰ɷ� �����Ϸ��� �ߴµ� �۵�������~~ ����� �ؾ���~~
	
	//�� �����ε� �迭�� �޾Ƽ� �y�y����
	public void setNO2(int arr[]) {
		for(int i=0;i<=6;i++) {
			this.NO2[i]=arr[i];
		}
	}

	public void setOZ(int arr[]) {
		for(int i=0;i<=6;i++) {
			this.OZ[i]=arr[i];
		}
	}

	public void setCO2(int arr[]) {
		for(int i=0;i<=6;i++) {
			this.CO2[i]=arr[i];
		}
	}

	public void setSO2(int arr[]) {
		//this.SO2 = x;
		for(int i=0;i<=6;i++) {
			this.SO2[i]=arr[i];
		}
	}

	public void setFd(int arr[]) {
		//this.Fd = x;
		for(int i=0;i<=6;i++) {
			this.Fd[i]=arr[i];
		}
	}

	public void setUd(int arr[]) {
		//this.Ud = x;
		for(int i=0;i<=6;i++) {
			this.Ud[i]=arr[i];
		}
	}
	

	@Override
	public void paintComponent(Graphics g) { // drawXXX ���� fillXXX�� ���ΰ� ä����.
		super.paintComponent(g);

		// ����Y��
		g.setColor(Color.PINK);// ����
		g.drawString("NO2", 5, 20);// ����,x��ǥ,y��ǥ
		g.setColor(Color.RED);// ����
		g.drawString("OZ", 5, 50);// ����,x��ǥ,y��ǥ
		g.setColor(Color.YELLOW);// ����
		g.drawString("CO2", 5, 80);// ����,x��ǥ,y��ǥ
		g.setColor(Color.GREEN);// ����
		g.drawString("SO2", 5, 110);// ����,x��ǥ,y��ǥ
		g.setColor(Color.BLUE);// ����
		g.drawString("Fd", 5, 140);// ����,x��ǥ,y��ǥ
		g.setColor(Color.WHITE);// ����
		g.drawString("Ud", 5, 170);// ����,x��ǥ,y��ǥ

		// �Ⱓ 1~7�� X��
		g.drawString("DAY1", 50, 200);// ����,x��ǥ,y��ǥ
		g.drawString("DAY2", 100, 200);
		g.drawString("DAY3", 150, 200);
		g.drawString("DAY4", 200, 200);
		g.drawString("DAY5", 250, 200);
		g.drawString("DAY6", 300, 200);
		g.drawString("DAY7", 350, 200);

		int x1 = 60;// �ʱ� x��ǥ

/////////////NO2����

		// ���� �ݺ������� ����//
		for (int i = 0; i <= 6; i++) {
			g.setColor(Color.PINK);
			g.fillOval(x1, 160-NO2[i], 5, 5);
			x1 += 50;
		}
		x1 = 60;// �ٽ� x �ʱ� ������ ����
		// ���� �ݺ����� ����
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, 160-(NO2[i] - 3), x1 + 50, 160-(NO2[i + 1] - 3));
			x1 += 50;
		}
		x1 = 60;//

//////////////////Oz�׷��� ����
		g.setColor(Color.RED);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-OZ[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, 160-(OZ[i]- 3), x1 + 50, 160-(OZ[i + 1] -3));
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ

//////////////////CO2�׷��� ����
		g.setColor(Color.YELLOW);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-CO2[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			//g.drawLine(x1, CO2[i] + 3, x1 + 50, CO2[i + 1] + 3);
			g.drawLine(x1, 160-(CO2[i]- 3), x1 + 50, 160-(CO2[i + 1] -3));
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ
		
/////////SO2����
		g.setColor(Color.GREEN);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-SO2[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
		//	g.drawLine(x1, SO2[i] + 3, x1 + 50, SO2[i + 1] + 3);
			g.drawLine(x1, 160-(SO2[i]- 3), x1 + 50, 160-(SO2[i + 1] -3));
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ

//////////////Fd ����
		g.setColor(Color.BLUE);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-Fd[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
		//	g.drawLine(x1, Fd[i] + 3, x1 + 50, Fd[i + 1] + 3); //���� �Լ��� Ȥ�� �𸣴� ���ܵ���
			g.drawLine(x1, 160-(Fd[i]- 3), x1 + 50, 160-(Fd[i + 1] -3));
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ
//////////Ud
		g.setColor(Color.WHITE);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-Ud[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			//g.drawLine(x1, Ud[i] + 3, x1 + 50, Ud[i + 1] + 3);
			g.drawLine(x1, 160-(Ud[i]- 3), x1 + 50, 160-(Ud[i + 1] -3));
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ
	}
}

//��ȭ�鿡 �� �׷��� Ŭ����
class Draw_C_Graph1 extends JPanel {
	// ���� ������ ���⿡ ����
	int Fd = 45;
	int Ud = 100;
	
	
	public void setFd(int x) {
		this.Fd = x;
	}

	public void setUd(int x) {
		this.Ud = x;
	}

	@Override
	public void paintComponent(Graphics g) { // drawXXX ���� fillXXX�� ���ΰ� ä����.
		super.paintComponent(g);

		g.setColor(Color.BLACK);// ����
		g.drawString("�̼�����", 5, 50);// ����,x��ǥ,y��ǥ
		g.setColor(Color.ORANGE);
		g.fillRect(80, 37, Fd, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("�ʹ̼�����", 5, 100);// ����,x��ǥ,y��ǥ
		g.setColor(Color.GREEN);
		g.fillRect(80, 87, Ud, 20);
	}
}

public class Mains {

	private JFrame frame;
	private JTextField textField_main1;
	private JTextField textField_main2;
	private JButton btnNewButton;
	private JButton btnGraphType;
	private JTextField textField_A1;
	private JTextField textField_D1;
	private JTextField textField_A2;
	private JTextField textField_D2;
	private JComboBox start_Month, start_Date, end_Month, end_Date;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mains window = new Mains();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mains() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// ������ ������ �� �г�
		final JPanel Pollutionpanel = new JPanel(); // Pollution panel ȭ��
		Pollutionpanel.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(Pollutionpanel);
		Pollutionpanel.setLayout(null);

		// �̼����� ������ �� �� �г� Ÿ��Ʋ
		JLabel PollutionLabel = new JLabel("Local Pollution degree of risk");
		PollutionLabel.setFont(new Font("Arial", Font.BOLD, 25));
		PollutionLabel.setForeground(Color.BLUE);
		PollutionLabel.setHorizontalAlignment(JLabel.CENTER);
		PollutionLabel.setBounds(118, 10, 393, 28);
		Pollutionpanel.add(PollutionLabel);

		// ���� ȭ�� �г�
		final JPanel Mainpanel = new JPanel();
		Mainpanel.setBackground(new Color(225, 240, 255));
		Mainpanel.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(Mainpanel);
		Mainpanel.setLayout(null);

		// ���� ȭ�� ��
		JLabel tilteLabel = new JLabel("Air Pollution");
		tilteLabel.setFont(new Font("Arial", Font.BOLD, 30));
		tilteLabel.setForeground(new Color(0, 35, 110));
		tilteLabel.setHorizontalAlignment(JLabel.CENTER);
		tilteLabel.setBounds(180, 10, 270, 28);
		Mainpanel.add(tilteLabel);

		// Graph����
		// ���/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		final JPanel Graphpanel = new Draw_M_Graph1();
		Graphpanel.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel.setBounds(27, 48, 447, 214);
		Mainpanel.add(Graphpanel);
		// ���� �׽�Ʈ
		/// *
		((Draw_M_Graph1) Graphpanel).setNO2(22);// ���Ĳ� �̷��� �����ϸ� �ѹ��̳�
		((Draw_M_Graph1) Graphpanel).setOZ(75);
		((Draw_M_Graph1) Graphpanel).setCO2(140);
		((Draw_M_Graph1) Graphpanel).setSO2(25);
		((Draw_M_Graph1) Graphpanel).setFd(155);
		((Draw_M_Graph1) Graphpanel).setUd(130);
		// */

		// Graph ������
		
		final JPanel Graphpanel2 = new Draw_M_Graph2();
		Graphpanel2.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel2.setBounds(27, 48, 447, 214);
		Graphpanel2.setBackground(Color.DARK_GRAY);
		Mainpanel.add(Graphpanel2);
		//������ �̷�������.
		//int temp[]= {100,120,40,100,80,60,60};
		//((Draw_M_Graph2) Graphpanel2).setNO2(temp);
		Graphpanel2.setVisible(false);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
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

		// ���� ��¥
		/*
		 * textField_main1 = new JTextField(); textField_main1.setBounds(160, 285, 106,
		 * 21); textField_main1.setSize(new Dimension(50, 20));
		 * textField_main1.setColumns(5); Mainpanel.add(textField_main1);
		 */

		// ������ ��¥
		/*
		 * textField_main2 = new JTextField(); textField_main2.setBounds(224, 285, 107,
		 * 21); textField_main2.setColumns(10); Mainpanel.add(textField_main2);
		 */

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
		btnNewButton = new JButton("����׷���");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphpanel.setVisible(true);

			}
		});
		btnNewButton.setBounds(498, 206, 126, 23);
		Mainpanel.add(btnNewButton);

		// ������
		// �׷���///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		btnGraphType = new JButton("�׷��� Ÿ��2");
		btnGraphType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphpanel.setVisible(false);
				;
				Graphpanel2.setVisible(true);
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

/////////////////////////////������ ������ �� �г�/////////////////////////////////////////////////////////////////////////////////�伭
		final JPanel Comparepanel = new JPanel();
		Comparepanel.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(Comparepanel);
		Comparepanel.setLayout(null);

		// ������ ������ ȭ�� Ÿ��Ʋ
		JLabel CompareNewLabel = new JLabel("Pollution Compare");
		CompareNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		CompareNewLabel.setForeground(Color.BLUE);
		CompareNewLabel.setHorizontalAlignment(JLabel.CENTER);
		CompareNewLabel.setBounds(192, 10, 245, 30);
		Comparepanel.add(CompareNewLabel);
		/*
		 * JPanel first_compareGraph = new JPanel();//// �׷��� 1 �� �г�////////////
		 * first_compareGraph.setBounds(38, 131, 228, 200);
		 * first_compareGraph.setBorder(BorderFactory.createLineBorder(Color.red));
		 * Comparepanel.add(first_compareGraph); // first_compareGraph.add(new
		 * JLabel("NO2"));
		 */
		JLabel fisrt_compareLabel = new JLabel("��������A");
		fisrt_compareLabel.setBounds(38, 64, 63, 15);
		Comparepanel.add(fisrt_compareLabel);

		//// ��������1
		JComboBox comboBoxArea1 = new JComboBox(Arealist);
		comboBoxArea1.setBounds(113, 61, 96, 21);
		Comparepanel.add(comboBoxArea1);
		//// ��������2
		JComboBox comboBoxArea2 = new JComboBox(Arealist);
		comboBoxArea2.setBounds(440, 61, 96, 21);
		Comparepanel.add(comboBoxArea2);

		JLabel lblNewLabel_2 = new JLabel("��¥ �Է�");
		lblNewLabel_2.setBounds(38, 101, 63, 15);
		Comparepanel.add(lblNewLabel_2);
		/*
		 * JPanel second_comparGraph = new JPanel();//// �׷��� 2�� �г�///////////
		 * second_comparGraph.setBounds(382, 131, 228, 200);
		 * second_comparGraph.setBorder(BorderFactory.createLineBorder(Color.red));
		 * Comparepanel.add(second_comparGraph);
		 */
		JLabel lblNewLabel_3 = new JLabel("��������B");
		lblNewLabel_3.setBounds(360, 64, 68, 15);
		Comparepanel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("��¥ �Է�");
		lblNewLabel_4.setBounds(360, 101, 68, 15);
		Comparepanel.add(lblNewLabel_4);
		//
		// �׷��� �õ��غ���
		// �� �׷��� �׷��� Ŭ����1
		// �̰Ŷ� ���� �� �ϳ� ������ 2�� ������

		JPanel first_compareGraph_R = new Draw_C_Graph1();//// �׷��� 1 �� �г�////////////
		first_compareGraph_R.setBounds(38, 131, 228, 200);
		first_compareGraph_R.setBorder(BorderFactory.createLineBorder(Color.red));
		// �� ������ �̷�������
		((Draw_C_Graph1) first_compareGraph_R).setFd(12);
		((Draw_C_Graph1) first_compareGraph_R).setFd(32);

		Comparepanel.add(first_compareGraph_R);
		first_compareGraph_R.setVisible(true);

		JPanel second_comparGraph = new Draw_C_Graph1();//// �׷��� 2�� �г�///////////
		second_comparGraph.setBounds(382, 131, 228, 200);
		second_comparGraph.setBorder(BorderFactory.createLineBorder(Color.red));
		Comparepanel.add(second_comparGraph);
		((Draw_C_Graph1) second_comparGraph).setFd(70);
		((Draw_C_Graph1) second_comparGraph).setUd(30);
		// Draw_C_Graph2 �����ص� ��.
		// ((Draw_C_Graph2) second_comparGraph).setFd(99);
		// ((Draw_C_Graph2) second_comparGraph).setFd(127);

		/*
		 * setSize(800, 600); setContentPane(new Test02());
		 * 
		 * setVisible(true);
		 */

//�̽ĵ� �׷��� �׷��� �ǳ�

//ù �� �ǳڿ� �߰����ֱ�

//      button.addActionListener(new DrawActionListener(text1, text2, text3, drawingPanel));

		//

		// ù��° ��¥ �Է�
		textField_D1 = new JTextField();
		textField_D1.setBounds(113, 98, 96, 21);
		Comparepanel.add(textField_D1);
		textField_D1.setColumns(10);

		// �ι�° ��¥ �Է�
		textField_D2 = new JTextField();
		textField_D2.setBounds(440, 98, 96, 21);
		Comparepanel.add(textField_D2);
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
		Comparepanel.add(btnCompareSet);

		Comparepanel.setVisible(false); // Compare panel ������ ���߱�

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Pollutionpanel.setVisible(false); // Pollution panel ������ ���߱�

		JMenuBar menuBar = new JMenuBar(); // Menu bar ����
		menuBar.setBackground(new Color(0, 35, 110));
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Menu");
		mnNewMenu.setForeground(Color.WHITE);
		mnNewMenu.setFont(new Font("����", Font.BOLD, 15));
		menuBar.add(mnNewMenu);

		JMenuItem mainNewMenuItem = new JMenuItem("���θ޴�");
		mnNewMenu.add(mainNewMenuItem);
		mainNewMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Mainpanel.setVisible(true);
				Comparepanel.setVisible(false);
				Pollutionpanel.setVisible(false);
			}
		});

		JMenuItem CompareMenuItem = new JMenuItem("������ ������ ��");
		mnNewMenu.add(CompareMenuItem);
		CompareMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Mainpanel.setVisible(false);
				Comparepanel.setVisible(true);
				Pollutionpanel.setVisible(false);
			}
		});

		JMenuItem PollutionMenuItem = new JMenuItem("�̼����� ���� �� ��");
		mnNewMenu.add(PollutionMenuItem);
		PollutionMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Mainpanel.setVisible(false);
				Comparepanel.setVisible(false);
				Pollutionpanel.setVisible(true);
			}
		});
	}
>>>>>>> branch 'master' of https://github.com/Kimyeongsan/Airpollution.git
}