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
<<<<<<< HEAD
		public void paintComponent(Graphics g) { 
=======
		public void paintComponent(Graphics g) {
>>>>>>> refs/remotes/origin/master
			super.paintComponent(g);

			g.setColor(Color.BLACK);
			g.drawString("미세먼지", 5, 50);
			g.setColor(Color.ORANGE);
			g.fillRect(80, 37, Fd, 20);

			g.setColor(Color.BLACK);
			g.drawString("초미세먼지", 5, 100);
			g.setColor(Color.GREEN);
			g.fillRect(80, 87, Ud, 20);
		}
}
