import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main2 extends JFrame{
	public Main2() {
		JPanel pnl = new JPanel();
		JTextField tf = new JTextField(10);
		JPasswordField pf = new JPasswordField(10);
//		pf.getPassword(); // 는 캐릭터(문자) 배열로 받겠다는 것...? 자바의 옛날...? 
		
		JTextArea ta = new JTextArea(20, 20); // 여러줄의 텍스트 입력 가능 크기를 정수 형태로 전달받음
		JScrollPane scrl = new JScrollPane(ta); // 스크롤 가능한 area를 전달받음
		// (1)스크롤 컴퍼넌트에 담았다가 배치시켜보자
		
		pnl.add(tf);
		pnl.add(pf);
		
		add(pnl);
//		add(ta, "South"); 텍스트에리어를 바로 배치하지 말고(1)
		add(scrl, "South");
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("엔터 누름");
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int id = e.getID();
				if (id == KeyEvent.KEY_TYPED) { // 글자가 쳐졌는지 아닌지 확인
					char ch = e.getKeyChar();
//					ta.setText(t);
					ta.append(String.valueOf(ch) + "\n"); // 기존에 있는 문자에 추가로 덧붙여주는 .append
				}
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
