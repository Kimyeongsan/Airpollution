import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraphPollution_Compare extends JPanel {
		int Fd = 45;
		int Ud = 100;
		
		public void setFd(int x) {
			this.Fd = x;
		}

		public void setUd(int x) {
			this.Ud = x;
		}

		@Override
		public void paintComponent(Graphics g) { 
			super.paintComponent(g);

			g.setColor(Color.BLACK);// ±ÛÀÚ
			g.drawString("¹Ì¼¼¸ÕÁö", 5, 50);// ³»¿ë,xÁÂÇ¥,yÁÂÇ¥
			g.setColor(Color.ORANGE);
			g.fillRect(80, 37, Fd, 20);

			g.setColor(Color.BLACK);// ±ÛÀÚ
			g.drawString("ÃÊ¹Ì¼¼¸ÕÁö", 5, 100);// ³»¿ë,xÁÂÇ¥,yÁÂÇ¥
			g.setColor(Color.GREEN);
			g.fillRect(80, 87, Ud, 20);
		}
}
