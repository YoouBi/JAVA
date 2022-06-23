
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter2 extends JFrame implements ActionListener {
	// ActionListener는 actionPerformed를 구현시키니까 ActionListener까지 들어줄 수 있는 클래스
	private int number = 0;
	private JButton btn;
	private JButton btn2;
	private JLabel lbl;

	public MyCounter2() {
		super("카운터");

		JPanel pnl = new JPanel();
		lbl = new JLabel("0");
		btn = new JButton("증가");
		btn2 = new JButton("감소");
		
//		ActionListener aListener = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
////				System.out.println("액션 리스너입니다.");
//				
////				JButton btn = (JButton) e.getSource();
////				// 참조를 알려주는거니까 오브젝트형으로 전달받은 getSource를 다운캐스팅시켜서 쓸 수도 있다
////				if(btn.getText().equals("증가")) {
////				}
//				
//				if(e.getSource() == btn) { // getSource는 이벤트의 참조를 알려줌 오브젝트형
//					number++;
//				} else {
//					number--;
//				}
//				
//				lbl.setText(String.valueOf(number)); // 이렇게하면 리스너 한개로 여러개의 이벤트 처리
//			}
//		};
		
//		btn.addActionListener(aListener);
		// 액션리스너 역할을 할 수 있는 인스턴스(전에 했던 이 구조에서는 익명 클래스로 만든 인스턴스)에 대한 참조를 알려준 것
		btn.addActionListener(this); // 버튼에 액션리스너에 대한 참조를 알려줘야하는데 지금은 implements ActionListener를 해뒀으니
		// 자기자신에 대한 참조니까 이걸 this로 알려줌

		JButton btn2 = new JButton("감소");
		btn2.addActionListener(this);

		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(btn2);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) { // 헤더쪽은 인터페이스의 정의라서 못고침 파라미터 그대로 받아야함
		if(e.getSource() == btn) { // btn는 생성자 안에서만 존재하는 지역변수라서 인식을 못하기 때문에 컴파일 오류가 난다
			// private JButton btn;로 버튼에 대한 참조가 지역변수로 떨어진 곳이 아니라 자기 자신에 대한 참조가 되었으니까 당근 가능해짐!
			number++;
		} else {
			number--;
		}
		lbl.setText(String.valueOf(number));
	}
	
	public static void main(String[] args) {
		new MyCounter2().setVisible(true);
	}
}