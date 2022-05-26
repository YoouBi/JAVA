public class Methods {
	// 숫자 하나가 짝수, 홀수 인지 알고 싶음. 이 기능을 할 수 있는 메소드.
	// 리턴타입 이름(파라미터들)
	// 논리값 짝수냐(정수)
	public static boolean isEven(int i) { // 짝수면 참, 홀수면 거짓
		return i % 2 == 0;
	}
	
	// int isEven(int)
	
	// void isEven(int) 어떤 결과값을 내야하면 보이드는 피하자
	
	// char isEven(int)
	
	
	public static int increase(int a) {
		a++;
		return a;
	}
	
	// public static int, int createTwoNumber() { 메소드는 리턴 값을 하나만 가질 수 있다 void도 없는 값을 반환
		// return 20, 30; 참조형 string처럼 많은 값을 가진 변수를 배우게 될 것
	// }
	
	// public static boolean test() {
		// return 10;
	// }
	
	public static void main(String[] args) {
		boolean result = isEven(125);
		System.out.println(result);
				
		// int a = 10;
		// a = increase(a); // call By Value
		
		// System.out.println(increase(a));
		// System.out.println(a);
	}
}