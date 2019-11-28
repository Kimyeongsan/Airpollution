import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//메인화면에 들어가는 그래프 클래스
class Draw_M_Graph1 extends JPanel {
   // 변수 데이터 여기에 선언

   int NO2 = 100;
   int OZ = 70;
   int CO2 = 32;
   int SO2 = 22;
   int Fd = 45;
   int Ud = 100;

   // 대충 이걸로 조절하려고 했는데 작동안하쥬~~ 토요일 해야쥬~~

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
   public void paintComponent(Graphics g) { // drawXXX 말고 fillXXX는 내부가 채워짐.
      super.paintComponent(g);

      g.setColor(Color.BLACK);// 글자
      g.drawString("NO2", 5, 20);// 내용,x좌표,y좌표
      g.setColor(Color.ORANGE);
      g.fillRect(80, 7, NO2, 20);

      g.setColor(Color.BLACK);// 글자
      g.drawString("OZ", 5, 50);// 내용,x좌표,y좌표
      g.setColor(Color.GREEN);
      g.fillRect(80, 37, OZ, 20);

      g.setColor(Color.BLACK);// 글자
      g.drawString("CO2", 5, 80);// 내용,x좌표,y좌표
      g.setColor(Color.ORANGE);
      g.fillRect(80, 67, CO2, 20);

      g.setColor(Color.BLACK);// 글자
      g.drawString("SO2", 5, 110);// 내용,x좌표,y좌표
      g.setColor(Color.GREEN);
      g.fillRect(80, 97, SO2, 20);

      g.setColor(Color.BLACK);// 글자
      g.drawString("Fd", 5, 140);// 내용,x좌표,y좌표
      g.setColor(Color.ORANGE);
      g.fillRect(80, 127, Fd, 20);

      g.setColor(Color.BLACK);// 글자
      g.drawString("Ud", 5, 170);// 내용,x좌표,y좌표
      g.setColor(Color.GREEN);
      g.fillRect(80, 157, Ud, 20);

   }
}

//메인에 들어가는 꺾은선 그래프
class Draw_M_Graph2 extends JPanel {
   // 변수 데이터 여기에 선언
//최고높이 0, 최저높이 160
//160-[희망값]->Y좌표로 출력?
//수정시 최저 0 최고 150
   int[] NO2 = { 0, 60, 70, 75, 85, 80, 150 };
   int[] OZ = { 70, 75, 80, 85, 50, 55, 60 };
   int[] CO2 = { 30, 25, 40, 55, 65, 70, 80 };
   int[] SO2 = {90,100,117,120,130,110,100};
   int[] Fd = {100,126,96,98,86,104,115};
   int[] Ud = {50,60,70,50,70,90,100};

   // 대충 이걸로 조절하려고 했는데 작동안하쥬~~ 토요일 해야쥬~~
   
