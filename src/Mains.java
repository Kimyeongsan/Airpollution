import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



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

<<<<<<< HEAD
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 650, 430);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      
      //���� ȭ�� �г�
      final JPanel Mainpanel = new JPanel();
      Mainpanel.setBackground(new Color(225, 240, 255));
      Mainpanel.setBounds(0, 0, 636, 360);
      frame.getContentPane().add(Mainpanel);
      Mainpanel.setLayout(null);
      
      //���� ȭ�� ��
      JLabel tilteLabel = new JLabel("Air Pollution");
      tilteLabel.setFont(new Font("Arial", Font.BOLD, 30));
      tilteLabel.setForeground(new Color(0, 35, 110));
      tilteLabel.setHorizontalAlignment(JLabel.CENTER);
      tilteLabel.setBounds(180, 10, 270, 28);
      Mainpanel.add(tilteLabel);
      
      // Graph ���
      JPanel Graphpanel = new JPanel();
      Graphpanel.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
      Graphpanel.setBounds(27, 48, 447, 214);
      Mainpanel.add(Graphpanel);
      
      JLabel lblDay = new JLabel("��¥ �Է�");
      lblDay.setBounds(27, 288, 57, 15);
      Mainpanel.add(lblDay);
      
      //���� ��¥
      String MonthList[] = new String[12];
      for (int m = 1; m < 13; m++) {
    	  MonthList[m - 1] = Integer.toString(m) + "��";
      }
      
      //��¥ ����Ʈ
      String DateList[] = new String[31];
      for (int d = 1; d < 32; d++) {
    	  DateList[d - 1] = Integer.toString(d) + "��";
      }   
      
      start_Month = new JComboBox(MonthList);
      start_Month.setBounds(96, 285, 116, 21);
      start_Month.setSize(new Dimension(55,20));
      Mainpanel.add(start_Month);
      
      //���� ��¥
      start_Date = new JComboBox(DateList);
      start_Date.setBounds(155, 285, 116, 21);
      start_Date.setSize(new Dimension(55,20));
      Mainpanel.add(start_Date);
      
         //�Ⱓ(~) ��
         JLabel termLabel = new JLabel(" ~ ");
         termLabel.setBounds(210, 288, 57, 15);
         Mainpanel.add(termLabel);
         
         //�� ��¥
         end_Month = new JComboBox(MonthList);
         end_Month.setBounds(224, 285, 116, 21);
         end_Month.setSize(new Dimension(55,20));
         Mainpanel.add(end_Month);
         
         end_Date = new JComboBox(DateList);
         end_Date.setBounds(284, 285, 116, 21);
         end_Date.setSize(new Dimension(55,20));
         Mainpanel.add(end_Date);
         
      
      
      JButton btnApply = new JButton("��¥ ����");
      btnApply.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      
      btnApply.setBounds(343, 284, 97, 23);
      Mainpanel.add(btnApply);
      
      // ���� �׷���
      btnNewButton = new JButton("�׷��� Ÿ��1");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btnNewButton.setBounds(498, 206, 126, 23);
      Mainpanel.add(btnNewButton);
      
      // ������ �׷���
      btnGraphType = new JButton("�׷��� Ÿ��2");
      btnGraphType.setBounds(498, 239, 126, 23);
      Mainpanel.add(btnGraphType);
      
      //���� ��ư
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
      //sample list
      String Arealist[]= {"������","���ϱ�","������"};
      JComboBox comboBox = new JComboBox(Arealist);
      comboBox.setBounds(96, 317, 116, 19);
      Mainpanel.add(comboBox);
      
      //������ ������ �� �г�
      final JPanel Pollutionpanel = new JPanel(); // Pollution panel ȭ��
      Pollutionpanel.setBounds(0, 0, 636, 360);
      Pollutionpanel.setForeground(new Color(225, 240, 255));
      frame.getContentPane().add(Pollutionpanel);
      Pollutionpanel.setLayout(null);
      
      //�̼����� ������ �� �� �г� Ÿ��Ʋ
      JLabel PollutionLabel = new JLabel("Local Pollution degree of risk");
      PollutionLabel.setFont(new Font("Arial", Font.BOLD, 25));
      PollutionLabel.setForeground(Color.BLUE);
      PollutionLabel.setHorizontalAlignment(JLabel.CENTER);
      PollutionLabel.setBounds(118, 10, 393, 28);
      Pollutionpanel.add(PollutionLabel);
     
