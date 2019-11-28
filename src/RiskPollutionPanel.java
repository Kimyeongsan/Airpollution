import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RiskPollutionPanel extends JPanel {
	
	public RiskPollutionPanel(JFrame frame) {
		super();
		panelInit(frame);
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
		
		this.setVisible(false);
	}
}
