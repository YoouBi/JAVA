import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("왼쪽 수 입력?");
			int left = scan.nextInt();
			System.out.println("오른쪽 수 입력?");
			int right = scan.nextInt();
		
			if (right != 0) {
				System.out.println("나눈 몫: " + (left / right));
				// 조건식 없이 5, 0 을 입력하면 0으로 나눌수가 없으니
				// Exception in thread "main" java.lang.ArithmeticException: / by zero
				// at Main.main(Main.java:12) 라는 컴파일 오류가 뜸
				// '예외(Exception)'에 대한 상황을 메세지로 알려줌
				// .ArithmeticException는 앞에 .이 붙었으니 이유라는 클래스일 것
				// 예외 객체에 대한 정보
			} else {
				System.out.println("분모에 0을 입력할 수 없습니다");
			}
		} catch (InputMismatchException e) { // 변수 이름을 써준다
			System.out.println("숫자를 입력해야합니다");
			// e. 로 참조를 보면 객체니까 메소드를 가지고 있더라
			System.out.println(e.getMessage()); // 예를 들어 이런식으로 어떤 예외가 발생했는지 알려주는 메세지
			e.printStackTrace(); // 예외가 발생했던 경로를 출력하라는 메소드
			// 출력되었을 때 제일 밑에 있는게 가장 오래된 과거
		}
		// ㅁ을 입력하면
//		Exception in thread "main" java.util.InputMismatchException
//		at java.util.Scanner.throwFor(Unknown Source)
//		at java.util.Scanner.next(Unknown Source)
//		at java.util.Scanner.nextInt(Unknown Source)
//		at java.util.Scanner.nextInt(Unknown Source)
//		at Main.main(Main.java:8)
		// 가 뜨는데 Scanner라는 친구가 네가 만들어놓은 상황이 아니더라 하고 객체로 알려주는 것
		
		// 자바에서는 '예외처리'라는 걸 할 수 있는데
//		try { // 이 블럭은 예외가 발생할 수 있을 것 같은 가능성을 지닌 문장을 적는데
//			// 프로그램 흐름 문장
//		} catch () { // 문장 중 예외가 발생하고 정상적 흐름을 따라가지 못하고 종료되는 걸 잡아낼 수 있는데 () 안은 어떤 예외를 잡을 건지 타입으로 명시해놓는 것
//			// 예외를 처리하는 문장
//		} // 정상적으로 동작하면 건너뛰고 그냥 밑으로 흘러간다
		
		System.out.println("프로그램 정상 종료");
	}
}
