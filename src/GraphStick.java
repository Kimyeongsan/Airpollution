
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MainGraph_Stick extends JPanel {
	

	private int NO2=0;
	private int OZ=0;
	private int CO2=0;
	private int SO2=0;
	private int Fd=0;
	private int Ud=0;


	public void setNO2(int x) {
		this.NO2 = x;
	}

	public void setOZ(int x) {
		this.OZ = x;
	}

	public void setCO2(int x) {
		this.CO2 = x;
	}

	public void setSO2(int x) {
		this.SO2 = x;
	}

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
		g.drawString("NO2", 5, 20);
		g.setColor(Color.PINK);
		g.fillRect(80, 7, NO2, 20);

		g.setColor(Color.BLACK);
		g.drawString("OZ", 5, 50);
		g.setColor(new Color(255, 150, 150));
		g.fillRect(80, 37, OZ, 20);

		g.setColor(Color.BLACK);
		g.drawString("CO2", 5, 80);
		g.setColor(Color.ORANGE);
		g.fillRect(80, 67, CO2, 20);

		g.setColor(Color.BLACK);
		g.drawString("SO2", 5, 110);
		g.setColor(new Color(100, 255, 100));
		g.fillRect(80, 97, SO2, 20);

		g.setColor(Color.BLACK);
		g.drawString("Fd", 5, 140);
		g.setColor(new Color(140, 155, 255));
		g.fillRect(80, 127, Fd, 20);

		g.setColor(Color.BLACK);
		g.drawString("Ud", 5, 170);
		g.setColor(new Color(210, 150, 255));
		g.fillRect(80, 157, Ud, 20);
	}
}
