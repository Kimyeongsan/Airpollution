import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PollutionRisk extends JPanel {
	public PollutionRisk() {
		JPanel PollutionRisk = new PollutionRisk();
		
		PollutionRisk.setBackground(new Color(225, 240, 255));
		PollutionRisk.setBounds(0, 0, 636, 360);
		PollutionRisk.setLayout(null);
		
		JLabel PollutionLabel = new JLabel("Local Pollution degree of risk");
		
		PollutionLabel.setFont(new Font("Arial", Font.BOLD, 25));
		PollutionLabel.setForeground(Color.BLUE);
		PollutionLabel.setHorizontalAlignment(JLabel.CENTER);
		PollutionLabel.setBounds(118, 10, 393, 28);
		PollutionRisk.add(PollutionLabel);
	}
}
