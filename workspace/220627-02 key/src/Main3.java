import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class Main3 extends JFrame {
	public Main3() {
		JPanel red = new JPanel();
		red.setBackground(Color.red);
		
		JPanel blue = new JPanel();
		blue.setBackground(Color.blue);
		
		JTabbedPane tab = new JTabbedPane();
		tab.add("빨강", red); // .add로 왼쪽에는 탭의 이름을 설정하고 오른쪽에는 보여주고싶은 컴퍼넌트를 추가할 수 있다
		tab.add("파랑", blue);
		add(tab);
		
//		JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, red, blue);
//		// 생성할 때 가로로 나눌지HORIZONTAL, 세로로 나눌지VERTICAL_SPLIT 선택할 수 있다
//		split.setDividerLocation(150); // 처음에 나눠질 위치를 정해줄 수도 있다
//		add(split);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
