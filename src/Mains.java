import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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
import javax.swing.JTextField;

public class Mains {

   private JFrame frame;
   private JTextField textField;
   private JTextField textField_1;
   private JButton btnNewButton;
   private JButton btnGraphType;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTextField textField_4;
   private JTextField textField_5;

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
      frame.setBounds(100, 100, 650, 420);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      
      
      
      final JPanel Mainpanel = new JPanel(); // main Panel
      Mainpanel.setBounds(0, 0, 636, 360);
      frame.getContentPane().add(Mainpanel);
      Mainpanel.setLayout(null);
      
      JLabel tilteLabel = new JLabel("Air Pollution");
      tilteLabel.setFont(new Font("����", Font.BOLD, 25));
      tilteLabel.setHorizontalAlignment(JLabel.CENTER);
      tilteLabel.setBounds(180, 10, 270, 28);
      Mainpanel.add(tilteLabel);
      
      // Graph ���
      JPanel Graphpanel = new JPanel();
      Graphpanel.setBorder(BorderFactory.createLineBorder(Color.red));
      Graphpanel.setBounds(27, 48, 447, 214);
      Mainpanel.add(Graphpanel);
      
      JLabel lblDay = new JLabel("��¥ �Է�");
      lblDay.setBounds(27, 288, 57, 15);
      Mainpanel.add(lblDay);
      
      // ���� ��¥
      textField = new JTextField();
      textField.setBounds(96, 285, 116, 21);
      textField.setColumns(10);
      Mainpanel.add(textField);
      
       // ������ ��¥
       textField_1 = new JTextField();
       textField_1.setBounds(224, 285, 107, 21);
       textField_1.setColumns(10);
       Mainpanel.add(textField_1);
       
        
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
        
        String Arealist[]= {"������","���ϱ�","������"};
        JComboBox comboBox = new JComboBox(Arealist);
        comboBox.setBounds(96, 317, 116, 19);
        Mainpanel.add(comboBox);
      
        
        
        
      final JPanel Pollutionpanel = new JPanel(); // �ְ� ������ ���
      Pollutionpanel.setBounds(0, 0, 636, 360);
      frame.getContentPane().add(Pollutionpanel);
      Pollutionpanel.setLayout(null);
      
      JLabel PollutionLabel = new JLabel("Local Pollution degree of risk");
      PollutionLabel.setFont(new Font("����", Font.BOLD, 25));
      PollutionLabel.setHorizontalAlignment(JLabel.CENTER);
      PollutionLabel.setBounds(118, 10, 393, 28);
      Pollutionpanel.add(PollutionLabel);
      
      JPanel panel = new JPanel();
      panel.setBounds(343, 102, 251, 217);
      panel.setBorder(BorderFactory.createLineBorder(Color.red));
      Pollutionpanel.add(panel);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBounds(44, 102, 251, 197);
      panel_1.setBorder(BorderFactory.createLineBorder(Color.red));
      Pollutionpanel.add(panel_1);
      
      JLabel lblNewLabel = new JLabel("High Pollution");
      lblNewLabel.setBounds(126, 64, 99, 28);
      Pollutionpanel.add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel("���赵 �˸�ǥ");
      lblNewLabel_1.setBounds(423, 64, 88, 28);
      Pollutionpanel.add(lblNewLabel_1);
      
      JLabel lblNewLabel_5 = new JLabel("�� �Է�");
      lblNewLabel_5.setBounds(46, 310, 46, 21);
      Pollutionpanel.add(lblNewLabel_5);
      String monthArray[] = {"1��", "2��", "3��"};
      JComboBox comboBox_1 = new JComboBox(monthArray);
      comboBox_1.setBounds(93, 309, 72, 23);
      Pollutionpanel.add(comboBox_1);
      Pollutionpanel.setVisible(false); //Pollution panel ������ ���߱� 

      
      
      
      
      final JPanel Comparepanel = new JPanel(); // ������ ��
      Comparepanel.setBounds(0, 0, 636, 360);
      frame.getContentPane().add(Comparepanel);
      Comparepanel.setLayout(null);
      
      JLabel CompareNewLabel = new JLabel("Pollution Compare");
      CompareNewLabel.setFont(new Font("����", Font.BOLD, 25));
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
      
      JPanel second_comparelabel = new JPanel();
      second_comparelabel.setBounds(382, 131, 228, 200);
      second_comparelabel.setBorder(BorderFactory.createLineBorder(Color.red));
      Comparepanel.add(second_comparelabel);
      
      textField_2 = new JTextField();
      textField_2.setBounds(113, 61, 96, 21);
      Comparepanel.add(textField_2);
      textField_2.setColumns(10);
      
      textField_3 = new JTextField();
      textField_3.setBounds(113, 98, 96, 21);
      Comparepanel.add(textField_3);
      textField_3.setColumns(10);
      
      JLabel lblNewLabel_3 = new JLabel("���� �Է�");
      lblNewLabel_3.setBounds(360, 64, 68, 15);
      Comparepanel.add(lblNewLabel_3);
      
      JLabel lblNewLabel_4 = new JLabel("��¥ �Է�");
      lblNewLabel_4.setBounds(360, 101, 68, 15);
      Comparepanel.add(lblNewLabel_4);
      
      textField_4 = new JTextField();
      textField_4.setBounds(440, 61, 96, 21);
      Comparepanel.add(textField_4);
      textField_4.setColumns(10);
      
      textField_5 = new JTextField();
      textField_5.setBounds(440, 98, 96, 21);
      Comparepanel.add(textField_5);
      textField_5.setColumns(10);
      
      JButton btnSet = new JButton("����");
      btnSet.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      	}
      });
      btnSet.setBounds(273, 187, 97, 23);
      Comparepanel.add(btnSet);
      
      Comparepanel.setVisible(false); //Compare panel ������ ���߱� 

      
      
      
      JMenuBar menuBar = new JMenuBar(); // Menu bar ����
      frame.setJMenuBar(menuBar);
      
      JMenu mnNewMenu = new JMenu("Menu");
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