=======
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
>>>>>>> branch 'master' of https://github.com/Kimyeongsan/Airpollution.git

		// ������ ������ �� �г�
		final JPanel Pollutionpanel = new JPanel(); // Pollution panel ȭ��
		Pollutionpanel.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(Pollutionpanel);
		Pollutionpanel.setLayout(null);

<<<<<<< HEAD
      
       // ������ ��¥
     /*  textField_main2 = new JTextField();
       textField_main2.setBounds(224, 285, 107, 21);
       textField_main2.setColumns(10);
       Mainpanel.add(textField_main2);*/
      
      
      //������ ������ �� �г�
      final JPanel Comparepanel = new JPanel(); 
      Comparepanel.setBounds(0, 0, 636, 360);
      frame.getContentPane().add(Comparepanel);
      Comparepanel.setLayout(null);
      
      //������ ������ ȭ�� Ÿ��Ʋ
      JLabel CompareNewLabel = new JLabel("Pollution Compare");
      CompareNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
      CompareNewLabel.setForeground(Color.BLUE);
      CompareNewLabel.setHorizontalAlignment(JLabel.CENTER);
      CompareNewLabel.setBounds(192, 10, 245, 30);
      Comparepanel.add(CompareNewLabel);
      
      JPanel first_compareGraph = new JPanel();
      first_compareGraph.setBounds(38, 131, 228, 200);
      first_compareGraph.setBorder(BorderFactory.createLineBorder(Color.red));
      Comparepanel.add(first_compareGraph);
      
      JLabel fisrt_compareLabel = new JLabel("���� �Է�");
      fisrt_compareLabel.setBounds(38, 64, 63, 15);
      Comparepanel.add(fisrt_compareLabel);
      
      JLabel lblNewLabel_2 = new JLabel("��¥ �Է�");
      lblNewLabel_2.setBounds(38, 101, 63, 15);
      Comparepanel.add(lblNewLabel_2);
      
      //�� ����
      JPanel panel_2 = new JPanel();
      panel_2.setBounds(360, 131, 228, 200);
      panel_2.setBorder(BorderFactory.createLineBorder(Color.red));
      Comparepanel.add(panel_2);
      
      
      //ù��° ���� �Է�
      textField_A1 = new JTextField();
      textField_A1.setBounds(113, 61, 96, 21);
      Comparepanel.add(textField_A1);
      textField_A1.setColumns(10);
      //ù��° ��¥ �Է�
      textField_D1 = new JTextField();
      textField_D1.setBounds(113, 98, 96, 21);
      Comparepanel.add(textField_D1);
      textField_D1.setColumns(10);
      
      
      JLabel lblNewLabel_3 = new JLabel("���� �Է�");
      lblNewLabel_3.setBounds(360, 64, 68, 15);
      Comparepanel.add(lblNewLabel_3);
      
      JLabel lblNewLabel_4 = new JLabel("��¥ �Է�");
      lblNewLabel_4.setBounds(360, 101, 68, 15);
      Comparepanel.add(lblNewLabel_4);
      
      //�ι�° ���� �Է�
      textField_A2 = new JTextField();
      textField_A2.setBounds(440, 61, 96, 21);
      Comparepanel.add(textField_A2);
      textField_A2.setColumns(10);
      //�ι�° ��¥ �Է�
      textField_D2 = new JTextField();
      textField_D2.setBounds(440, 98, 96, 21);
      Comparepanel.add(textField_D2);
      textField_D2.setColumns(10);
      
      Comparepanel.setVisible(false); //Compare panel ������ ���߱� 
      Pollutionpanel.setVisible(false); //Pollution panel ������ ���߱� 
