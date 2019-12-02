
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RiskPollutionPanel extends JPanel {
	private GraphRiskPollution GraphRiskpanel;
	private RiskPollutuin_image Imagepanel;
	private JTextField textField_D1;

	
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
		
		JLabel selectArea_Label = new JLabel("지역 선택");
		selectArea_Label.setBounds(38, 70, 100, 15);
		this.add(selectArea_Label);
		
		String Arealist[] = { "강서구", "강북구", "강동구" };
		JComboBox comboBoxArea = new JComboBox(Arealist);
		comboBoxArea.setBounds(120, 68, 96, 21);
		this.add(comboBoxArea);
		
		JLabel lbl_writeDate = new JLabel("날짜 입력");
		lbl_writeDate.setBounds(38, 101, 63, 15);
		this.add(lbl_writeDate);
		
		
		String MonthList[] = new String[12];
		for (int m = 1; m < 13; m++) {
			MonthList[m - 1] = Integer.toString(m) + "월";
		}
		// 날짜 리스트
		String DateList[] = new String[31];
		for (int d = 1; d < 32; d++) {
			DateList[d - 1] = Integer.toString(d) + "일";
		}
		
		//월
		JComboBox month = new JComboBox(MonthList);
		month.setBounds(110, 98, 96, 21);
		month.setSize(new Dimension(55, 20));
		this.add(month);
		//일
		JComboBox date = new JComboBox(DateList);
		date.setBounds(170, 98, 96, 21);
		date.setSize(new Dimension(55, 20));
		this.add(date);


		JButton btnCompareSet = new JButton("적용");
		btnCompareSet.setBounds(235, 98, 65, 20);
		btnCompareSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            String Area;  
	            String data;
	            
				
				//날짜 받기
	            int s_month = month.getSelectedIndex() + 1; //선택된 월
	            int s_date = date.getSelectedIndex() + 1;   //선택된 일
	            
	            // 선택된 날짜에 오류가 있는지 확인
	            CheckDate checkD = new CheckDate();
	            checkD.setDate(s_month, s_date);
	            
	            //  지역값 받기
	            Area = (String) comboBoxArea.getSelectedItem();
	            data = checkD.getDate() + "," + Area;
	            //  입력 테스트
	            System.out.println("위험농도 패널 입력 테스트: " + data);
	        	 
			} 
		});
	         
		this.add(btnCompareSet);
		this.setVisible(false);
	}
	
	private void graphInit() {
		GraphRiskpanel = new GraphRiskPollution();
		GraphRiskpanel.setBounds(18, 136, 228, 200);
		GraphRiskpanel.setBackground(Color.WHITE);
		GraphRiskpanel.setBorder(BorderFactory.createLineBorder(Color.black));
		GraphRiskpanel.setFd(12);
		GraphRiskpanel.setFd(32);

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

