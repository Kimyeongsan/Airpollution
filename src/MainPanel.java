<<<<<<< HEAD
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	private JButton btnNewButton;
	private JButton btnGraphType;
	private MainGraph_Stick Graphpanel;
	private MainGraph_Polygonal Graphpanel_2;
	private JComboBox start_Month, start_Date, end_Month, end_Date,AreaBox;

	public MainPanel(JFrame frame) {
		super();
		panelInit(frame);
		graphInit();
		graphInit_2();
	}

	private void panelInit(JFrame frame) {
		// ë©”ì¸ í™”ë©´ íŒ¨ë„
		this.setBackground(new Color(225, 240, 255));
		this.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(this);
		this.setLayout(null);

		// ë©”ì¸ í™”ë©´ ë¼ë²¨
		JLabel tilteLabel = new JLabel("Air Pollution");
		tilteLabel.setFont(new Font("Arial", Font.BOLD, 30));
		tilteLabel.setForeground(new Color(0, 35, 110));
		tilteLabel.setHorizontalAlignment(JLabel.CENTER);
		tilteLabel.setBounds(180, 10, 270, 28);
		this.add(tilteLabel);

		JLabel lblDay = new JLabel("ë‚ ì§œ ìž…ë ¥");
		lblDay.setBounds(27, 288, 57, 15);
		this.add(lblDay);

		// ì‹œìž‘ ë‚ ì§œ
		String MonthList[] = new String[12];
		for (int m = 1; m < 13; m++) {
			MonthList[m - 1] = Integer.toString(m) + "ì›”";
		}

		start_Month = new JComboBox(MonthList);
		start_Month.setBounds(96, 285, 116, 21);
		start_Month.setSize(new Dimension(55, 20));
		this.add(start_Month);

		// ë‚ ì§œ ë¦¬ìŠ¤íŠ¸
		String DateList[] = new String[31];
		for (int d = 1; d < 32; d++) {
			DateList[d - 1] = Integer.toString(d) + "ì¼";
		}

		// ì‹œìž‘ ë‚ ì§œ
		start_Date = new JComboBox(DateList);
		start_Date.setBounds(155, 285, 116, 21);
		start_Date.setSize(new Dimension(55, 20));
		this.add(start_Date);
		
		
		JLabel lblSerch = new JLabel("ì§€ì—­ ê²€ìƒ‰");
		lblSerch.setBounds(27, 319, 57, 15);
		this.add(lblSerch);

		// sample list
		String Arealist[] = { "ê°•ì„œêµ¬", "ê°•ë¶êµ¬", "ê°•ë™êµ¬" };
		AreaBox = new JComboBox(Arealist);
		AreaBox.setBounds(96, 317, 116, 19);
		this.add(AreaBox);
		/*
		// ê¸°ê°„(~) ë¼ë²¨
		JLabel termLabel = new JLabel(" ~ ");
		termLabel.setBounds(210, 288, 57, 15);
		this.add(termLabel);
		// ë ë‚ ì§œ
		end_Month = new JComboBox(MonthList);
		end_Month.setBounds(224, 285, 116, 21);
		end_Month.setSize(new Dimension(55, 20));
		this.add(end_Month);
		end_Date = new JComboBox(DateList);
		end_Date.setBounds(284, 285, 116, 21);
		end_Date.setSize(new Dimension(55, 20));
		this.add(end_Date);
		
		*/

		JButton btnApply = new JButton("ë‚ ì§œ ì ìš©");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Raw_date;//ë‚ ì§œ ê°’ ë°›ì•„ì™€ì„œ ìˆ˜ì •í•´ì•¼í•˜ëŠ” ì›ë³¸
				String date;//ê°€ê³µëœ ë‚ ì§œ
				String Area;//ì§€ì—­ 
				String temp_day;//ë‚ ì§œ ê°€ê³µì‹œ ì‚¬ìš©í•˜ëŠ” ìž„ì‹œ ë³€ìˆ˜
				String data;//ë‚ ì§œ+ì§€ì—­
	
				// ìƒ˜í”Œ ë°ì´í„°,
				// ë””ë¹„ ì—°ë™ì‹œ get ë©”ì†Œë“œ ë§Œë“¤ì–´ì„œ ì§‘ì–´ë„£ì–´ì£¼ìž

				// ìƒ˜í”Œ ê·¸ëž˜í”„ 1 ì„¤ì •
				Graphpanel.setNO2(22);
				Graphpanel.setOZ(75);
				Graphpanel.setCO2(140);
				Graphpanel.setSO2(25);
				Graphpanel.setFd(155);
				Graphpanel.setUd(130);
				Graphpanel.setVisible(true);

				// ìƒ˜í”Œ ê·¸ëž˜í”„2 ì„¤ì •
				Graphpanel_2.setNO2("0,11,12,22,21,33,50");
				Graphpanel_2.setOZ("10,13,15,12,25,40,40");
				Graphpanel_2.setCO2("50,101,52,102,51,13,30");
				Graphpanel_2.setSO2("70,31,82,62,91,23,79");
				Graphpanel_2.setNO2("30,90,60,122,51,73,20");
				Graphpanel_2.setNO2("90,51,22,32,31,63,100");
				// ë¦¬íŽ˜ì¸íŒ…
				Graphpanel.repaint();
				Graphpanel_2.repaint();
				// ë²„íŠ¼ ëˆŒë €ì„Â‹Âš ì—‰ëš±í•œ íŒ¨ë„ ë‚˜ì˜¤ëŠ”ê±° ë°©ì§€
				if (Graphpanel_2.isVisible() == true) {
					Graphpanel.setVisible(false);
				} else if (Graphpanel.isVisible() == true) {
					Graphpanel_2.setVisible(false);
				}
				
				//ë‚ ì§œ ê°’ ë°›ê¸° 
				Raw_date=(String) start_Month.getSelectedItem();
				Raw_date=Raw_date+(String) start_Date.getSelectedItem();
			//	System.out.println(date);//í˜„ìž¬ 0ì›”0ì¼ ì´ëŸ° í˜•ì‹ìœ¼ë¡œ ë“¤ì–´ì˜´ ìˆ˜ì • í•„ìš”
				//dateì— í•œê¸€ ì œê±°
				if(Raw_date.length()==6) {//ë‘ì›” ë‘ì¼ì´ì¸ê²½ìš° ë…„ë„ë§Œ ì¶”ê°€
					date = Raw_date.replaceAll("[^0-9]","");
					date="2018"+date;
				//	System.out.println(date);
				}else if(Raw_date.length()==4) {//ì¼ì›” ì¼ì¼ ì¸ê²½ìš°ë„ ë…„ë„ë§Œ ì¶”ê°€
					date = Raw_date.replaceAll("ì›”","0");
					date="2018"+"0"+date;
					date=date.replaceAll("ì¼", "");
				//	System.out.println(date);
					
					
					
					
					//ì—¬ê¸°ì„œ ë¶€í„° ì§„ì§œ 
					//ìˆ˜ì •ì¤‘
				}else{
					String[] temp = Raw_date.split("ì›”");
					String tempM;
					if(temp[0].length()!=2) {//ì¼ì›”ì´ë©´ 0ì¶”ê°€í•´ì£¼ê¸°
						tempM="0"+temp[0];
					}else {
						tempM=temp[0];//ì´ì›”ì´ë©´ ê·¸ëƒ¥ ê°€ê¸°
					}
					//tempM=í•œê°œì§œë¦¬ ì›” ìž˜ë¼ì„œ ì•žì— 0ë¶™ížŒ ìƒíƒœ
					//System.out.println(tempM);//test
					
					
					temp_day=(String) start_Date.getSelectedItem();
					//System.out.println(temp_day);//test
					temp = temp_day.split("ì¼");
					if(temp[0].length()!=2) {
						temp_day="0"+temp[0];
					}else {
						temp_day=temp[0];
					}
					date="2018"+tempM+temp_day;
					//System.out.println(date);//ìµœì¢… í…ŒìŠ¤íŠ¸ êµ¿
					
					
					/*
					//ì´ì œ ì¼ë¶€ë¶„
					String[] temp_day=Raw_date.split("ì¼");
					if(temp_day[2].length()!=3) {//ì¼ì›”ì´ë©´ 0ì¶”ê°€í•´ì£¼ê¸°
						tempM=tempM+"0"+temp_day[2];
					}else {
						tempM=tempM+temp_day[2];//ì´ì›”ì´ë©´ ê·¸ëƒ¥ ê°€ê¸°
					}
					date=tempM;
					System.out.println(date);
					*/
				}
				
				
				//dateì˜ ê° ìˆ«ìžê°€<10ì¸ê²½ìš° ì•žì— 0ì¶”ê°€
				//2018+date
				
				//ì§€ì—­ê°’ ë°›ê¸°
				Area=(String) AreaBox.getSelectedItem();
				data=date+","+Area;
				System.out.println("ë©”ì¸íŒ¨ë„ ë°ì´í„° ìž…ë ¥ í…ŒìŠ¤íŠ¸: "+data);
			}
		});

		btnApply.setBounds(498, 239, 126, 23);
		this.add(btnApply);

		// ë§‰ëŒ€ ê·¸ëž˜í”„
		btnNewButton = new JButton("ë§‰ëŒ€ ê·¸ëž˜í”„");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphpanel.setVisible(true);
				Graphpanel_2.setVisible(false);
			}
		});
		btnNewButton.setBounds(498, 176, 126, 23);
		this.add(btnNewButton);

		btnGraphType = new JButton("êº¾ì€ì„  ê·¸ëž˜í”„");
		btnGraphType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphpanel.setVisible(false);
				Graphpanel_2.setVisible(true);
			}
		});
		btnGraphType.setBounds(498, 209, 126, 23);
		this.add(btnGraphType);

		// ì¢…ë£Œ ë²„íŠ¼
		JButton btnExit = new JButton("ì¢…ë£Œ");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(498, 146, 126, 23);
		this.add(btnExit);

		
	}

	private void graphInit() {
		Graphpanel = new MainGraph_Stick();
		Graphpanel.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel.setBounds(27, 48, 447, 214);
		this.add(Graphpanel);
	}

	private void graphInit_2() {
		Graphpanel_2 = new MainGraph_Polygonal();
		Graphpanel_2.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel_2.setBounds(27, 48, 447, 214);
		this.add(Graphpanel_2);

		Graphpanel_2.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel_2.setBounds(27, 48, 447, 214);
		Graphpanel_2.setBackground(Color.DARK_GRAY);
		this.add(Graphpanel_2);
		Graphpanel_2.setVisible(false);
	}
}
=======

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	private JButton btnNewButton;
	private JButton btnGraphType;
	private MainGraph_Stick Graphpanel;
	private MainGraph_Polygonal Graphpanel_2;
	private JComboBox start_Month, start_Date, end_Month, end_Date, AreaBox;

	public MainPanel(JFrame frame) {
		super();
		panelInit(frame);
		graphInit();
		graphInit_2();
	}

	private void panelInit(JFrame frame) {
		// ¸ÞÀÎ È­¸é ÆÐ³Î
		this.setBackground(new Color(225, 240, 255));
		this.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(this);
		this.setLayout(null);

		// ¸ÞÀÎ È­¸é ¶óº§
		JLabel tilteLabel = new JLabel("Air Pollution");
		tilteLabel.setFont(new Font("Arial", Font.BOLD, 30));
		tilteLabel.setForeground(new Color(0, 35, 110));
		tilteLabel.setHorizontalAlignment(JLabel.CENTER);
		tilteLabel.setBounds(180, 10, 270, 28);
		this.add(tilteLabel);

		JLabel lblDay = new JLabel("³¯Â¥ ÀÔ·Â");
		lblDay.setBounds(27, 288, 57, 15);
		this.add(lblDay);

		// ½ÃÀÛ ³¯Â¥
		String MonthList[] = new String[12];
		for (int m = 1; m < 13; m++) {
			MonthList[m - 1] = Integer.toString(m) + "¿ù";
		}

		start_Month = new JComboBox(MonthList);
		start_Month.setBounds(96, 285, 116, 21);
		start_Month.setSize(new Dimension(55, 20));
		this.add(start_Month);

		// ³¯Â¥ ¸®½ºÆ®
		String DateList[] = new String[31];
		for (int d = 1; d < 32; d++) {
			DateList[d - 1] = Integer.toString(d) + "ÀÏ";
		}

		// ½ÃÀÛ ³¯Â¥
		start_Date = new JComboBox(DateList);
		start_Date.setBounds(155, 285, 116, 21);
		start_Date.setSize(new Dimension(55, 20));
		this.add(start_Date);

		JLabel lblSerch = new JLabel("Áö¿ª °Ë»ö");
		lblSerch.setBounds(27, 319, 57, 15);
		this.add(lblSerch);

		// sample list
		String Arealist[] = { "°­¼­±¸", "°­ºÏ±¸", "°­µ¿±¸" };
		AreaBox = new JComboBox(Arealist);
		AreaBox.setBounds(96, 317, 116, 19);
		this.add(AreaBox);
		

		JButton btnApply = new JButton("³¯Â¥ Àû¿ë");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Raw_date;// ³¯Â¥ °ª ¹Þ¾Æ¿Í¼­ ¼öÁ¤ÇØ¾ßÇÏ´Â ¿øº»
				String date;// °¡°øµÈ ³¯Â¥
				String Area;// Áö¿ª
				String temp_day;// ³¯Â¥ °¡°ø½Ã »ç¿ëÇÏ´Â ÀÓ½Ã º¯¼ö
				String data;// ³¯Â¥+Áö¿ª µðºñ¶û ºñ±³ÇÒ¶§ »ç¿ëÇÒ ÃÖÁ¾ µ¥ÀÌÅÍ

				// »ùÇÃ µ¥ÀÌÅÍ,
				// µðºñ ¿¬µ¿½Ã get ¸Þ¼Òµå ¸¸µé¾î¼­ Áý¾î³Ö¾îÁÖÀÚ

				// »ùÇÃ ±×·¡ÇÁ 1 ¼³Á¤
				Graphpanel.setNO2(22);
				Graphpanel.setOZ(75);
				Graphpanel.setCO2(140);
				Graphpanel.setSO2(25);
				Graphpanel.setFd(155);
				Graphpanel.setUd(130);
				Graphpanel.setVisible(true);

				// »ùÇÃ ±×·¡ÇÁ2 ¼³Á¤
				Graphpanel_2.setNO2("0,11,12,22,21,33,50");
				Graphpanel_2.setOZ("10,13,15,12,25,40,40");
				Graphpanel_2.setCO2("50,101,52,102,51,13,30");
				Graphpanel_2.setSO2("70,31,82,62,91,23,79");
				Graphpanel_2.setNO2("30,90,60,122,51,73,20");
				Graphpanel_2.setNO2("90,51,22,32,31,63,100");
				// ¸®ÆäÀÎÆÃ
				Graphpanel.repaint();
				Graphpanel_2.repaint();
				// ¹öÆ° ´­·¶À»‹š ¾û¶×ÇÑ ÆÐ³Î ³ª¿À´Â°Å ¹æÁö
				if (Graphpanel_2.isVisible() == true) {
					Graphpanel.setVisible(false);
				} else if (Graphpanel.isVisible() == true) {
					Graphpanel_2.setVisible(false);
				}

				// ³¯Â¥ °ª ¹Þ±â
				Raw_date = (String) start_Month.getSelectedItem();
				Raw_date = Raw_date + (String) start_Date.getSelectedItem();

				// date¿¡ ÇÑ±Û Á¦°Å
				if (Raw_date.length() == 6) {// µÎ¿ù µÎÀÏÀÌÀÎ°æ¿ì ³âµµ¸¸ Ãß°¡
					date = Raw_date.replaceAll("[^0-9]", "");
					date = "2018" + date;

				} else if (Raw_date.length() == 4) {// ÀÏ¿ù ÀÏÀÏ ÀÎ°æ¿ìµµ ³âµµ¸¸ Ãß°¡
					date = Raw_date.replaceAll("¿ù", "0");
					date = "2018" + "0" + date;
					date = date.replaceAll("ÀÏ", "");

				} else {
					String[] temp = Raw_date.split("¿ù");
					String tempM;
					if (temp[0].length() != 2) {// ÀÏ¿ùÀÌ¸é 0Ãß°¡ÇØÁÖ±â
						tempM = "0" + temp[0];
					} else {
						tempM = temp[0];// ÀÌ¿ùÀÌ¸é ±×³É °¡±â
					}
					temp_day = (String) start_Date.getSelectedItem();
					// System.out.println(temp_day);//test
					temp = temp_day.split("ÀÏ");
					if (temp[0].length() != 2) {
						temp_day = "0" + temp[0];
					} else {
						temp_day = temp[0];
					}
					date = "2018" + tempM + temp_day;
				}
				// Áö¿ª°ª ¹Þ±â
				Area = (String) AreaBox.getSelectedItem();
				data = date + "," + Area;
				System.out.println("¸ÞÀÎÆÐ³Î µ¥ÀÌÅÍ ÀÔ·Â Å×½ºÆ®: " + data);
			}
		});

		btnApply.setBounds(498, 239, 126, 23);
		this.add(btnApply);

		// ¸·´ë ±×·¡ÇÁ
		btnNewButton = new JButton("¸·´ë ±×·¡ÇÁ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphpanel.setVisible(true);
				Graphpanel_2.setVisible(false);
			}
		});
		btnNewButton.setBounds(498, 176, 126, 23);
		this.add(btnNewButton);

		btnGraphType = new JButton("²ªÀº¼± ±×·¡ÇÁ");
		btnGraphType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphpanel.setVisible(false);
				Graphpanel_2.setVisible(true);
			}
		});
		btnGraphType.setBounds(498, 209, 126, 23);
		this.add(btnGraphType);

		// Á¾·á ¹öÆ°
		JButton btnExit = new JButton("Á¾·á");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(498, 146, 126, 23);
		this.add(btnExit);

	}

	private void graphInit() {
		Graphpanel = new MainGraph_Stick();
		Graphpanel.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel.setBounds(27, 48, 447, 214);
		this.add(Graphpanel);
	}

	private void graphInit_2() {
		Graphpanel_2 = new MainGraph_Polygonal();
		Graphpanel_2.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel_2.setBounds(27, 48, 447, 214);
		this.add(Graphpanel_2);

		Graphpanel_2.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		Graphpanel_2.setBounds(27, 48, 447, 214);
		Graphpanel_2.setBackground(Color.DARK_GRAY);
		this.add(Graphpanel_2);
		Graphpanel_2.setVisible(false);
	}
}
>>>>>>> refs/remotes/origin/master
