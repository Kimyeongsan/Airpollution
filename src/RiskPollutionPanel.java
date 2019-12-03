
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Database.PollutionDB;

public class RiskPollutionPanel extends JPanel {
	private JTextField textField;
	private JComboBox riskBoxArea;
	private GraphRiskPollution GraphRiskpanel;
	private RiskPollutuin_image Imagepanel;

	public RiskPollutionPanel(JFrame frame) {
		super();
		panelInit(frame);
		graphInit();
		imageInit();
	}

	private void panelInit(JFrame frame) {
		this.setBackground(new Color(225, 240, 255));
		this.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(this);
		this.setLayout(null);

		JLabel PollutionLabel = new JLabel("Local Pollution degree of risk");

		PollutionLabel.setFont(new Font("Arial", Font.BOLD, 25));
		PollutionLabel.setForeground(Color.BLUE);
		PollutionLabel.setHorizontalAlignment(JLabel.CENTER);
		PollutionLabel.setBounds(118, 10, 393, 28);
		this.add(PollutionLabel);

		String Arealist[] = { "������", "�������", "������", "�����Ϸ�", "���ϱ�", "������", "���״��", "���Ǳ�", "������", "���α�", "��õ��", "�����",
				"������", "������", "���빮��", "���۱�", "���۴��", "������", "���빮��", "���ʱ�", "������", "���ϱ�", "���ı�", "���̷�", "��õ��", "��������",
				"��������", "��걸", "����", "������", "����", "���α�", "�߱�", "�߶���", "õȣ���", "û��õ��", "�Ѱ����", "ȫ����", "ȭ����" };

		JLabel risk_compareLabel = new JLabel("��������A");
		risk_compareLabel.setBounds(38, 64, 63, 15);
		this.add(risk_compareLabel);

		riskBoxArea = new JComboBox(Arealist);
		riskBoxArea.setBounds(113, 61, 96, 21);
		this.add(riskBoxArea);

		JLabel risk_date_Label = new JLabel("��¥ �Է�");
		risk_date_Label.setBounds(38, 101, 63, 15);
		this.add(risk_date_Label);

		textField = new JTextField();
		textField.setBounds(113, 98, 96, 21);
		this.add(textField);
		textField.setColumns(10);

		JButton btnCompareSet = new JButton("����");
		btnCompareSet.setBounds(215, 98, 65, 20);
		this.add(btnCompareSet);
		// �����ư ������
		btnCompareSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data;
				String Area;
				String date;

				ResultSet rs;

				date = textField.getText();

				// ��¥ �� �ޱ�
				data = (String) textField.getSelectedText();

				// ������ �ޱ�
				Area = (String) riskBoxArea.getSelectedItem();

				data = date + "," + Area;

				PollutionDB pollution = new PollutionDB();

				rs = pollution.getPollutionDataWith(date, Area);

				try {
					rs.next();

					GraphRiskpanel.setFd((int) Double.parseDouble(rs.getString("FINEDUST")));
					GraphRiskpanel.setUd((int) Double.parseDouble(rs.getString("TINYDUST")));
					GraphRiskpanel.setVisible(true);

					GraphRiskpanel.repaint();

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			private String String(JComboBox riskBoxArea) {
				return null;
			}
		});

		this.setVisible(false);
	}

	private void graphInit() {
		GraphRiskpanel = new GraphRiskPollution();
		GraphRiskpanel.setBounds(18, 136, 228, 200);
		GraphRiskpanel.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(GraphRiskpanel);
		GraphRiskpanel.setVisible(true);
	}

	private void imageInit() {
		Imagepanel = new RiskPollutuin_image();
		Imagepanel.setBounds(260, 138, 360, 190);
		Imagepanel.setBorder(BorderFactory.createLineBorder(Color.black));

		this.add(Imagepanel);
		Imagepanel.setVisible(true);
	}

}
