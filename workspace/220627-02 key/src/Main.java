import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
	private int x;
	private int y;

	public Main() {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("입력");
		lbl.setBounds(x, y, 50, 50);
		pnl.add(lbl);
		
		add(pnl);
		
		// 패널같은 경우는 배경(판때기)이다보니까 상호작용이 잘 되어있지 않음
		pnl.setFocusable(true);
		pnl.addKeyListener(new KeyAdapter() { // 이 친구도 추상 클래스가 있음
//		pnl.addKeyListener(new KeyListener() { // 이건 인터페이스
//			@Override
//			public void keyTyped(KeyEvent e) { // 특이하게 하나의 키가 온전하게 입력이 되면(예를들어 눌렀다 뗐다) 그 때 발생
//			}
//			
//			@Override
//			public void keyReleased(KeyEvent e) { // 버튼 뗐을 때
//			}
			
			@Override
			public void keyPressed(KeyEvent e) { // 버튼 눌렀을 때
				// 문자가 아닌 키들도 있을 것
				int code = e.getKeyCode(); // .getKeyCode()로 호출하면 사용자가 입력한 키에 대한 숫자값을 얻어낼 수 있다
				
				// 사용자 입력값을 비교하면 되는데
//				if (code == 37) { // 이런 37이라는 코드를 일일이 기억할 수는 없으니까
				if (code == KeyEvent.VK_LEFT) {
//					System.out.println("왼쪽 화살표 누름");
					x -= 5;
				} else if (code == KeyEvent.VK_RIGHT) { // VK_KP_RIGHT에서 KP는 오른쪽에 있는 키패드를 뜻함
					x += 5;
				} else if (code == KeyEvent.VK_UP) {
					y -= 5;
				} else if (code == KeyEvent.VK_DOWN) {
					y += 5;
				}
				lbl.setLocation(x, y);
				
//				char c = e.getKeyChar();
//				lbl.setText(String.valueOf(c));
			}
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
