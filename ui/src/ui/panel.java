package ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panel {
	public static void main(String[] args) {
		JFrame f = new JFrame("�϶��� �Ϳ��");
		JPanel panel = new JPanel();
		
		f.add(panel);
		
		JLabel label1 = new JLabel("�϶� ������ ������");
		JLabel label2 = new JLabel("�϶� ������ ���ξ�");
		
		JPanel pane2 = new JPanel();
		JTextField field1 = new JTextField(20);
		JTextField field2 = new JTextField(20);
		//��ü�� ����. ���� ����� �ٿ��ٰ���.
		//������ ȭ�� f�� add ���ֱ⸦
		JButton button = new JButton("��ȯ");
		
		f.setSize(300, 150);
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
