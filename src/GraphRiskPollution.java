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
		g.setColor(Color.BLACK);
		g.drawString(Integer.toString(Fd), 160, 50);
		g.setColor(new Color(140, 155, 255));
		g.fillRect(80, 37, Fd, 20);

		g.setColor(Color.BLACK);
		g.drawString("초미세먼지", 5, 100);
		g.setColor(Color.BLACK);
		g.drawString(Integer.toString(Ud), 160, 100);
		g.setColor(new Color(210, 150, 255));
		g.fillRect(80, 87, Ud, 20);

		// 아래 기준라인
		g.setColor(Color.BLACK);// 글자
		g.drawString("0", 80, 145);// 내용 x y 80, y+140 기준
		g.setColor(Color.BLACK);
		g.drawString("30", 105, 145);
		g.setColor(Color.BLACK);
		g.drawString("60", 138, 145);
		g.setColor(Color.BLACK);
		g.drawString("90", 170, 145);
		g.setColor(Color.BLACK);
		g.drawString("120", 200, 145);

		// 밑라인
		g.drawLine(80, 130, 207, 130);

		// 깔짝라인
		int xx = 80;
		for (int i = 0; i <= 5; i++) {
			g.drawLine(xx, 125, xx, 130);
			xx = xx + 32;
		}
	}
}
