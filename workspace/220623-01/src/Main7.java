import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main7 extends JFrame {
	public Main7() {
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JPanel pnlBox = new JPanel();
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		
		JTextField tf1 = new JTextField(20); // 사용자의 입력을 받을 수 있는 친구
		JTextField tf2 = new JTextField(20); // 괄호 안은 가로 길이로 컬럼 크기
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf1.getText();
				tf2.setText(text); // get이 있으면 set도 있을 것
				JOptionPane.showMessageDialog(Main7.this, text); // Frame은 주요창이고 부가적으로 쓰는 건 Dialog
				// Dialog에는 showMessageDialog같이 스태틱한 클래스들이 있다
				// 우측에는 띄우고싶은 메세지를 문자열 형태로 던져줌
				// 왼쪽에는 컴포넌트의 참조를 알려주는데 다얄로그의 위치 때문에 참조를 알려줘야할 때
				// null일때는 화면의 중앙에 띄워주고 참조를 적었을때엔 참조의 위치에 가깝게 띄워준다
				// public void actionPerformed(ActionEvent e) { 는 지역적으로 존재하는 클래스인데
				// 앞에 아무것도 안쓰고 this를 쓰면 이 일반 구현 클래스를 참조하고
				// 앞에 Main7를 쓰면 바깥에 있는 이 Main7 클래스를 참조함
			}
		});
		
		pnlTop.add(tf1);
		pnlTop.add(btn1);
		pnlBottom.add(tf2);
		pnlBottom.add(btn2);
		
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		
		add(pnlBox);
		
		pack(); // 사이즈를 내부에 있는 컴퍼넌트의 크기에 딱 맞춰서 조절
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main7().setVisible(true);
	}
}