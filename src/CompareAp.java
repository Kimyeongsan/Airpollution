import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CompareAp extends JPanel{
	private JTextField textField_D1;
	private JTextField textField_D2;
	
	public CompareAp() {
		JPanel CompareAp = new CompareAp();
		CompareAp.setBackground(new Color(225, 240, 255));
		CompareAp.setBounds(0, 0, 636, 360);
		CompareAp.setLayout(null);
		
		
		JLabel CompareNewLabel = new JLabel("Pollution Compare");
		CompareNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		CompareNewLabel.setForeground(Color.BLUE);
		CompareNewLabel.setHorizontalAlignment(JLabel.CENTER);
		CompareNewLabel.setBounds(192, 10, 245, 30);
		CompareAp.add(CompareNewLabel);
		
		JLabel fisrt_compareLabel = new JLabel("��������A");
		fisrt_compareLabel.setBounds(38, 64, 63, 15);
		CompareAp.add(fisrt_compareLabel);

		
		//// ��������1
		String Arealist[] = { "������", "���ϱ�", "������" };
		JComboBox comboBox = new JComboBox(Arealist);
		
		JComboBox comboBoxArea1 = new JComboBox(Arealist);
		comboBoxArea1.setBounds(113, 61, 96, 21);
		CompareAp.add(comboBoxArea1);
		//// ��������2
		JComboBox comboBoxArea2 = new JComboBox(Arealist);
		comboBoxArea2.setBounds(440, 61, 96, 21);
		CompareAp.add(comboBoxArea2);

		JLabel lblNewLabel_2 = new JLabel("��¥ �Է�");
		lblNewLabel_2.setBounds(38, 101, 63, 15);
		CompareAp.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("��������B");
		lblNewLabel_3.setBounds(360, 64, 68, 15);
		CompareAp.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("��¥ �Է�");
		lblNewLabel_4.setBounds(360, 101, 68, 15);
		CompareAp.add(lblNewLabel_4);
		
		// ù��° ��¥ �Է�
		textField_D1 = new JTextField();
		textField_D1.setBounds(113, 98, 96, 21);
		add(textField_D1);
		textField_D1.setColumns(10);

		// �ι�° ��¥ �Է�
		textField_D2 = new JTextField();
		textField_D2.setBounds(440, 98, 96, 21);
		add(textField_D2);
		textField_D2.setColumns(10);
		
		// �����ư ���� ^^7
		JButton btnCompareSet = new JButton("����");
		// �����ư ��ġ �� �ǳڿ� �߰�
		btnCompareSet.setBounds(278, 308, 97, 23);
		CompareAp.add(btnCompareSet);

		CompareAp.setVisible(false); // Compare panel ������ ���߱�
	}
}
