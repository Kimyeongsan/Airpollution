
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



//메인에 들어가는 꺾은선 그래프
class MainGraph_Polygonal extends JPanel {
// 변수 데이터 여기에 선언
// 최고 높10 최저 160
//전체 높이(160) 제거시 최저<0  최고 150
	
	//초기 샘플 데이터
	int[] NO2 = {0,0,0,0,0,0,0};
	int[] OZ = {0,0,0,0,0,0,0};
	int[] CO2 = {0,0,0,0,0,0,0};
	int[] SO2 = {0,0,0,0,0,0,0};
	int[] Fd = {0,0,0,0,0,0,0};
	int[] Ud = {0,0,0,0,0,0,0};


	
	//데이터를 배열로 받아야할지 뭐 디비에서 어떻게 넘어오는지를 모르겠네
	//스트링으로 받아서 ,로 나누는지
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
	public void paintComponent(Graphics g) { // drawXXX 말고 fillXXX는 내부가 채워짐.
		super.paintComponent(g);

		// 종류Y축
		g.setColor(Color.PINK);// 글자
		g.drawString("NO2", 5, 20);// 내용,x좌표,y좌표
		g.setColor(Color.RED);// 글자
		g.drawString("OZ", 5, 50);// 내용,x좌표,y좌표
		g.setColor(Color.YELLOW);// 글자
		g.drawString("CO2", 5, 80);// 내용,x좌표,y좌표
		g.setColor(Color.GREEN);// 글자
		g.drawString("SO2", 5, 110);// 내용,x좌표,y좌표
		g.setColor(Color.BLUE);// 글자
		g.drawString("Fd", 5, 140);// 내용,x좌표,y좌표
		g.setColor(Color.WHITE);// 글자
		g.drawString("Ud", 5, 170);// 내용,x좌표,y좌표

		// 기간 1~7일 X축
		g.drawString("DAY1", 50, 200);// 내용,x좌표,y좌표
		g.drawString("DAY2", 100, 200);
		g.drawString("DAY3", 150, 200);
		g.drawString("DAY4", 200, 200);
		g.drawString("DAY5", 250, 200);
		g.drawString("DAY6", 300, 200);
		g.drawString("DAY7", 350, 200);

		int x1 = 60;// 초기 x좌표

/////////////NO2시작

		// 점찍 반복문으로 수정//
		for (int i = 0; i <= 6; i++) {
			g.setColor(Color.PINK);
			g.fillOval(x1, 160-NO2[i], 5, 5);
			x1 += 50;
		}
		x1 = 60;// 다시 x 초기 값으로 셋팅
		// 직선 반복으로 수정
		for (int i = 0; i < 6; i++) {
			g.drawLine(x1, 160-NO2[i] + 3, x1 + 50, 160-NO2[i + 1] + 3);
			x1 += 50;
		}
		x1 = 60;//

//////////////////Oz그래프 시작
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
		x1 = 60;// 그래프 그리고 다시 원위치

//////////////////CO2그래프 시작
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
		x1 = 60;// 그래프 그리고 다시 원위치

/////////SO2시작
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
		x1 = 60;// 그래프 그리고 다시 원위치

//////////////Fd 시작
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
		x1 = 60;// 그래프 그리고 다시 원위치
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
		x1 = 60;// 그래프 그리고 다시 원위치

	}
}