   //값 변경인데 배열로 받아서 챱챱하장
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
   public void paintComponent(Graphics g) { // drawXXX 말고 fillXXX는 내부가 채워짐.
      super.paintComponent(g);

      // 종류Y축
      g.setColor(Color.PINK);// 글자
      g.drawString("NO2", 5, 20);// 내용,x좌표,y좌표
      g.setColor(Color.RED);// 글자
      g.drawString("OZ", 5, 50);// 내용,x좌표,y좌표
      g.setColor(Color.YELLOW);// 글자
      g.drawString("CO2", 5, 80);// 내용,x좌표,y좌표
      g.setColor(Color.GREEN);// 글자
      g.drawString("SO2", 5, 110);// 내용,x좌표,y좌표
      g.setColor(Color.BLUE);// 글자
      g.drawString("Fd", 5, 140);// 내용,x좌표,y좌표
      g.setColor(Color.WHITE);// 글자
      g.drawString("Ud", 5, 170);// 내용,x좌표,y좌표

      // 기간 1~7일 X축
      g.drawString("DAY1", 50, 200);// 내용,x좌표,y좌표
      g.drawString("DAY2", 100, 200);
      g.drawString("DAY3", 150, 200);
      g.drawString("DAY4", 200, 200);
      g.drawString("DAY5", 250, 200);
      g.drawString("DAY6", 300, 200);
      g.drawString("DAY7", 350, 200);

      int x1 = 60;// 초기 x좌표

/////////////NO2시작

      // 점찍 반복문으로 수정//
      for (int i = 0; i <= 6; i++) {
         g.setColor(Color.PINK);
         g.fillOval(x1, 160-NO2[i], 5, 5);
         x1 += 50;
      }
      x1 = 60;// 다시 x 초기 값으로 셋팅
      // 직선 반복으로 수정
      for (int i = 0; i < 6; i++) {
         g.drawLine(x1, 160-(NO2[i] - 3), x1 + 50, 160-(NO2[i + 1] - 3));
         x1 += 50;
      }
      x1 = 60;//

//////////////////Oz그래프 시작
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
      x1 = 60;// 그래프 그리고 다시 원위치

//////////////////CO2그래프 시작
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
      x1 = 60;// 그래프 그리고 다시 원위치
      
/////////SO2시작
      g.setColor(Color.GREEN);
      for (int i = 0; i <= 6; i++) {
         g.fillOval(x1, 160-SO2[i], 5, 5);
         x1 += 50;
      }

      x1 = 60;
      for (int i = 0; i < 6; i++) {
      //   g.drawLine(x1, SO2[i] + 3, x1 + 50, SO2[i + 1] + 3);
         g.drawLine(x1, 160-(SO2[i]- 3), x1 + 50, 160-(SO2[i + 1] -3));
         x1 += 50;
      }
      x1 = 60;// 그래프 그리고 다시 원위치

//////////////Fd 시작
      g.setColor(Color.BLUE);
      for (int i = 0; i <= 6; i++) {
         g.fillOval(x1, 160-Fd[i], 5, 5);
         x1 += 50;
      }

      x1 = 60;
      for (int i = 0; i < 6; i++) {
      //   g.drawLine(x1, Fd[i] + 3, x1 + 50, Fd[i + 1] + 3); //원래 함수들 혹시 모르니 남겨두장
         g.drawLine(x1, 160-(Fd[i]- 3), x1 + 50, 160-(Fd[i + 1] -3));
         x1 += 50;
      }
      x1 = 60;// 그래프 그리고 다시 원위치
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
      x1 = 60;// 그래프 그리고 다시 원위치
   }
}

//비교화면에 들어갈 그래프 클래스
class Draw_C_Graph1 extends JPanel {
   // 변수 데이터 여기에 선언
   int Fd = 45;
   int Ud = 100;
   
   
   public void setFd(int x) {
      this.Fd = x;
   }

   public void setUd(int x) {
      this.Ud = x;
   }

