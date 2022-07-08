import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 화면을 전환하고 싶을 때 쓰는 레이아웃 매니저
public class Main4 extends JFrame {
	public Main4() {
		CardLayout layout = new CardLayout();
		JPanel center = new JPanel(layout);
		
		JPanel pnl1 = makePanel("첫번째");
		JPanel pnl2 = makePanel("두번째");
		JPanel pnl3 = makePanel("세번째");
		
		center.add(pnl1, "A"); // 패널과 문자열을 같이 추가하면 설정된 문자값을 통해 바로 화면을 조정할 수 있다
		center.add(pnl2, "B"); // 짝을 이뤘으니 맵이지만 순서대로 넘길 수 있으니 링크드 해쉬 맵처럼 되어있을 것
		center.add(pnl3, "C");
		
		add(center);
		
//		layout.show(center, "C"); // 관리하고 있는 패널 참조와 보유하고 있는, 그리고 짝을 이루고 있는 문자열을 넣으면 해당하는 컴퍼넌트만 보여준다
		
		JButton btnNext = new JButton("다음");
		JButton btnPrev = new JButton("이전");
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(btnPrev);
		pnlSouth.add(btnNext);
		
		add(pnlSouth, "South");
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("다음")) {
					layout.next(center); // 추가했던 순서대로 넘길 수 있음
				} else {
					layout.previous(center);
				}
			}
		};
		btnNext.addActionListener(listener);
		btnPrev.addActionListener(listener);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	public JPanel makePanel(String text) {
		JPanel pnl = new JPanel();
		pnl.add(new JLabel(text));
		return pnl;
	}
	
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}