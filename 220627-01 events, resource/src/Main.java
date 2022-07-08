import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	public Main() {
		MouseListener listener = new MouseListener() { // 인터페이스 MouseListener는 추상메소드를 5개 가지고 있다
			@Override
			public void mouseReleased(MouseEvent e) { // 한번 클릭하는 것에 대해서 보통 Released와 Pressed를 많이 사용
				System.out.println("마우스 버튼을 뗌");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스 버튼을 누름");
			}

			@Override
			public void mouseExited(MouseEvent e) { // 패널 영역에서 마우스가 벗어났느냐
				System.out.println("EXIT!");
			}

			@Override
			public void mouseEntered(MouseEvent e) { // 패널 영역에 마우스를 올려놨느냐
				System.out.println("ENTER!");
			}

			@Override
			public void mouseClicked(MouseEvent e) { // 사용자 PC, OS마다 클릭 판정을 내는 기준이 다름				
				System.out.println("마우스 클릭!");
				
				switch (e.getButton()) {
				case MouseEvent.BUTTON1:
					System.out.println("1번");
					break;
				case MouseEvent.BUTTON2:
					System.out.println("2번");
					break;
				case MouseEvent.BUTTON3:
					System.out.println("3번");
				} // getButton에서 버튼을 정수로 선택할 수 있는데,
				// 이 정수가 시스템마다 달라서 왼쪽 버튼을 1번이라 부를 수도 있지만 다른 시스템에선 2번이라고 부를 수도 있다
				// 이 버튼은 상수로도 선택이 가능함
				
				System.out.println("왼쪽 버튼인가요?" + SwingUtilities.isLeftMouseButton(e));
				// 이런 사용자 입력에 대해서 왼쪽인지 오른쪽인지 알 수 있는 클래스, 메소드가 있음
				// 이 친구들을 통하면 숫자값이 아니라 왼쪽 버튼인지 가운데 버튼인지를 알려줌
				// 파라미터로는 이벤트 객체를 그대로 던져주면 불연값으로 isLeftMouseButton니까 왼쪽이면 트루, 아니면 펄스값을 줄 것
				
				if (e.getClickCount() == 2) { // 더블 클릭 이벤트에 Clicked
					System.out.println("더블 클릭!!");
				}
			}
		};
		
		MouseMotionListener motion = new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("마우스가 움직입니다~." + e.getX() + ", "+ e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		};

		JPanel pnl = new JPanel();
//		pnl.addMouseListener(listener);
		pnl.addMouseMotionListener(motion);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
