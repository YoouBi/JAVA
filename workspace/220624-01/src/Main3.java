import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main3 extends JFrame {
	public Main3() {
		JPanel pnl = new JPanel();
		JRadioButton rdb1 = new JRadioButton("라디오1");
		JRadioButton rdb2 = new JRadioButton("라디오2");
		JRadioButton rdb3 = new JRadioButton("라디오3");
		ButtonGroup group = new ButtonGroup(); // ButtonGroup는 추상적인 버튼들을 다 집어넣을 수 있지만
		// 의도는 라디오 버튼들을 묶어주려고 만든것이기 때문에 다른 버튼들을 넣어도 의도한것처럼 흘러가진 않을 것이다
		// RadioButton은 '무조건 1개만 선택' 하려고 만든 것
		group.add(rdb1);
		group.add(rdb2);
		group.add(rdb3);
		
//		rdb1.addActionListener(new ActionListener() {		
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("액션 이벤트 발생");
//			}
//		});
		
		rdb1.addItemListener(new ItemListener() { // 변하는 '상태'가 있으니까 아이템도 있을 것이다
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange() == ItemEvent.SELECTED);
			}
		});
	
//		JRadioButton rdb4 = new JRadioButton("라디오4");
//		JRadioButton rdb5 = new JRadioButton("라디오5");
		
		pnl.add(rdb1);
		pnl.add(rdb2);
		pnl.add(rdb3);
//		pnl.add(rdb4);
//		pnl.add(rdb5);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
