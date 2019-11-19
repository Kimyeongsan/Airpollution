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

   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 650, 430);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      //지역별 오염도 비교 패널
      final JPanel Pollutionpanel = new JPanel(); // Pollution panel 화면
      Pollutionpanel.setBounds(0, 0, 636, 360);
      frame.getContentPane().add(Pollutionpanel);
      Pollutionpanel.setLayout(null);
      
      //미세먼지 지역도 농도 비교 패널 타이틀
      JLabel PollutionLabel = new JLabel("Local Pollution degree of risk");
      PollutionLabel.setFont(new Font("Arial", Font.BOLD, 25));
      PollutionLabel.setForeground(Color.BLUE);
      PollutionLabel.setHorizontalAlignment(JLabel.CENTER);
      PollutionLabel.setBounds(118, 10, 393, 28);
      Pollutionpanel.add(PollutionLabel);
      
      
      //메인 화면 패널
      final JPanel Mainpanel = new JPanel();
      Mainpanel.setBackground(new Color(225, 240, 255));
      Mainpanel.setBounds(0, 0, 636, 360);
      frame.getContentPane().add(Mainpanel);
      Mainpanel.setLayout(null);
      
      //메인 화면 라벨
      JLabel tilteLabel = new JLabel("Air Pollution");
      tilteLabel.setFont(new Font("Arial", Font.BOLD, 30));
      tilteLabel.setForeground(new Color(0, 35, 110));
      tilteLabel.setHorizontalAlignment(JLabel.CENTER);
      tilteLabel.setBounds(180, 10, 270, 28);
      Mainpanel.add(tilteLabel);
      
      // Graph 출력
      JPanel Graphpanel = new JPanel();
      Graphpanel.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
      Graphpanel.setBounds(27, 48, 447, 214);
      Mainpanel.add(Graphpanel);
      
      JLabel lblDay = new JLabel("날짜 입력");
      lblDay.setBounds(27, 288, 57, 15);
      Mainpanel.add(lblDay);
      
      //시작 날짜
      String MonthList[] = new String[12];
      for (int m = 1; m < 13; m++) {
    	  MonthList[m - 1] = Integer.toString(m) + "월";
      }
      
      start_Month = new JComboBox(MonthList);
      start_Month.setBounds(96, 285, 116, 21);
      start_Month.setSize(new Dimension(55,20));
      Mainpanel.add(start_Month);
      
      //날짜 리스트
      String DateList[] = new String[31];
      for (int d = 1; d < 32; d++) {
    	  DateList[d - 1] = Integer.toString(d) + "일";
      } 
      
      //시작 날짜
      start_Date = new JComboBox(DateList);
      start_Date.setBounds(155, 285, 116, 21);
      start_Date.setSize(new Dimension(55,20));
      Mainpanel.add(start_Date);
   
      //기간(~) 라벨
      JLabel termLabel = new JLabel(" ~ ");
      termLabel.setBounds(210, 288, 57, 15);
      Mainpanel.add(termLabel);

      // 시작 날짜
      /*textField_main1 = new JTextField();
      textField_main1.setBounds(160, 285, 106, 21);
      textField_main1.setSize(new Dimension(50, 20));
      textField_main1.setColumns(5);
      Mainpanel.add(textField_main1);*/
      

      
       // 마지막 날짜
     /*  textField_main2 = new JTextField();
       textField_main2.setBounds(224, 285, 107, 21);
       textField_main2.setColumns(10);
       Mainpanel.add(textField_main2);*/
      
      
      //끝 날짜
      end_Month = new JComboBox(MonthList);
      end_Month.setBounds(224, 285, 116, 21);
      end_Month.setSize(new Dimension(55,20));
      Mainpanel.add(end_Month);
      
      end_Date = new JComboBox(DateList);
      end_Date.setBounds(284, 285, 116, 21);
      end_Date.setSize(new Dimension(55,20));
      Mainpanel.add(end_Date);
        
      
      
      JButton btnApply = new JButton("날짜 적용");
      btnApply.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
        
      btnApply.setBounds(343, 284, 97, 23);
      Mainpanel.add(btnApply);
        
      // 막대 그래프
      btnNewButton = new JButton("그래프 타입1");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btnNewButton.setBounds(498, 206, 126, 23);
      Mainpanel.add(btnNewButton);
        
      // 꺾은선 그래프
      btnGraphType = new JButton("그래프 타입2");
      btnGraphType.setBounds(498, 239, 126, 23);
      Mainpanel.add(btnGraphType);
        
      //종료 버튼
      JButton btnExit = new JButton("종료");
      btnExit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });
      btnExit.setBounds(527, 327, 97, 23);
      Mainpanel.add(btnExit);
        
      JLabel lblSerch = new JLabel("지역 검색");
      lblSerch.setBounds(27, 319, 57, 15);
      Mainpanel.add(lblSerch);
        
      //sample list
      String Arealist[]= {"강서구","강북구","강동구"};
      JComboBox comboBox = new JComboBox(Arealist);
      comboBox.setBounds(96, 317, 116, 19);
      Mainpanel.add(comboBox);
      
      
      //지역별 오염도 비교 패널
      final JPanel Comparepanel = new JPanel(); 
      Comparepanel.setBounds(0, 0, 636, 360);
      frame.getContentPane().add(Comparepanel);
      Comparepanel.setLayout(null);
      
      //지역별 오염도 화면 타이틀
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
      
      JLabel fisrt_compareLabel = new JLabel("지역 입력");
      fisrt_compareLabel.setBounds(38, 64, 63, 15);
      Comparepanel.add(fisrt_compareLabel);
      
      JLabel lblNewLabel_2 = new JLabel("날짜 입력");
      lblNewLabel_2.setBounds(38, 101, 63, 15);
      Comparepanel.add(lblNewLabel_2);
      
      //비교 정보
      JPanel panel_2 = new JPanel();
      panel_2.setBounds(360, 131, 228, 200);
      panel_2.setBorder(BorderFactory.createLineBorder(Color.red));
      Comparepanel.add(panel_2);
      
      
      //첫번째 지역 입력
      textField_A1 = new JTextField();
      textField_A1.setBounds(113, 61, 96, 21);
      Comparepanel.add(textField_A1);
      textField_A1.setColumns(10);
      //첫번째 날짜 입력
      textField_D1 = new JTextField();
      textField_D1.setBounds(113, 98, 96, 21);
      Comparepanel.add(textField_D1);
      textField_D1.setColumns(10);
      
      
      JLabel lblNewLabel_3 = new JLabel("지역 입력");
      lblNewLabel_3.setBounds(360, 64, 68, 15);
      Comparepanel.add(lblNewLabel_3);
      
      JLabel lblNewLabel_4 = new JLabel("날짜 입력");
      lblNewLabel_4.setBounds(360, 101, 68, 15);
      Comparepanel.add(lblNewLabel_4);
      
      //두번째 지역 입력
      textField_A2 = new JTextField();
      textField_A2.setBounds(440, 61, 96, 21);
      Comparepanel.add(textField_A2);
      textField_A2.setColumns(10);
      //두번째 날짜 입력
      textField_D2 = new JTextField();
      textField_D2.setBounds(440, 98, 96, 21);
      Comparepanel.add(textField_D2);
      textField_D2.setColumns(10);
      
      Comparepanel.setVisible(false); //Compare panel 페이지 감추기 
      Pollutionpanel.setVisible(false); //Pollution panel 페이지 감추기 

      
      JMenuBar menuBar = new JMenuBar(); // Menu bar 구현
      menuBar.setBackground(new Color(0, 35, 110));
      frame.setJMenuBar(menuBar);
      
      JMenu mnNewMenu = new JMenu("Menu");
      mnNewMenu.setForeground(Color.WHITE);
      mnNewMenu.setFont(new Font("돋움", Font.BOLD, 15));
      menuBar.add(mnNewMenu);
      
      JMenuItem mainNewMenuItem = new JMenuItem("메인메뉴");
      mnNewMenu.add(mainNewMenuItem);
      mainNewMenuItem.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             Mainpanel.setVisible(true); 
             Comparepanel.setVisible(false);
             Pollutionpanel.setVisible(false);
         }
      }); 
      
      
      JMenuItem CompareMenuItem = new JMenuItem("지역별 오염도 비교");
      mnNewMenu.add(CompareMenuItem);
      CompareMenuItem.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             Mainpanel.setVisible(false); 
             Comparepanel.setVisible(true); 
             Pollutionpanel.setVisible(false);
         }
      }); 
      
      
      JMenuItem PollutionMenuItem = new JMenuItem("미세먼지 위험 농도 비교");
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