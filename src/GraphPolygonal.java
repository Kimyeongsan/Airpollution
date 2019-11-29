
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



//���ο� ���� ������ �׷���
class MainGraph_Polygonal extends JPanel {
// ���� ������ ���⿡ ����
// �ְ� ��10 ���� 160
//��ü ����(160) ���Ž� ����<0  �ְ� 150
	
	//�ʱ� ���� ������
	int[] NO2 = {0,0,0,0,0,0,0};
	int[] OZ = {0,0,0,0,0,0,0};
	int[] CO2 = {0,0,0,0,0,0,0};
	int[] SO2 = {0,0,0,0,0,0,0};
	int[] Fd = {0,0,0,0,0,0,0};
	int[] Ud = {0,0,0,0,0,0,0};


	
	//�����͸� �迭�� �޾ƾ����� �� ��񿡼� ��� �Ѿ�������� �𸣰ڳ�
	//��Ʈ������ �޾Ƽ� ,�� ��������
	public void setNO2(String a) {
			
		String[] temp=a.split(",");
		for(int i=0;i<=6;i++) {
			NO2[i]=Integer.parseInt(temp[i]);
		}
	}
	public void setOZ(String a) {
		
		String[] temp=a.split(",");
		for(int i=0;i<=6;i++) {
			OZ[i]=Integer.parseInt(temp[i]);
		}
	}
	public void setSO2(String a) {
		
		String[] temp=a.split(",");
		for(int i=0;i<=6;i++) {
			SO2[i]=Integer.parseInt(temp[i]);
		}
	}
	public void setCO2(String a) {
		
		String[] temp=a.split(",");
		for(int i=0;i<=6;i++) {
			CO2[i]=Integer.parseInt(temp[i]);
		}
	}
	public void setFd(String a) {
		
		String[] temp=a.split(",");
		for(int i=0;i<=6;i++) {
			Fd[i]=Integer.parseInt(temp[i]);
		}
	}
	public void setUd(String a) {
		
		String[] temp=a.split(",");
		for(int i=0;i<=6;i++) {
			Ud[i]=Integer.parseInt(temp[i]);
		}
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
			g.fillOval(x1, 160-NO2[i], 5, 5);
			x1 += 50;
		}
		x1 = 60;// �ٽ� x �ʱ� ������ ����
		// ���� �ݺ����� ����
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, 160-NO2[i] + 3, x1 + 50, 160-NO2[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;//

//////////////////Oz�׷��� ����
		g.setColor(Color.RED);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-OZ[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, 160-OZ[i] + 3, x1 + 50, 160-OZ[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ

//////////////////CO2�׷��� ����
		g.setColor(Color.YELLOW);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-CO2[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, 160-CO2[i] + 3, x1 + 50, 160-CO2[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ

/////////SO2����
		g.setColor(Color.GREEN);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-SO2[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, 160-SO2[i] + 3, x1 + 50, 160-SO2[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ

//////////////Fd ����
		g.setColor(Color.BLUE);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-Fd[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1,160- Fd[i] + 3, x1 + 50,160- Fd[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ
//////////Ud
		g.setColor(Color.WHITE);
		for (int i = 0; i <= 6; i++) {
			g.fillOval(x1, 160-Ud[i], 5, 5);
			x1 += 50;
		}

		x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, 160-Ud[i] + 3, x1 + 50, 160-Ud[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;// �׷��� �׸��� �ٽ� ����ġ

	}
}
