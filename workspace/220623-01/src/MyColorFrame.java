import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 클릭 액션을 구현하는 애는 ActionListner인데 인터페이스이다
class MyActionListener implements ActionListener { //액션을 들어줄 수 있다고 추상 구현 메소드가 들어있으니 오버로이드 해줘야한다
	@Override
	public void actionPerformed(ActionEvent e) { // 게터로 호출해서 클릭을 했을 때 동작할 수 있는 걸 만들어줘야한다
		System.out.println("사용자가 버튼을 클릭했네요~"); // 콘솔창 출력
		// 근데 얘는 그냥 클래스니까 동작은 아직 안함
	}
}

public class MyColorFrame extends JFrame {
	public MyColorFrame() {
		super("색깔 있는 프레임");
		
		JPanel pnl = new JPanel();
		pnl.setBackground(Color.RED);
		
		JButton btn = new JButton("컨테이너안의 버튼");
//		MyActionListener listener = new MyActionListener(); // 이 버튼을 눌렀을 때 동작할 리스너 객체를 만들어줬음
//		btn.addActionListener(listener); // 리스너의 참조 전달해서 액션을 하도록
		
		btn.addActionListener(new ActionListener() { // 클릭했을 때 ActionListener가 액션 이벤트를 실행시킨다
			@Override
			public void actionPerformed(ActionEvent e) { // 이벤트를 직접 만드는게 아니라 actionPerformed라는 액션에서 이벤트를 전달받음
//				System.out.println("익명 클래스 구현");
				pnl.setBackground(Color.BLUE); // 지역 클래스는 지역 변수에 접근할 수 있음(pnl 같은거)
				// 반복문으로 뭔갈 하려고 하면 흐름이 갇혀서 프로그램이 멈춘것처럼 느껴질 것임 종료도 안됨...
				// 흐름이 흘러갈 수 있게끔 가두면 안됨
			}
		});
		
		pnl.add(btn);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyColorFrame f = new MyColorFrame();
		f.setVisible(true);
	}
}