import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 사용자 입력을 받을 수 있는 GUI를 만들고 그 입력을 구현할 수 있는 프로그램
// 결과는 다얄로그로 보여줘도 됨!
// 다 하면 문제를 다시 출력하는 기능 구현
public class Main extends JFrame {
	private int x;
	private int y;
	private int sum;

	public Main() {
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JPanel pnlBox = new JPanel();
		pnlTop.setOpaque(false); // 뒷 배경색을 따라가도록 만드는 setOpaque! false로 꺼줘야 따라간다
		pnlBottom.setOpaque(false);
		pnlBox.setBackground(Color.CYAN);
//		pnlTop.setBackground(Color.CYAN);
//		pnlBottom.setBackground(Color.CYAN);
		
		Random random = new Random();
		x = random.nextInt(9) + 1;
		y = random.nextInt(9) + 1;
		sum = x + y;
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		
		JLabel Question = new JLabel(x + " + " + y + " = ?");
		JLabel OX = new JLabel("결과");
		
		JButton Input = new JButton("확인");
		JButton Reset = new JButton("문제 바꾸기");
		
		JTextField Answer = new JTextField(5);
		
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = random.nextInt(9) + 1;
				y = random.nextInt(9) + 1;
				sum = x + y;
				
				Question.setText(x + " + " + y + " = ?");
			}
		});
		
		Input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = Answer.getText();
				if(text.equals(Integer.toString(sum))) {
					OX.setText("정답");
				} else {
					OX.setText("오답");
				}
			}
		});
		
		pnlTop.add(Question);
		pnlTop.add(Reset);
		pnlBottom.add(Answer);
		pnlBottom.add(Input);
		pnlBottom.add(OX);
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		
		add(pnlBox);
		
		pack();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}