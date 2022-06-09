import java.util.Arrays;

public class Main3 {
	// 정수형 배열을 전달받아 같은 길이와 원소값을 가지는 정수 배열을 반환하는 메소드
	public static int[] copyArray(int[] origin) {
		int[] copy = new int[origin.length];
		
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		return copy;
	}
	
	// 정수형 배열 2개가 동일한지(길이와 각 원소값)를 알 수 있는 메소드
	public static void twinArray(int[] origin, int[] twin) {
		for (int i = 0; i < origin.length; i++) {
			if (origin.length != twin.length) {
				System.out.println("두 정수형 배열은 동일하지 않습니다.");
				break;
			} else if (twin[i] != origin[i]) {
				System.out.println("두 정수형 배열은 동일하지 않습니다.");
				break;
			} else if (i + 1 == origin.length)
				System.out.println("두 정수형 배열은 동일한 배열입니다.");
		}
	}
	
	/* 쌤꺼
	public static boolean isSame(int[] left, int[] right) { // 동일하다, 하지 않다의 두 값으로 나오니 불연값으로 가능
		if (left.length != right.length) {
			return false;
		}
		
		for (int i = 0; i < left.length; i++) {
			if (left[i] != right[i]) {
				return false;
			}
		}
		
		return true;
	}
	 */
	
	
	public static void main(String[] args) {
		int[] test = { 50, 70, 90, 110 };
//		int[] test2 = { 50, 70, 90, 110 };
//		int[] test3 = { 70, 90, 110 };
//		int[] test4 = { 60, 70, 90, 110 };
		int[] c = copyArray(test);
		System.out.println(Arrays.toString(c)); // arrays 는 배열에 관련된 메소드로서 문자열 형태로 조립해서 반환해준다
//		twinArray(test, test2);
//		twinArray(test, test3);
//		twinArray(test, test4);
	}
}