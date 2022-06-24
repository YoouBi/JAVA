import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main1 extends JFrame {
	public Main1() {
		JPanel pnl = new JPanel();
		JCheckBox check1 = new JCheckBox("첫번째"); // 왼쪽이 CheckBox가 생성되고 우측에 괄호 안의 텍스트가 생성됨
		JCheckBox check2 = new JCheckBox("두번째");
		JCheckBox check3 = new JCheckBox("세번째");
		
//		check1.setSelected(true);
//		System.out.println(check2.isSelected()); // 선택되지 않았다면 false 값으로 반환
		
		// 얘도 추상적 버튼 구현 클래스를 상속받고 있는 애라서 버튼과 같은 액션 발생 가능
//		check1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("사용자가 체크박스를 눌렀음");
//				System.out.println(check1.isSelected()); // 체크박스는 체크를 하고 풀고 하는 상태가 있음
//			}
//		});
		// 상태가 바뀐다는 것도 이벤트로 가지고 있음 그 이벤트를 들어주는 리스너도 존재
		check1.addItemListener(new ItemListener() { // 체크박스의 체크를 통해 발생하는 Item 이벤트
			@Override
			public void itemStateChanged(ItemEvent e) { // 자기가 변하고 있는 상태를 담음
				// 그래서 마찬가지로 게터가 있는데
				// 리턴값으로 트루 펄스가 아니라 특이하게 인트값을 줌
				int result = e.getStateChange();
				System.out.println(result == ItemEvent.SELECTED); // 상수로 선택, 선택이 풀렸다를 정의
//				System.out.println(result == ItemEvent.DESELECTED);
			}
		});
		
		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main1().setVisible(true);
	}
}
