
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Main {
	static JMenuBar mb;
	static JMenu x;
	static JMenuItem m1, m2, m3;
	private JButton btnNewButton;
	private JButton btnGraphType;
	private JComboBox start_Month, start_Date, end_Month, end_Date;
	
	private JFrame frame;

	private MainPanel Mainpanel;
	private PollutionComparePanel pollutionComparePanel;
	private RiskPollutionPanel RiskPollutionPanel;
	
	private void menuInit() {
		////// 메뉴바 구현
		mb = new JMenuBar();
		x = new JMenu("Menu");

		m1 = new JMenuItem("Main 화면");
		m2 = new JMenuItem("지역별 오염도 비교");
		m3 = new JMenuItem("미세먼지 위험 농도 비교");

		x.add(m1);
		x.add(m2);
		x.add(m3);

		mb.add(x);
		frame.setJMenuBar(mb);
		frame.setSize(650, 420);
		frame.setVisible(true);

		m1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Mainpanel.setVisible(true);
				pollutionComparePanel.setVisible(false);
				RiskPollutionPanel.setVisible(false);
			}
		});

		m2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Mainpanel.setVisible(false);
				pollutionComparePanel.setVisible(true);
				RiskPollutionPanel.setVisible(false);
			}
		});

		m3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Mainpanel.setVisible(false);
				pollutionComparePanel.setVisible(false);
				RiskPollutionPanel.setVisible(true);
			}
		});

	}

	private void frameInit() {
		frame.setTitle("Air Pollution Project");
		frame.setBounds(100, 100, 650, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}

	private void Initialize() {
		frameInit();
		menuInit();
		Mainpanel = new MainPanel(frame);
		pollutionComparePanel = new PollutionComparePanel(frame);
		RiskPollutionPanel = new RiskPollutionPanel(frame);
	}

	public Main() {
		frame = new JFrame();
		Initialize();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
