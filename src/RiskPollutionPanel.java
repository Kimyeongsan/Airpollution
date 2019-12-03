import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Database.PollutionDB;

public class RiskPollutionPanel extends JPanel {
	private JTextField textField;
	private JComboBox riskBoxArea;
	private GraphRiskPollution GraphRiskpanel;
	private RiskPollutuin_image Imagepanel;

	public RiskPollutionPanel(JFrame frame) {
		super();
		panelInit(frame);
		graphInit();
		imageInit();
	}

	private void panelInit(JFrame frame) {
		this.setBackground(new Color(225, 240, 255));
		this.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(this);
		this.setLayout(null);

		JLabel PollutionLabel = new JLabel("Local Pollution degree of risk");

		PollutionLabel.setFont(new Font("Arial", Font.BOLD, 35));
		PollutionLabel.setForeground(new Color(0, 35, 110));
		PollutionLabel.setHorizontalAlignment(JLabel.CENTER);
		PollutionLabel.setBounds(70, 5, 500, 40);
		this.add(PollutionLabel);

		String Arealist[] = { "강남구", "강남대로", "강동구", "강변북로", "강북구", "강서구", "공항대로", "관악구", "광진구", "구로구", "금천구", "노원구",
				"도봉구", "도산대로", "동대문구", "동작구", "동작대로", "마포구", "서대문구", "서초구", "성동구", "성북구", "송파구", "신촌로", "양천구", "영등포구",
				"영등포로", "용산구", "은평구", "정릉로", "종로", "종로구", "중구", "중랑구", "천호대로", "청계천로", "한강대로", "홍릉로", "화랑로" };

		JLabel risk_compareLabel = new JLabel("지역 선택");
		risk_compareLabel.setBounds(38, 70, 100, 15);
		this.add(risk_compareLabel);

		riskBoxArea = new JComboBox(Arealist);
		riskBoxArea.setBounds(113, 61, 96, 21);
		this.add(riskBoxArea);

		JLabel risk_date_Label = new JLabel("날짜 입력");
		risk_date_Label.setBounds(38, 101, 63, 15);
		this.add(risk_date_Label);
		
		// 시작 날짜
		String MonthList[] = new String[12];
		for (int m = 1; m < 13; m++) {
			MonthList[m - 1] = Integer.toString(m) + "월";
		}
		// 날짜 리스트
		String DateList[] = new String[31];
		for (int d = 1; d < 32; d++) {
			DateList[d - 1] = Integer.toString(d) + "일";
		}

		JComboBox risk_month = new JComboBox(MonthList);
		risk_month.setBounds(110, 98, 96, 21);
		risk_month.setSize(new Dimension(55, 20));
		this.add(risk_month);
		
		JComboBox risk_date = new JComboBox(DateList);
		risk_date.setBounds(170, 98, 96, 21);
		risk_date.setSize(new Dimension(55, 20));
		this.add(risk_date);
		
		JButton btnCompareSet = new JButton("적용");
		btnCompareSet.setBounds(235, 98, 65, 20);
		this.add(btnCompareSet);
		// 적용버튼 리스너
		btnCompareSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Area;

				ResultSet rs;

				// 날짜 값 받기
	            int s_month = risk_month.getSelectedIndex() + 1;
	            int s_date = risk_date.getSelectedIndex() + 1;
	            //선택한 날짜에 오류가 있는지 확인
	            CheckDate risk_check = new CheckDate();
	            risk_check.setDate(s_month, s_date);

				// 지역값 받기
				Area = (String) riskBoxArea.getSelectedItem();

				PollutionDB pollution = new PollutionDB();
				rs = pollution.getPollutionDataWith(risk_check.getDate(), Area);
				
				try {
					rs.next();

					GraphRiskpanel.setFd((int) Double.parseDouble(rs.getString("FINEDUST")));
					GraphRiskpanel.setUd((int) Double.parseDouble(rs.getString("TINYDUST")));
					GraphRiskpanel.setVisible(true);

					GraphRiskpanel.repaint();

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			private String String(JComboBox riskBoxArea) {
				return null;
			}
		});

		this.setVisible(false);
	}

	private void graphInit() {
		GraphRiskpanel = new GraphRiskPollution();
		GraphRiskpanel.setBounds(18, 136, 228, 200);
		GraphRiskpanel.setBackground(Color.white);
		GraphRiskpanel.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(GraphRiskpanel);
		GraphRiskpanel.setVisible(true);
	}

	private void imageInit() {
		Imagepanel = new RiskPollutuin_image();
		Imagepanel.setBounds(260, 138, 360, 190);
		Imagepanel.setBorder(BorderFactory.createLineBorder(Color.black));

		this.add(Imagepanel);
		Imagepanel.setVisible(true);
	}

}