   @Override
   public void paintComponent(Graphics g) { // drawXXX 말고 fillXXX는 내부가 채워짐.
      super.paintComponent(g);

      g.setColor(Color.BLACK);// 글자
      g.drawString("미세먼지", 5, 50);// 내용,x좌표,y좌표
      g.setColor(Color.ORANGE);
      g.fillRect(80, 37, Fd, 20);

      g.setColor(Color.BLACK);// 글자
      g.drawString("초미세먼지", 5, 100);// 내용,x좌표,y좌표
      g.setColor(Color.GREEN);
      g.fillRect(80, 87, Ud, 20);
   }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Mains {

   private JFrame frame;

   private JButton btnNewButton;
   private JButton btnGraphType;
   private JTextField textField_Date1;
   private JTextField textField_Date2;
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

      // 지역별 오염도 비교 패널
      final JPanel Pollutionpanel = new JPanel(); // Pollution panel 화면
      Pollutionpanel.setBounds(0, 0, 636, 360);
      Pollutionpanel.setBackground(new Color(225, 240, 255));
      frame.getContentPane().add(Pollutionpanel);
      Pollutionpanel.setLayout(null);

      // 미세먼지 지역도 농도 비교 패널 타이틀
      JLabel PollutionLabel = new JLabel("Local Pollution degree of risk");
      PollutionLabel.setFont(new Font("Arial", Font.BOLD, 35));
      PollutionLabel.setForeground(new Color(0, 35, 110));
      PollutionLabel.setHorizontalAlignment(JLabel.CENTER);
      PollutionLabel.setBounds(70, 5, 500, 40);
      Pollutionpanel.add(PollutionLabel);

      // 메인 화면 패널
      final JPanel Mainpanel = new JPanel();
      Mainpanel.setBackground(new Color(225, 240, 255));
      Mainpanel.setBounds(0, 0, 636, 360);
      frame.getContentPane().add(Mainpanel);
      Mainpanel.setLayout(null);

      // 메인 화면 라벨
      JLabel titleLabel = new JLabel("Air Pollution");
      titleLabel.setFont(new Font("Arial", Font.BOLD, 35));
      titleLabel.setForeground(new Color(0, 35, 110));
      titleLabel.setHorizontalAlignment(JLabel.CENTER);
      titleLabel.setBounds(70, 4, 500, 40);
      Mainpanel.add(titleLabel);

      // Graph막대
      // 출력/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      final JPanel Graphpanel = new Draw_M_Graph1();
      Graphpanel.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
      Graphpanel.setBackground(Color.white);
      Graphpanel.setBounds(27, 48, 447, 214);
      Mainpanel.add(Graphpanel);
      // 수정 테스트
      /// *
      ((Draw_M_Graph1) Graphpanel).setNO2(22);// 쉬파꺼 이렇게 수정하면 한방이네
      ((Draw_M_Graph1) Graphpanel).setOZ(75);
      ((Draw_M_Graph1) Graphpanel).setCO2(140);
      ((Draw_M_Graph1) Graphpanel).setSO2(25);
      ((Draw_M_Graph1) Graphpanel).setFd(155);
      ((Draw_M_Graph1) Graphpanel).setUd(130);
      // */

      // Graph 꺾은선
      
      final JPanel Graphpanel2 = new Draw_M_Graph2();
      Graphpanel2.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
      Graphpanel2.setBounds(27, 48, 447, 214);
      Graphpanel2.setBackground(Color.DARK_GRAY);
      Mainpanel.add(Graphpanel2);
      //수정은 이런식으로.
      //int temp[]= {100,120,40,100,80,60,60};
      //((Draw_M_Graph2) Graphpanel2).setNO2(temp);
      Graphpanel2.setVisible(false);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
      JLabel lblDay = new JLabel("날짜 입력");
      lblDay.setBounds(27, 288, 57, 15);
      Mainpanel.add(lblDay);

      // 시작 날짜
      String MonthList[] = new String[12];
      for (int m = 1; m < 13; m++) {
         MonthList[m - 1] = Integer.toString(m) + "월";
      }

      start_Month = new JComboBox(MonthList);
      start_Month.setBounds(96, 285, 116, 21);
      start_Month.setSize(new Dimension(55, 20));
      Mainpanel.add(start_Month);

      // 날짜 리스트
      String DateList[] = new String[31];
      for (int d = 1; d < 32; d++) {
         DateList[d - 1] = Integer.toString(d) + "일";
      }

      // 시작 날짜
      start_Date = new JComboBox(DateList);
      start_Date.setBounds(155, 285, 116, 21);
      start_Date.setSize(new Dimension(55, 20));
      Mainpanel.add(start_Date);

      // 기간(~) 라벨
      JLabel termLabel = new JLabel(" ~ ");
      termLabel.setBounds(210, 288, 57, 15);
      Mainpanel.add(termLabel);

      // 끝 날짜
      end_Month = new JComboBox(MonthList);
      end_Month.setBounds(224, 285, 116, 21);
      end_Month.setSize(new Dimension(55, 20));
      Mainpanel.add(end_Month);

      end_Date = new JComboBox(DateList);
      end_Date.setBounds(284, 285, 116, 21);
      end_Date.setSize(new Dimension(55, 20));
      Mainpanel.add(end_Date);

      
      ////////////////지역검색 박스
      JLabel lblSerch = new JLabel("지역 검색");
      lblSerch.setBounds(27, 319, 57, 15);
      Mainpanel.add(lblSerch);

      // sample list = 지역명 불러오기
      String Arealist[] = { "강서구", "강북구", "강동구" };
      JComboBox mainAreaBox = new JComboBox(Arealist);
      mainAreaBox.setBounds(96, 317, 116, 19);
      Mainpanel.add(mainAreaBox);
      
      
      /////////////////////////////////////메인화면 날짜 적용
      JButton btnApply = new JButton("날짜 적용");
      btnApply.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 String error = "";
        	 boolean s_check = false, e_check = false, d_check = true;
        	
        	 int s_month = start_Month.getSelectedIndex() + 1; //시작 월
        	 int s_date = start_Date.getSelectedIndex() + 1;   //시작 일
        	 int e_month = end_Month.getSelectedIndex() + 1;   //종료 월
        	 int e_date = end_Date.getSelectedIndex() + 1;     //종료 일
        	 
        	 //////////////////시작날짜 에러/////////////////////
        	 //시작 날짜 - 2월 에러
        	 if(s_month == 2  && s_date > 28) {
        		 error += "시작 날짜를 다시 선택하세요 (2월은 28일까지)" + "\n";
        	 }
        	 
        	 //시작 날짜 - 1월부터 7월
        	 else if(s_month < 8) {
        		 if(s_month % 2 == 0 && s_date == 31) 
        			 error += "시작 날짜를 다시 선택하세요 (" + s_month + "월은 30일까지)" + "\n"; 
        		 else s_check = true;
        	 }
        	 //시작 날짜 - 8월부터 12월
        	 else {
        		 if(s_month % 2 == 1 && s_date == 31) 
        			 error += "시작 날짜를 다시 선택하세요 (" + s_month + "월은 30일까지)" + "\n"; 
        		 else s_check = true;
        	 }        	
        	 
        	 //////////종료날짜 에러////////////////////
        	 //종료 날짜 - 2월 에러
        	 if(e_month == 2 && e_date > 28) {
        		 error += "종료 날짜를 다시 선택하세요 (2월은 28일까지)" + "\n";
        	 }
        	 
        	 //종료 날짜 - 1월부터 7월
        	 else if(e_month < 8) {
        		 if(e_month % 2 == 0 && e_date == 31) 
        			 error += "종료 날짜를 다시 선택하세요 (" + e_month + "월은 30일까지)" + "\n";     
        		 else e_check = true;
        	 }
        	 //종료 날짜 - 8월부터 12월
        	 else {
        		 if(e_month % 2 == 1 && e_date == 31) 
        			 error += "종료 날짜를 다시 선택하세요 (" + e_month + "월은 30일까지)" + "\n";
        		 else e_check = true;
        	 }        

        	 /////////////////시작 날짜가 더 클 때////////////////////////
        	 if(s_check == true && e_check == true) {
        		 //시작 월이 종료 월보다 클 때
        		 if(s_month > e_month) {
        			 error += "시작 날짜가 더 큽니다." + "\n";
        			 d_check = false;
        		 }
        		 //시작 월과 종료 월이 같을 때 시작 일수가 더 큰 경우
        		 else if(s_month == e_month && s_date > e_date) {
        			 error += "시작 날짜가 더 큽니다." + "\n";
        			 d_check = false;
        		 } 
        	 }
        	 
        	 ////////////////에러창 띄우기//////////////////////////////////
        	 //에러가 발생했을 때
        	 if(s_check == false || e_check == false || d_check == false) {
        		 //에러 메세지 팝업창 띄우기
        		 JOptionPane.showMessageDialog(null, error,"ERROR_DATE", JOptionPane.ERROR_MESSAGE);
        	 }
        	 
        	 //////// 콤보박스에서 선택된 지역 불러와서 변수에 저장해주는 것 
        	 String area = (String)mainAreaBox.getSelectedItem();
        	 //----------------> 이거랑 월 일 가져온거 이용해서 디비 연동해서 불러오시면 됩니당
        	 
        	 
        	 
        	 /*
        	  * 입력 받은 날짜로 선택된 지역 그래프 불러와야되는데 디비 연동이 안된다....... 계정 한글이름ㅜㅜㅜㅠㅜㅠㅠㅠㅠㅠㅜㅠ
        	  */
         }
      });

      btnApply.setBounds(343, 284, 97, 23);
      Mainpanel.add(btnApply);

      // 막대 그래프
      btnNewButton = new JButton("막대그래프");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Graphpanel.setVisible(true);

         }
      });
      btnNewButton.setBounds(498, 206, 126, 23);
      Mainpanel.add(btnNewButton);

      
      // 꺾은선
      // 그래프///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      btnGraphType = new JButton("꺾은선 그래프");
      btnGraphType.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Graphpanel.setVisible(false);
            Graphpanel2.setVisible(true);
         }
      });
      btnGraphType.setBounds(498, 239, 126, 23);
      Mainpanel.add(btnGraphType);

      // 종료 버튼
      JButton btnExit = new JButton("종료");
      btnExit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });
      btnExit.setBounds(527, 327, 97, 23);
      Mainpanel.add(btnExit);


