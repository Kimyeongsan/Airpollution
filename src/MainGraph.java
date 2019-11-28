import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

<<<<<<< HEAD
// ���� ������ ���⿡ ����
class MainGraph_Stick extends JPanel {
	int NO2 = 100;
	int OZ = 70;
	int CO2 = 32;
	int SO2 = 22;
	int Fd = 45;
	int Ud = 100;

// ���� �̰ɷ� �����Ϸ��� �ߴµ� �۵�������~~ ����� �ؾ���~~

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
	public void paintComponent(Graphics g) { // drawXXX ���� fillXXX�� ���ΰ� ä����.
		super.paintComponent(g);

		g.setColor(Color.BLACK);// ����
		g.drawString("NO2", 5, 20);// ����,x��ǥ,y��ǥ
		g.setColor(Color.ORANGE);
		g.fillRect(80, 7, NO2, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("OZ", 5, 50);// ����,x��ǥ,y��ǥ
		g.setColor(Color.GREEN);
		g.fillRect(80, 37, OZ, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("CO2", 5, 80);// ����,x��ǥ,y��ǥ
		g.setColor(Color.ORANGE);
		g.fillRect(80, 67, CO2, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("SO2", 5, 110);// ����,x��ǥ,y��ǥ
		g.setColor(Color.GREEN);
		g.fillRect(80, 97, SO2, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("Fd", 5, 140);// ����,x��ǥ,y��ǥ
		g.setColor(Color.ORANGE);
		g.fillRect(80, 127, Fd, 20);

		g.setColor(Color.BLACK);// ����
		g.drawString("Ud", 5, 170);// ����,x��ǥ,y��ǥ
		g.setColor(Color.GREEN);
		g.fillRect(80, 157, Ud, 20);

=======


public class MainGraph {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Pollution Graph");
		frame.setLocation(500,200);
		frame.setPreferredSize(new Dimension(400,350));
		Container contentPane = frame.getContentPane();
  
		DrawingPanel drawingPanel = new DrawingPanel();
		contentPane.add(drawingPanel, BorderLayout.CENTER);
		//�׷����� �׸� �г�
  
		JPanel controlPanel = new JPanel();
		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);
		JButton button = new JButton("�׷��� �׸���");
		controlPanel.add(new JLabel("������"));
		controlPanel.add(text1);
		controlPanel.add(new JLabel("���빮��"));
		controlPanel.add(text2);
		controlPanel.add(new JLabel("������"));
		controlPanel.add(text3);
		controlPanel.add(button);
		contentPane.add(controlPanel, BorderLayout.SOUTH);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(new DrawActionListener(text1,text2,text3,drawingPanel));
		//"�׷��� �׸���" ��ư�� �������� �۵� �� �����͵��
		frame.pack();
		frame.setVisible(true);
>>>>>>> branch 'master' of https://github.com/Kimyeongsan/Airpollution.git
	}
}

//���ο� ���� ������ �׷���
class MainGraph_Polygonal extends JPanel {
// ���� ������ ���⿡ ����

	int[] NO2 = { 100, 90, 70, 120, 100, 80, 50 };
	int[] OZ = { 70, 75, 80, 85, 60, 70, 65 };
	int[] CO2 = { 32, 125, 40, 75, 85, 40, 30 };
	int[] SO2 = { 122, 120, 17, 55, 70, 80, 50 };
	int[] Fd = { 100, 66, 46, 98, 120, 134, 155 };
	int[] Ud = { 120, 60, 150, 100, 80, 90, 120 };

// ���� �̰ɷ� �����Ϸ��� �ߴµ� �۵�������~~ ����� �ؾ���~~

	public void setNO2(int x1, int x2, int x3, int x4, int x5, int x6, int x7) {

	}

	public void setOZ(int x) {

	}

	public void setCO2(int x) {

	}

	public void setSO2(int x) {
		// this.SO2 = x;
	}

	public void setFd(int x) {
		// this.Fd = x;
	}

	public void setUd(int x) {
		// this.Ud = x;
	}

	@Override
	public void paintComponent(Graphics g) { // drawXXX ���� fillXXX�� ���ΰ� ä����.
		super.paintComponent(g);

		// ����Y��
		g.setColor(Color.PINK);// ����
		g.drawString("NO2", 5, 20);// ����,x��ǥ,y��ǥ
		g.setColor(Color.RED);// ����
		g.drawString("OZ", 5, 50);// ����,x��ǥ,y��ǥ
		g.setColor(Color.YELLOW);// ����
		g.drawString("CO2", 5, 80);// ����,x��ǥ,y��ǥ
		g.setColor(Color.GREEN);// ����
		g.drawString("SO2", 5, 110);// ����,x��ǥ,y��ǥ
		g.setColor(Color.BLUE);// ����
		g.drawString("Fd", 5, 140);// ����,x��ǥ,y��ǥ
		g.setColor(Color.WHITE);// ����
		g.drawString("Ud", 5, 170);// ����,x��ǥ,y��ǥ

		// �Ⱓ 1~7�� X��
		g.drawString("DAY1", 50, 200);// ����,x��ǥ,y��ǥ
		g.drawString("DAY2", 100, 200);
		g.drawString("DAY3", 150, 200);
		g.drawString("DAY4", 200, 200);
		g.drawString("DAY5", 250, 200);
		g.drawString("DAY6", 300, 200);
		g.drawString("DAY7", 350, 200);

		int x1 = 60;// �ʱ� x��ǥ

/////////////NO2����

		// ���� �ݺ������� ����//
		for (int i = 0; i <= 6; i++) {
			g.setColor(Color.PINK);
			g.fillOval(x1, NO2[i], 5, 5);
			x1 += 50;
		}
		x1 = 60;// �ٽ� x �ʱ� ������ ����
		// ���� �ݺ����� ����
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, NO2[i] + 3, x1 + 50, NO2[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;//

//////////////////Oz�׷��� ����
		g.setColor(Color.RED);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, OZ[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, OZ[i] + 3, x1 + 50, OZ[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ

//////////////////CO2�׷��� ����
		g.setColor(Color.YELLOW);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, CO2[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, CO2[i] + 3, x1 + 50, CO2[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ

/////////SO2����
		g.setColor(Color.GREEN);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, SO2[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, SO2[i] + 3, x1 + 50, SO2[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ

//////////////Fd ����
		g.setColor(Color.BLUE);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, Fd[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, Fd[i] + 3, x1 + 50, Fd[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ
//////////Ud
		g.setColor(Color.WHITE);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, Ud[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, Ud[i] + 3, x1 + 50, Ud[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ

	}
}
