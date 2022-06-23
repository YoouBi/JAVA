import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {
	public MyFrame2() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");

//		setBackground(new Color(255, 0, 0));
//		setBackground(Color.RED); // 색 안바뀌넹...
		
		JButton button = new JButton("버튼"); // 버튼에 들어갈 내용을 문자열로 만들어줌 근데 만든다고 해서 추가가 되는건 아니고 설정만 된거라 이 객체를 프레임에 붙여줘야함
		JButton button2 = new JButton("버튼2");
		
//		getContentPane().setLayout(new FlowLayout()); // 배치 관리를 도와줄 수 있는 FlowLayout(왼쪽정렬)으로 자기의 위치를 도와줄 수 있게끔 소통하고 있는 것
//		getContentPane().add(button); // 내용을 집어넣으면 레이아웃 매니저라는 친구가 기본 동작으로 배치를 '가득 채움'
		setLayout(new FlowLayout()); // 사용하기 쉽게끔 getContentPane().생략
		this.add(button);
		add(button2); // 버튼을 더 추가하고싶다면 버튼에 대한 참조만 추가해주면 된당
		
		setVisible(true);
	}
}

public class MyFrameTest1 {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}
}