/////////////////////////////지역별 오염도 비교 패널/////////////////////////////////////////////////////////////////////////////////요서
      final JPanel Comparepanel = new JPanel();
      Comparepanel.setBounds(0, 0, 636, 360);
      Comparepanel.setBackground(new Color(225, 240, 255));
      frame.getContentPane().add(Comparepanel);
      Comparepanel.setLayout(null);

      // 지역별 오염도 화면 타이틀
      JLabel CompareNewLabel = new JLabel("Pollution Compare");
      CompareNewLabel.setFont(new Font("Arial", Font.BOLD, 35));
      CompareNewLabel.setForeground(new Color(0, 35, 110));
      CompareNewLabel.setHorizontalAlignment(JLabel.CENTER);
      CompareNewLabel.setBounds(70, 5, 500, 40);
      Comparepanel.add(CompareNewLabel);
      /*
       * JPanel first_compareGraph = new JPanel();//// 그래프 1 들어갈 패널////////////
       * first_compareGraph.setBounds(38, 131, 228, 200);
       * first_compareGraph.setBorder(BorderFactory.createLineBorder(Color.red));
       * Comparepanel.add(first_compareGraph); // first_compareGraph.add(new
       * JLabel("NO2"));
       */
      JLabel choiceArea_Label1 = new JLabel("지역 선택 A");
      choiceArea_Label1.setBounds(25, 70, 70, 15);
      Comparepanel.add(choiceArea_Label1);

      //// 지역선택1
      JComboBox comboBoxArea1 = new JComboBox(Arealist);
      comboBoxArea1.setBounds(157, 67, 96, 21);
      Comparepanel.add(comboBoxArea1);
      //// 지역선택2
      JComboBox comboBoxArea2 = new JComboBox(Arealist);
      comboBoxArea2.setBounds(515, 67, 96, 21);
      Comparepanel.add(comboBoxArea2);

      JLabel writeDate1 = new JLabel("날짜 입력");
      writeDate1.setBounds(25, 98, 150, 15);
      Comparepanel.add(writeDate1);
      
      //날짜 입력받는 양식 안내 ~~~~~~~~~~~~~~~~~~~~~~~~ ~~~~~~~~~~~입력받아서 데이터 불러오기 편한대로 라벨 내용 바꿔주세용
      JLabel exLabel1 = new JLabel("5월 13일 -> 5.13");
      exLabel1.setFont(new Font("굴림", Font.BOLD, 11));
      exLabel1.setBounds(153, 118, 150, 15);
      Comparepanel.add(exLabel1);
     
      /*
       * JPanel second_comparGraph = new JPanel();//// 그래프 2들어갈 패널///////////
       * second_comparGraph.setBounds(382, 131, 228, 200);
       * second_comparGraph.setBorder(BorderFactory.createLineBorder(Color.red));
       * Comparepanel.add(second_comparGraph);
       */
      
      JLabel choiceArea_Label2 = new JLabel("지역 선택 B");
      choiceArea_Label2.setBounds(382, 70, 70, 15);
      Comparepanel.add(choiceArea_Label2);

      JLabel writeDate2 = new JLabel("날짜 입력");
      writeDate2.setBounds(382, 98, 68, 15);
      Comparepanel.add(writeDate2);
      
      JLabel exLabel2 = new JLabel("5월 13일 -> 5.13");
      exLabel2.setFont(new Font("굴림", Font.BOLD, 11));
      exLabel2.setBounds(510, 118, 150, 15);
      Comparepanel.add(exLabel2);
      
      //
      // 그래프 시도해보자
      // 비교 그래프 그려줄 클래스1
      // 이거랑 같은 거 하나 더만들어서 2로 쓸꺼야

      JPanel first_compareGraph_R = new Draw_C_Graph1();//// 그래프 1 들어갈 패널////////////
      first_compareGraph_R.setBounds(25, 137, 228, 200);
      first_compareGraph_R.setBackground(Color.white);
      first_compareGraph_R.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
      // 값 수정은 이런식으로
      ((Draw_C_Graph1) first_compareGraph_R).setFd(12);
      ((Draw_C_Graph1) first_compareGraph_R).setFd(32);

      Comparepanel.add(first_compareGraph_R);
      first_compareGraph_R.setVisible(true);

      JPanel second_compareGraph = new Draw_C_Graph1();//// 그래프 2들어갈 패널///////////
      second_compareGraph.setBounds(382, 137, 228, 200);
      second_compareGraph.setBackground(Color.white);
      second_compareGraph.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
      Comparepanel.add(second_compareGraph);
      ((Draw_C_Graph1) second_compareGraph).setFd(70);
      ((Draw_C_Graph1) second_compareGraph).setUd(30);
      // Draw_C_Graph2 삭제해도 됨.
      // ((Draw_C_Graph2) second_comparGraph).setFd(99);
      // ((Draw_C_Graph2) second_comparGraph).setFd(127);

      /*
       * setSize(800, 600); setContentPane(new Test02());
       * 
       * setVisible(true);
       */