=======
		// �̼����� ������ �� �� �г� Ÿ��Ʋ
		JLabel PollutionLabel = new JLabel("Local Pollution degree of risk");
		PollutionLabel.setFont(new Font("Arial", Font.BOLD, 25));
		PollutionLabel.setForeground(Color.BLUE);
		PollutionLabel.setHorizontalAlignment(JLabel.CENTER);
		PollutionLabel.setBounds(118, 10, 393, 28);
		Pollutionpanel.add(PollutionLabel);
>>>>>>> branch 'master' of https://github.com/Kimyeongsan/Airpollution.git

		class Draw_M_Graph1 extends JPanel{
			//���� ������ ���⿡ ����
					int NO2=100;
					int OZ=70;
					int CO2=32;
					int SO2=22;
					int Fd=45;
					int Ud=100;
					
					//���� �̰ɷ� �����Ϸ��� �ߴµ� �۵�������~~ ����� �ؾ���~~
	
					public  void setNO2(int x) {
						this.NO2=x;
					}
					public  void setOZ(int x) {
						this.OZ=x;
					}
					public  void setCO2(int x) {
						this.CO2=x;
					}
					public  void setSO2(int x) {
						this.SO2=x;
					}
					public  void setFd(int x) {
						this.Fd=x;
					}
					public  void setUd(int x) {
						this.Ud=x;
					}
				
					@Override
					public void paintComponent(Graphics g) { // drawXXX ���� fillXXX�� ���ΰ� ä����.
						super.paintComponent(g);
						
						
						g.setColor(Color.BLACK);//����
						g.drawString("NO2", 5,20);//����,x��ǥ,y��ǥ
						g.setColor(Color.ORANGE);
						g.fillRect(80, 7, NO2, 20);
						
						g.setColor(Color.BLACK);//����
						g.drawString("OZ", 5, 50);//����,x��ǥ,y��ǥ
						g.setColor(Color.GREEN);
						g.fillRect(80, 37, OZ, 20);
						
						g.setColor(Color.BLACK);//����
						g.drawString("CO2", 5,80);//����,x��ǥ,y��ǥ
						g.setColor(Color.ORANGE);
						g.fillRect(80, 67, CO2, 20);
						
						g.setColor(Color.BLACK);//����
						g.drawString("SO2", 5,110);//����,x��ǥ,y��ǥ
						g.setColor(Color.GREEN);
						g.fillRect(80, 97, SO2, 20);
						
						g.setColor(Color.BLACK);//����
						g.drawString("Fd", 5,140);//����,x��ǥ,y��ǥ
						g.setColor(Color.ORANGE);
						g.fillRect(80, 127, Fd, 20);
						
						g.setColor(Color.BLACK);//����
						g.drawString("Ud", 5,170);//����,x��ǥ,y��ǥ
						g.setColor(Color.GREEN);
						g.fillRect(80, 157, Ud, 20);
					}
				}
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

		// Graph ���/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JPanel Graphpanel = new Draw_M_Graph1();
		Graphpanel.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel.setBounds(27, 48, 447, 214);
		Mainpanel.add(Graphpanel);
		//���� �׽�Ʈ
		//�� �꿡 �ȿö���
		///*
		((Draw_M_Graph1) Graphpanel).setNO2(22);//���Ĳ� �̷��� �����ϸ� �ѹ��̳�
		((Draw_M_Graph1) Graphpanel).setOZ(75);
		((Draw_M_Graph1) Graphpanel).setCO2(143);
		((Draw_M_Graph1) Graphpanel).setSO2(25);
		((Draw_M_Graph1) Graphpanel).setFd(155);
		((Draw_M_Graph1) Graphpanel).setUd(130);
		//*/
		
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
		btnNewButton = new JButton("�׷��� Ÿ��1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(498, 206, 126, 23);
		Mainpanel.add(btnNewButton);

		// ������ �׷���
		btnGraphType = new JButton("�׷��� Ÿ��2");
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
		JPanel first_compareGraph = new JPanel();//// �׷��� 1 �� �г�////////////
		first_compareGraph.setBounds(38, 131, 228, 200);
		first_compareGraph.setBorder(BorderFactory.createLineBorder(Color.red));
		Comparepanel.add(first_compareGraph);
		// first_compareGraph.add(new JLabel("NO2"));
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
		JPanel second_comparGraph = new JPanel();//// �׷��� 2�� �г�///////////
		second_comparGraph.setBounds(382, 131, 228, 200);
		second_comparGraph.setBorder(BorderFactory.createLineBorder(Color.red));
		Comparepanel.add(second_comparGraph);
*/
		JLabel lblNewLabel_3 = new JLabel("��������B");
		lblNewLabel_3.setBounds(360, 64, 68, 15);
		Comparepanel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("��¥ �Է�");
		lblNewLabel_4.setBounds(360, 101, 68, 15);
		Comparepanel.add(lblNewLabel_4);
		//
		// �׷��� �õ��غ���
		//�� �׷��� �׷��� Ŭ����1
		// �̰Ŷ� ���� �� �ϳ� ������ 2�� ������
class Draw_C_Graph1 extends JPanel{
	//���� ������ ���⿡ ����
			
			int Fd=45;
			int Ud=100;
			
			//���� �̰ɷ� �����Ϸ��� �ߴµ� �۵�������~~ ����� �ؾ���~~
			public  void setNO2(int x) {
				//this.NO2=x;
			}
		
			@Override
			public void paintComponent(Graphics g) { // drawXXX ���� fillXXX�� ���ΰ� ä����.
				super.paintComponent(g);
				
				
				g.setColor(Color.BLACK);//����
				g.drawString("�̼�����", 5,50);//����,x��ǥ,y��ǥ
				g.setColor(Color.ORANGE);
				g.fillRect(80, 37, Fd, 20);
				
				g.setColor(Color.BLACK);//����
				g.drawString("�ʹ̼�����", 5, 100);//����,x��ǥ,y��ǥ
				g.setColor(Color.GREEN);
				g.fillRect(80, 87, Ud, 20);
			}
		}
class Draw_C_Graph2 extends JPanel{
	//���� ������ ���⿡ ����
			
			int Fd=90;
			int Ud=55;
			public  void setNO2(int x) {
				//this.NO2=x;
			}
		
			@Override
			public void paintComponent(Graphics g) { // drawXXX ���� fillXXX�� ���ΰ� ä����.
				super.paintComponent(g);
				g.setColor(Color.BLACK);//����
				g.drawString("�̼�����", 5,50);//����,x��ǥ,y��ǥ
				g.setColor(Color.ORANGE);
				g.fillRect(80, 37, Fd, 20);
				
				g.setColor(Color.BLACK);//����
				g.drawString("�ʹ̼�����", 5, 100);//����,x��ǥ,y��ǥ
				g.setColor(Color.GREEN);
				g.fillRect(80, 87, Ud, 20);
			}
		}
JPanel first_compareGraph_R = new Draw_C_Graph1();//// �׷��� 1 �� �г�////////////
//first_compareGraph_R.setNO2(67);
first_compareGraph_R.setBounds(38, 131, 228, 200);
first_compareGraph_R.setBorder(BorderFactory.createLineBorder(Color.red));
Comparepanel.add(first_compareGraph_R);
first_compareGraph_R.setVisible(true);

JPanel second_comparGraph = new Draw_C_Graph2();//// �׷��� 2�� �г�///////////
second_comparGraph.setBounds(382, 131, 228, 200);
second_comparGraph.setBorder(BorderFactory.createLineBorder(Color.red));
Comparepanel.add(second_comparGraph);

/*
		setSize(800, 600);
		setContentPane(new Test02());
		
		setVisible(true);
*/
		
		

//�̽ĵ� �׷��� �׷��� �ǳ�

//ù �� �ǳڿ� �߰����ֱ�


//		button.addActionListener(new DrawActionListener(text1, text2, text3, drawingPanel));

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
		
		//�����ư ���� ^^7
		JButton btnCompareSet = new JButton("����");
		/*
		 * �����ư �׳� ����
		btnCompareSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnCompareSet.setBounds(278, 308, 97, 23);
		*/
		//
		//�����ư �̽Ĺ���

		//
		//�����ư ��ġ �� �ǳڿ� �߰�
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
}