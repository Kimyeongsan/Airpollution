import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CompareApGraph extends JPanel {
	// 변수 데이터 여기에 선언

	int Fd = 45;
	int Ud = 100;

	// 대충 이걸로 조절하려고 했는데 작동안하쥬~~ 토요일 해야쥬~~
	public void setFd(int x) {
		this.Fd = x;
	}

	public void setUd(int x) {
		this.Ud = x;
	}

	@Override
	public void paintComponent(Graphics g) { // drawXXX 말고 fillXXX는 내부가 채워짐.
		super.paintComponent(g);

		g.setColor(Color.BLACK);// 글자
		g.drawString("미세먼지", 5, 50);// 내용,x좌표,y좌표
		g.setColor(Color.ORANGE);
		g.fillRect(80, 37, Fd, 20);

		g.setColor(Color.BLACK);// 글자
		g.drawString("초미세먼지", 5, 100);// 내용,x좌표,y좌표
		g.setColor(Color.GREEN);
		g.fillRect(80, 87, Ud, 20);
	}
}