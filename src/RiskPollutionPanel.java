
import java.awt.Color;
import java.awt.Font;

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
		
		PollutionLabel.setFont(new Font("Arial", Font.BOLD, 25));
		PollutionLabel.setForeground(Color.BLUE);
		PollutionLabel.setHorizontalAlignment(JLabel.CENTER);
		PollutionLabel.setBounds(118, 10, 393, 28);
		this.add(PollutionLabel);
		
		JLabel fisrt_compareLabel = new JLabel("지역선택A");
		fisrt_compareLabel.setBounds(38, 64, 63, 15);
		this.add(fisrt_compareLabel);
		
		String Arealist[] = { "강서구", "강북구", "강동구" };
		JComboBox comboBoxArea1 = new JComboBox(Arealist);
		comboBoxArea1.setBounds(113, 61, 96, 21);
		this.add(comboBoxArea1);
		
		JLabel lblNewLabel_2 = new JLabel("날짜 입력");
		lblNewLabel_2.setBounds(38, 101, 63, 15);
		this.add(lblNewLabel_2);
		
		// 첫번째 날짜 입력
		textField_D1 = new JTextField();
		textField_D1.setBounds(113, 98, 96, 21);
		this.add(textField_D1);
		textField_D1.setColumns(10);

		JButton btnCompareSet = new JButton("적용");
		btnCompareSet.setBounds(215, 98, 65, 20);
		this.add(btnCompareSet);
	
		this.setVisible(false);
	}
	
	private void graphInit() {
		GraphRiskpanel = new GraphRiskPollution();
		GraphRiskpanel.setBounds(18, 136, 228, 200);
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

