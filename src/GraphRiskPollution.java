import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraphRiskPollution extends JPanel {
	int Fd = 0;
	int Ud = 0;

	public void setFd(int x) {
		this.Fd = x;
	}

	public void setUd(int x) {
		this.Ud = x;
	}

	@Override
	public void paintComponent(Graphics g) { 
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.drawString("미세먼지", 5, 50);// 내용,x좌표,y좌표
		g.setColor(Color.ORANGE);
		g.fillRect(80, 37, Fd, 20);

		g.setColor(Color.BLACK);
		g.drawString("초미세먼지", 5, 100);
		g.setColor(Color.GREEN);
		g.fillRect(80, 87, Ud, 20);
	}
}
