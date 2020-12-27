import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;import javax.swing.border.Border;

public class RockScissorPaper extends JFrame implements ActionListener {
	static final int Scissor = 0;
	static final int Rock = 1;
	static final int Paper =2;
	
	private JTextField output, information;
	private JPanel panel;
	private JButton scissor, rock, paper;
	
	

public  RockScissorPaper() {
	setTitle("����������");
	setSize(400, 300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	panel = new JPanel();
	panel.setLayout(new GridLayout(0, 3));
	
	information = new JTextField("�Ʒ���ư�� ����������");
	output = new JTextField(20);
	
	scissor = new JButton("����");
	scissor.addActionListener(this);
	rock = new JButton("����");
	rock.addActionListener(this);
	paper = new JButton("��");
	paper.addActionListener(this);
	
	panel.add(rock);
	panel.add(scissor);
	panel.add(paper);
	
	add(information, BorderLayout.NORTH);
	add(panel, BorderLayout.CENTER);
	add(output, BorderLayout.SOUTH);
	
	setVisible(true);
}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int computer = random.nextInt(3);
		
		if(e.getSource() == rock) {
			if(computer == Scissor) 
				output.setText("�����մϴ� �̰�׿�");
			else if(computer == Rock)
				output.setText("�����ϴ�");
			else
				output.setText("�����ϴ�");
			
		}
		else if(e.getSource() == scissor) {
			if(computer == Paper) 
				output.setText("�����մϴ� �̰�׿�");
			else if(computer == Scissor)
				output.setText("�����ϴ�");
			else
				output.setText("�����ϴ�");
			
		}
		else if(e.getSource() == paper) {
			if(computer == Paper) 
				output.setText("�����մϴ� �̰�׿�");
			else if(computer == Paper)
				output.setText("�����ϴ�");
			else
				output.setText("�����ϴ�");
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RockScissorPaper c = new RockScissorPaper();

	}

}
