import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main2 {

	public static void main(String[] args) {
		// CLI
		
		// GUI
		// AWT / SWING // AWT를 조금이나마 개선시켜서 확장시킨게 SWING 얘만 순수 자바코드로 만들 수 있음
		// 사실 요새는 잘 안쓰는 추세긴 함... 최신 기술은 아닌데... 다른 애들은 만들 수 있지만 엄청 복잡함
		// 그래도 배워두면 자바에 대한 객체 소통, 객체 지향을 잘 쓰게 될거라고...?
		// SWING으로 만든 것 IntelIU
		// JavaFX // 그 다음 나온게 얘
		
		// And
		
		// SWING에서 제일 처음 만들게 될 창
//		JFrame frame = new JFrame("제목 입니다"); // 기본적으로는 안보임 크기와 위치를 설정하고 보여져라 라고 해야 보여짐
		// JFrame는 제목이라는 필드를 가지고 있고 그 제목을 초기화할 수 있게끔 생성자로 전달받음
		JFrame frame = new JFrame();
		frame.setTitle("제목입니다"); // 필드가 있으니까 그걸 설정할 수 있는 세터도 있을 것
		
		frame.getContentPane().add(new JLabel("Hello World")); // GUI에서 글자나 버튼이나 하나하나의 요소들을 component라고 한다
		
		// JFrame의 이상한 특징
		// 창을 닫으면 프로그램이 꺼져야하는데 돌아가고 있다
//		frame.setDefaultCloseOperation(3); // 닫기 버튼을 눌렀을 때 어떻게 될 것인지 int값을 받음
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼을 눌렀을 때 정상 종료
		
		frame.setSize(500, 500); // 오버로드로 두개의 값을 전달받게 되어있는데
		// 하나의 면적을 나타내는 객체로서 마찬가지로 가로 세로의 값을 가짐
		frame.setVisible(true); // boolean 값을 전달받아서 보이고 안보이고
		
//		System.out.println("asdf");
	}
}