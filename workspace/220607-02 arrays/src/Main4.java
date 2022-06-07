import java.util.Arrays;

public class Main4 {
	static void printArray(char[] array) { // 객체를 만들지 않고 바로 사용할거니까 static
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	// 배열의 모든 원소를 문자열로 표현해서 반환하는 메소드
	static String printString(char[] target) { 
		String a = "";
		for (int i = 0; i < target.length; i++) {
			a += target[i];
		}
		return a;
	}
	
	// 캐릭터 배열에서 하나의 특정 문자의 인덱스를 찾아 반환하는 메소드
	static int whereIs(char[] target, char c) {
		for (int i = 0; i < target.length; i++) {
			if (target[i] == c) {
				return i;
			}
		} // char 찾았을 때만 반환하는 메소드라 오류가 남
		return -1; // char를 못찾았을 때 반환하는 값을 만들어줘야하는데, 이를 -1로 표현
		// 인덱스는 음수가 될 수 없는게... 이렇게 만들어진거라고????
	}
	
	public static void main(String[] args) {
		char[] hello = { 'H', 'e', 'l', 'l', 'o' };
		String result = Arrays.toString(hello); // 문자열 반환 메소드
//		printArray(hello);
//		String result = printString(hello);
		System.out.println(result);
		
//		for (int i = 0; i < hello.length; i++) {
//			System.out.println(hello[i]);
//		}
		
		// 위의 문자 배열에 o 문자에 해당하는 인덱스를 찾아보세요~
//		for (int i = 0; i < hello.length; i++) {
//			if (hello[i] == 'o') {
//				System.out.println("찾았다 : " + i);
//			}
//		}
	}
}