//이식된 그래프 그려질 판넬

//첫 비교 판넬에 추가해주기

//      button.addActionListener(new DrawActionListener(text1, text2, text3, drawingPanel));

      //

      // 첫번째 날짜 입력
      textField_Date1 = new JTextField();
      textField_Date1.setBounds(157, 95, 96, 21);
      Comparepanel.add(textField_Date1);
      textField_Date1.setColumns(10);

      // 두번째 날짜 입력
      textField_Date2 = new JTextField();
      textField_Date2.setBounds(515, 95, 96, 21);
      Comparepanel.add(textField_Date2);
      textField_Date2.setColumns(10);

      // 적용버튼 생성 ^^7
      JButton btnCompareSet = new JButton("적용");
      /*
       * 적용버튼 그냥 버젼 btnCompareSet.addActionListener(new ActionListener() { public void
       * actionPerformed(ActionEvent e) {
       * 
       * } }); btnCompareSet.setBounds(278, 308, 97, 23);
       */
      //
      // 적용버튼 이식버젼

      //
      // 적용버튼 위치 및 판넬에 추가
      btnCompareSet.setBounds(268, 314, 97, 23);
      Comparepanel.add(btnCompareSet);

      Comparepanel.setVisible(false); // Compare panel 페이지 감추기

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      Pollutionpanel.setVisible(false); // Pollution panel 페이지 감추기

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