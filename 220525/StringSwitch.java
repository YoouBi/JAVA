public class StringSwitch {
	public static void main(String[] args) {
		String month = "february";
		
		int monthNumber;
		switch (month) {
		case "january": // 일반적으로 우리가 쓰던 조건문이나 메소드 호출까지도 케이스 안에서 실행 가능
			monthNumber = 1;
			break;
		case "february":
			// int b = 10; 위에서 변수 선언을 해두면 인식은 하지만 초기화가 안되어있을수도 있겠다, 하면서 컴파일 에러 남
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			int b = 1111; // 그렇다고 아래쪽에 같은 이름의 변수를 선언하면 중복되어 나오는걸로 생각하기 때문에 컴파일 에러
			System.out.println(b);
			break;
		default:
			monthNumber = 0;
			break;
		}
		System.out.println(monthNumber);
	}
}