import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 이런 부가적인 창은 Dialog라고 하는데 최소화 최대화 버튼이 없고, 닫기 버튼을 눌렀다고 프로그램 전체가 종료되지 않는다
// class SubWindow extends JFrame { // 프레임을 상속받는 객체가 아니라
class SubWindow extends JDialog { // 다이얼로그를 상속받게
	private JTextField tf;

	public SubWindow(JFrame owner) {
		super(owner, true); // 생성자를 살펴보면 다얄로그를 생성하는 주요창 JFrame을 전달받는다
		// 여기서 바로 Modal 값을 전달받기도 한다
//		setModal(true); // Modal 값으로 다른 창과의 상호작용을 할 수 없도록 막을 수 있다
		setTitle("부가 창");
//		getOwner(); // 다얄로그가 자신의 부모참조를 알고 있기 때문에 get으로 얻어낼 수도 있다
		
		tf = new JTextField(10);
		add(tf, "North");
		
		JButton btn = new JButton("다른 버튼");
		add(btn);
		
		btn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // setVisible(false) 랑 크게 다르지 않음
			}
		});
		
		setSize(500, 500);
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// 닫기 버튼을 눌렀을 때 '기본 값'으로 되어있기 때문에 사실 안적어도 됨!
	}
	
	public String showDialog() {
		setVisible(true);
		
		return tf.getText();
	}
}

public class Main extends JFrame{
	public Main() {
		super("주요 창");
		
		JButton btn = new JButton("버튼");
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				new SubWindow(Main.this).setVisible(true); // 창 객체를 새로 생성해서 보여줘라
				SubWindow dialog = new SubWindow(Main.this);
				String result = dialog.showDialog();
				
				// Modal 값을 트루로 줬을 때 중간에서 멈춘것처럼 부가 창을 꺼야 밑의 문장이 호출되지만
				// 펄스로 줬을 때엔 부가 창이 생성되자말자 밑의 문장이 호출된다
				System.out.println("이 문장은 언제 호출될까?");
				
				btn.setText(result);
			}
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 닫기 버튼을 누르면 '종료'
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
