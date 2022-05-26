public class TestMethod {
	public static void printRepeat() { // 이름이 표현되어있는 이 부분을 '메소드의 머리(head)'라고 한다 : 기능 이름
		// 메소드의 중요한 부분 void와 ()
		for (int i = 0; i < 3; i++) {
			System.out.println("반복 중");
		}
	} // 메소드를 만들어둠
	
	//printHello
	public static void printHello() {
	// 몸통 {} 이 없으면 컴파일 에러가 나지만 몸통이 비워져있는건 컴파일 에러가 나지 않는다
		int number = 10;
		System.out.println("Hello");
		System.out.println("초기화한 변수 값: " + number);
	}
	
	public static void main(String[] args) { // 프로그램 '실행' 은 언제나 메인 메소드만
		// 메소드 몸통(body): 기능 동작
		System.out.println("프로그램 시작~");
		
		printHello();
		// System.out.println("헬로 안에서 초기화한 변수 값: " + number);
		// {} 안은 지역변수기 때문에 나오면 없어짐
		
		/* for (int i = 0; i < 2; i++) {
			printRepeat(); // 메소드를 이름 그대로 불러주면서 호출함
		} */
		
		System.out.println("프로그램 끝~");
	}
}