import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraphPollution_Compare extends JPanel {
	private int Fd = 0;
	private int Ud = 0;
//	int[] fd = { 0, 0, 0, 0, 0, 0, 0 };
//	int[] ud = { 0, 0, 0, 0, 0, 0, 0 };
//	int tempFD = 0;
//	int tempUD = 0;
//
//	public void setFd(String a) {
//		// this.Fd = x;
//		String[] temp = a.split(",");
//		for (int i = 0; i <= 6; i++) {
//			fd[i] = Integer.parseInt(temp[i]);
//		}
//		for (int i = 0; i <= 6; i++) {
//			tempFD = tempFD + fd[i];
//			Fd = tempFD / 7;
//		}
//	}
//
//	public void setUd(String a) {
//		// this.Fd = x;
//		String[] temp = a.split(",");
//		for (int i = 0; i <= 6; i++) {
//			fd[i] = Integer.parseInt(temp[i]);
//		}
//		for (int i = 0; i <= 6; i++) {
//			tempUD = tempUD + fd[i];
//			Ud = tempUD / 7;
//		}
//	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.drawString("미세먼지", 5, 50);
		g.setColor(Color.ORANGE);
		g.fillRect(80, 37, Fd, 20);

		g.setColor(Color.BLACK);
		g.drawString("초미세먼지", 5, 100);
		g.setColor(Color.GREEN);
		g.fillRect(80, 87, Ud, 20);

		// 아래 기준라인
		g.setColor(Color.BLACK);// 글자
		g.drawString("0", 80, 145);// 내용 x y 80, y+140 기준
		g.setColor(Color.BLACK);
		g.drawString("10", 105, 145);
		g.setColor(Color.BLACK);
		g.drawString("20", 138, 145);
		g.setColor(Color.BLACK);
		g.drawString("30", 170, 145);
		g.setColor(Color.BLACK);
		g.drawString("40", 200, 145);

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
