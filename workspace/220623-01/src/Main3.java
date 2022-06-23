import javax.swing.JFrame;

// 나만의 프레임을 만들고 싶으면 JFrame의 특징을 그대로 물려받는 상속 구조로
class MyFrame extends JFrame { // 제목을 초기화할 수 있는 생성자 초기화
	public MyFrame(String title) {
		super(title);
		
//		this.setSize(500, 500);
		setSize(500, 500); // 상속 받았기때문에  this 생략 가능
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 여기도 내가 가지고 있는 상수일테니까, 같은 클래스에 가진 상수일테니까 JFrame을 생략
	}
}

public class Main3 {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("나만의 프레임");
//		JFrame frame = new MyFrame("나만의 프레임"); 도 가능
		frame.setVisible(true);
	}
}
