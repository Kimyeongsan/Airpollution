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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
   private JButton btnBarGraph;
   private JButton btnLineGraph;
   private MainGraph_Stick Graphpanel;
   private MainGraph_Polygonal Graphpanel_2;
   private JComboBox month, date, AreaBox;
//깃 에러나서 주석으로 추가
   public MainPanel(JFrame frame) {
      super();
      panelInit(frame);
      graphInit();
      graphInit_2();
   }

   private void panelInit(JFrame frame) {
      // 메인 화면 패널
      this.setBackground(new Color(225, 240, 255));
      this.setBounds(0, 0, 636, 360);
      frame.getContentPane().add(this);
      this.setLayout(null);

      // 메인 화면 라벨
      JLabel tilteLabel = new JLabel("Air Pollution");
      tilteLabel.setFont(new Font("Arial", Font.BOLD, 35));
      tilteLabel.setForeground(new Color(0, 35, 110));
      tilteLabel.setHorizontalAlignment(JLabel.CENTER);
      tilteLabel.setBounds(70, 4, 500, 40);
      this.add(tilteLabel);

      JLabel lblDay = new JLabel("날짜 입력");
      lblDay.setBounds(27, 288, 57, 15);
      this.add(lblDay);

      // 시작 날짜
      String MonthList[] = new String[12];
      for (int m = 1; m < 13; m++) {
         MonthList[m - 1] = Integer.toString(m) + "월";
      }

      month = new JComboBox(MonthList);
      month.setBounds(96, 285, 116, 21);
      month.setSize(new Dimension(55, 20));
      this.add(month);

      // 날짜 리스트
      String DateList[] = new String[31];
      for (int d = 1; d < 32; d++) {
         DateList[d - 1] = Integer.toString(d) + "일";
      }

      // 시작 날짜
      date = new JComboBox(DateList);
      date.setBounds(155, 285, 116, 21);
      date.setSize(new Dimension(55, 20));
      this.add(date);

      JLabel lblSerch = new JLabel("지역 검색");
      lblSerch.setBounds(27, 319, 57, 15);
      this.add(lblSerch);

      // sample list
      String Arealist[] = { "강서구", "강북구", "강동구" };
      AreaBox = new JComboBox(Arealist);
      AreaBox.setBounds(96, 317, 116, 19);
      this.add(AreaBox);
      

      JButton btnApply = new JButton("날짜 적용");
      btnApply.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            String Area;// 지역
            String data;// 날짜+지역 디비랑 비교할때 사용할 최종 데이터

            
            // 샘플 데이터,
            // 디비 연동시 get 메소드 만들어서 집어넣어주자

            // 샘플 그래프 1 설정
            Graphpanel.setNO2(22);
            Graphpanel.setOZ(75);
            Graphpanel.setCO2(140);
            Graphpanel.setSO2(25);
            Graphpanel.setFd(155);
            Graphpanel.setUd(130);
       //     Graphpanel.setBackground(Color.WHITE);

            // 샘플 그래프2 설정
            Graphpanel_2.setNO2("0,11,12,22,21,33,50");
            Graphpanel_2.setOZ("10,13,15,12,25,40,40");
            Graphpanel_2.setCO2("50,101,52,102,51,13,30");
            Graphpanel_2.setSO2("70,31,82,62,91,23,79");
            Graphpanel_2.setNO2("30,90,60,122,51,73,20");
            Graphpanel_2.setNO2("90,51,22,32,31,63,100");
            // 리페인팅
            Graphpanel.repaint();
            Graphpanel_2.repaint();
            // 버튼 눌렀을떄 엉뚱한 패널 나오는거 방지
            if (Graphpanel_2.isVisible() == true) {
               Graphpanel.setVisible(false);
            } else if (Graphpanel.isVisible() == true) {
               Graphpanel_2.setVisible(false);
            }

            //날짜 받기
            int s_month = month.getSelectedIndex() + 1; //선택된 월
            int s_date = date.getSelectedIndex() + 1;   //선택된 일
            
  
            // 선택된 날짜에 오류가 있는지 확인
            CheckDate checkD = new CheckDate();
            checkD.setDate(s_month, s_date);
            
            //  지역값 받기
            Area = (String) AreaBox.getSelectedItem();
            data = checkD.getDate() + "," + Area;
            //  입력 테스트
            System.out.println("메인 패널 입력 테스트: " + data);
         }
      });

      btnApply.setBounds(498, 239, 126, 23);
      this.add(btnApply);

      // 막대 그래프
      btnBarGraph = new JButton("막대 그래프");
      btnBarGraph.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Graphpanel.setVisible(true);
            Graphpanel_2.setVisible(false);
         }
      });
      btnBarGraph.setBounds(498, 176, 126, 23);
      this.add(btnBarGraph);

      btnLineGraph = new JButton("꺾은선 그래프");
      btnLineGraph.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Graphpanel.setVisible(false);
            Graphpanel_2.setVisible(true);
         }
      });
      btnLineGraph.setBounds(498, 209, 126, 23);
      this.add(btnLineGraph);

      // 종료 버튼
      JButton btnExit = new JButton("종료");
      btnExit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });
      btnExit.setBounds(498, 146, 126, 23);
      this.add(btnExit);

   }

   private void graphInit() {
      Graphpanel = new MainGraph_Stick();
      Graphpanel.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
      Graphpanel.setBackground(Color.WHITE);
      Graphpanel.setBounds(27, 55, 447, 214);
      this.add(Graphpanel);
   }

   private void graphInit_2() {
      Graphpanel_2 = new MainGraph_Polygonal();
      Graphpanel_2.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
      Graphpanel_2.setBounds(27, 55, 447, 214);
      Graphpanel_2.setBackground(Color.DARK_GRAY);
      this.add(Graphpanel_2);
      Graphpanel_2.setVisible(false);
   }
}