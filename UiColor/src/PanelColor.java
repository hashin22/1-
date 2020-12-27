import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelColor extends JFrame {

	PanelColor(){//생성자에서 jpanel 정의
		JFrame f = new JFrame("하란이 귀요미");
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		add(panel);
		
		
		JLabel label1 = new JLabel("하란 마누라 김은조");
		JLabel label2 = new JLabel("하란 마누라 이인아");
		
		JPanel pane2 = new JPanel();
		JTextField field1 = new JTextField(20);
		JTextField field2 = new JTextField(20);
		//객체만 만듬. 이제 페널을 붙여줄거임.
		//윈도우 화면 f에 add 해주기를
		JButton button = new JButton("방귀버튼");
		
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		
		f.setSize(300, 200);
//		setTitle("색상테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		//생성자 호출만 해주면 실행이 됨.
		new PanelColor();
		
	}
}
