import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main5 extends JFrame {
	public Main5() {
		JPanel pnl = new JPanel();
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		btn1.setActionCommand("임의의 커맨드"); // 커맨드의 문자열 값을 특정
		
		pnl.add(btn1);
		pnl.add(btn2);
		
		add(pnl);

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // ActionEvent는 이벤트에 대한 정보가 담기는데 JButton에서는 액션 커맨드라는 친구가 가지고 있는 텍스트 값을 문자열 형태로 담아준다
				System.out.println(e.getActionCommand()); // 그래서 이 ActionCommand로도 버튼 구별이 가능하겠지만 텍스트가 같은 버튼이 있을건데 그럴때는 커맨드를 특정시켜줄 수 있다
			}
		};
		
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main5().setVisible(true);
	}
}