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

public class MainPanel extends JPanel {
   private JButton btnNewButton;
   private JButton btnGraphType;
   private MainGraph_Stick Graphpanel;
   private MainGraph_Polygonal Graphpanel_2;
   private JComboBox start_Month, start_Date, end_Month, end_Date, AreaBox;

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
      tilteLabel.setFont(new Font("Arial", Font.BOLD, 30));
      tilteLabel.setForeground(new Color(0, 35, 110));
      tilteLabel.setHorizontalAlignment(JLabel.CENTER);
      tilteLabel.setBounds(180, 10, 270, 28);
      this.add(tilteLabel);

      JLabel lblDay = new JLabel("날짜 입력");
      lblDay.setBounds(27, 288, 57, 15);
      this.add(lblDay);

      // 시작 날짜
      String MonthList[] = new String[12];
      for (int m = 1; m < 13; m++) {
         MonthList[m - 1] = Integer.toString(m) + "월";
      }

      start_Month = new JComboBox(MonthList);
      start_Month.setBounds(96, 285, 116, 21);
      start_Month.setSize(new Dimension(55, 20));
      this.add(start_Month);

      // 날짜 리스트
      String DateList[] = new String[31];
      for (int d = 1; d < 32; d++) {
         DateList[d - 1] = Integer.toString(d) + "일";
      }

      // 시작 날짜
      start_Date = new JComboBox(DateList);
      start_Date.setBounds(155, 285, 116, 21);
      start_Date.setSize(new Dimension(55, 20));
      this.add(start_Date);

      JLabel lblSerch = new JLabel("지역 검색");
      lblSerch.setBounds(27, 319, 57, 15);
      this.add(lblSerch);

      // sample list
      String Arealist[] = { "강남구", "강남대로", "강동구", "강변북로", "강북구", "강서구", "공항대로", "관악구", "광진구", "구로구", "금천구",
    		  "노원구", "도봉구", "도산대로", "동대문구", "동작구", "동작대로", "마포구", "서대문구", "서초구", "성동구", "성북구", "송파구", "신촌로", "양천구", "영등포구", "영등포로",
    		  "용산구", "은평구", "정릉로", "종로", "종로구", "중구", "중랑구", "천호대로", "청계천로", "한강대로", "홍릉로", "화랑로" };
 
      AreaBox = new JComboBox(Arealist);
      AreaBox.setBounds(96, 317, 116, 19);
      this.add(AreaBox);
      

      JButton btnApply = new JButton("날짜 적용");
      btnApply.addActionListener(new ActionListener() {

   
         public void actionPerformed(ActionEvent e) {
            String Raw_date;// 날짜 값 받아와서 수정해야하는 원본
            String date;// 가공된 날짜
            String Area;// 지역
            String temp_day;// 날짜 가공시 사용하는 임시 변수
            String data;// 날짜+지역 디비랑 비교할때 사용할 최종 데이터
            
            ResultSet rs;

            // 날짜 값 받기
            Raw_date = (String) start_Month.getSelectedItem();
            Raw_date = Raw_date + (String) start_Date.getSelectedItem();

            // date에 한글 제거
            if (Raw_date.length() == 6) {// 두월 두일이인경우 년도만 추가
               date = Raw_date.replaceAll("[^0-9]", "");
               date = "2018" + date;

            } else if (Raw_date.length() == 4) {// 일월 일일 인경우도 년도만 추가
               date = Raw_date.replaceAll("월", "0");
               date = "2018" + "0" + date;
               date = date.replaceAll("일", "");

            } else {
               String[] temp = Raw_date.split("월");
               String tempM;
               if (temp[0].length() != 2) {// 일월이면 0추가해주기
                  tempM = "0" + temp[0];
               } else {
                  tempM = temp[0];// 이월이면 그냥 가기
               }
               temp_day = (String) start_Date.getSelectedItem();
               temp = temp_day.split("일");
               
               if (temp[0].length() != 2) {
                  temp_day = "0" + temp[0];
               } else {
                  temp_day = temp[0];
               }
               date = "2018" + tempM + temp_day;
            }
            // 지역값 받기
            Area = (String) AreaBox.getSelectedItem();
            
            PollutionDB pollution = new PollutionDB();
            rs = pollution.getPollutionDataWith(date, Area);
        	

            try {
				rs.next();
				Graphpanel.setNO2((int)(Double.parseDouble(rs.getString("NO2")) * 2000));
	            Graphpanel.setOZ((int)(Double.parseDouble(rs.getString("O3"))* 2000));
	            Graphpanel.setCO2((int)(Double.parseDouble(rs.getString("CO2"))* 500));
	            Graphpanel.setSO2((int)(Double.parseDouble(rs.getString("SO2"))* 2000));
	            Graphpanel.setFd((int)Double.parseDouble(rs.getString("FINEDUST")));
	            Graphpanel.setUd((int)Double.parseDouble(rs.getString("TINYDUST")));
	            Graphpanel.setVisible(true);
	            
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
	            
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}           
         }

		private String String(JComboBox areaBox) {
			return null;
		}
      });

      btnApply.setBounds(498, 239, 126, 23);
      this.add(btnApply);

      // 막대 그래프
      btnNewButton = new JButton("막대 그래프");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Graphpanel.setVisible(true);
            Graphpanel_2.setVisible(false);
         }
      });
      btnNewButton.setBounds(498, 176, 126, 23);
      this.add(btnNewButton);

      btnGraphType = new JButton("꺾은선 그래프");
      btnGraphType.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Graphpanel.setVisible(false);
            Graphpanel_2.setVisible(true);
         }
      });
      btnGraphType.setBounds(498, 209, 126, 23);
      this.add(btnGraphType);

      // 종료 버튼
      JButton btnExit = new JButton("종료");
      btnExit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });
      btnExit.setBounds(498, 271, 126, 23);
      this.add(btnExit);

   }

   private void graphInit() {
      Graphpanel = new MainGraph_Stick();
      Graphpanel.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
      Graphpanel.setBounds(27, 48, 447, 214);
      this.add(Graphpanel);
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
      Graphpanel_2.setVisible(false);
   }
}