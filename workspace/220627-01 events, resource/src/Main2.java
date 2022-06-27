import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main2 extends JFrame{
	public Main2() {
		JPanel pnl = new JPanel();
		JButton btn = new JButton("버튼입니다");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("액션 이벤트 발생");
			}
		});
		
		btn.addMouseListener(new MouseAdapter() { // MouseListener에는 5개나 되는 추상 메소드가 있는데 쓰지도 않을걸 다 불러오면 공간 낭비니까
			// 바디에 다른 메소드들을 비워놓고 내가 쓸 액션 이벤트만 재정의해서 쓰는 MouseAdapter()를 쓴다
			@Override
			public void mousePressed(MouseEvent e) {
//				super.mousePressed(e); 부모의 동작을 그대로 따라하는 이 메소드는 부모의 동작이 비어있으니까 안씀!
				System.out.println("마우스 Pressed");
			}
		});
		
		pnl.add(btn);
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
