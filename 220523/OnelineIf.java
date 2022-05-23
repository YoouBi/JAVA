public class OnelineIf {
	public static void main(String[] args) {
		boolean con = false;
		
		if (con) 
			System.out.println("참일 경우 실행할 문장");
		else 
			System.out.println("거짓일 경우 실행할 문장1"); // else절이 한 문장일 경우 {} 생략 가능
		System.out.println("거짓일 경우 실행할 문장2"); // 이렇게 하면 생략된 중괄호는 문장1까지만 포함하기 때문에 일반 문장인 문장2는 출력
		// 혼란을 피하기 위해 중괄호를 붙이는 편이 편할 것
		
		// if (con) System.out.println("참일 경우 실행할 문장"); else System.out.println("거짓일 경우 실행할 문장1");
		// 줄바꿈 하지않고 한문장으로도 표현 가능
		
		String result = (con) ? "참" : "거짓"; // ?는 삼항연산자로서 왼쪽에는 조건식이라고 부르는 boolean값 하나가 온다
		// 왼쪽에 오는 boolean값에 따라서 콜론으로 구별되어있는 값 중 하나를 선택한다
		// 참이면 콜론의 왼쪽 값, 거짓이면 오른쪽 값
		// if랑 비슷하지만 짧게 쓸 수 있는 표현
		// (con) ? System.out.println("참 출력") : System.out.println("거짓 출력"); 출력 문장으로는 안되고 '값'을 선택할 때 가능
		int result = (con) ? 100 : -100; // 인트값도 됨!
		/* int r;
		if (con) {
			// r = 100;
		else {
			 r = -100;
		} 만큼의 문장을 줄여 쓸 수 있다! */
		
		System.out.println(result);
		System.out.println("프로그램 종료");
	}
}