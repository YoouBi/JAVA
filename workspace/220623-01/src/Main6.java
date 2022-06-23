import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main6 extends JFrame { // JFrame도 컴퍼넌트를 가득 채운다고 했으니 기본 레이아웃은 BorderLayout
	public Main6() {
		JPanel pnl = new JPanel();
		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT); // 대치. 기본값이 중앙에 생성됨. LEFT는 왼쪽 RIGHT는 오른쪽 나열
		pnl.setLayout(flow); // 패널이 생성될때 기본값이 플로우
//		BorderLayout border = new BorderLayout(); // BorderLayout은 위치와 크기를 설정해주는데 add를 하면 자신의 영역에 컴퍼넌트를 가득채움
//		pnl.setLayout(border);
		
//		BoxLayout box = new BoxLayout(pnl, BoxLayout.X_AXIS); // 대상이 되는 패널 참조를 요구, xy축으로 조정
//		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
//		pnl.setLayout(box); // 레이아웃 설명까지
		
//		GridLayout grid = new GridLayout(2, 2); // 2행 2열의 영역으로 나눠라, 하면 똑같은 크기로 나누고(크기에 대한 설정 다 무시하고 같은 크기로)
//		pnl.setLayout(grid); // GridLayout는  생성자에서 몇줄 몇칸을 지정해줌 컴퍼넌트를 추가할때마다 제일 왼쪽 위에서부터 하나씩 채움
		
		pnl.setLayout(null); // 레이아웃을 없앴기 때문에 컴퍼넌트를 추가해도 하나도 안보임
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		
		// 버튼들의 위치와 크기가 하나도 안 정해졌기 때문에 버튼의 설정들을 추가해주면 됨
		btn1.setLocation(10, 30);
		btn1.setSize(200, 300);
		
		btn2.setBounds(220, 50, 90, 70); // 가로값이 작으면 텍스트가 다 안뜸
		// 이렇게 컴퍼넌트의 크기를 하나하나 지정하면 너무 많은 노동력이 필요하기 때문에 레이아웃을 활용하는게 좋다
		
//		btn1.setSize(100, 100); // 버튼의 크기가 바뀌진 않음
		// 크기는 FlowLayout 얘가 정의함 그럼 제한을 어떻게 주느냐? 일반 setSize가 아닌 
		btn1.setPreferredSize(new Dimension(300, 300)); // Dimension 사이즈로 전달받는데 이차원 가로세로의 크기를 전달해주면 된다
		// border와 함께 쓰면 가로 배치를 할 때 세로 크기는 무시하고 가로 크기만 적용됨
		btn1.setMinimumSize(new Dimension(300, 300));
		btn1.setMaximumSize(new Dimension(300, 300));
		
//		pnl.add(btn1, "North"); // "North"로 써도 되고 BorderLayout에 정리되어있는 상수값을 써도 됨
		pnl.add(btn1, "West"); // BorderLayout의 특징 : 가로로 배치해놨으면 세로는 가득 채워야 함. 반대로 세로로 배치하면 가로를 가득 채워야 함
		pnl.add(btn2, BorderLayout.CENTER);
//		pnl.add(btn3, BorderLayout.SOUTH); // 이런 컴포넌트를 추가할 때 같은 버튼에 다른 위치를 두번 넣어주면 원래 있던 자리에서 빼서 새 자리에 넣어준다
		pnl.add(btn3, BorderLayout.EAST); // 그래서 같은 버튼을 만들고싶다면 '추가'해서 넣어줘야한다
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main6().setVisible(true);
	}
}
