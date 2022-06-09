public class Main6Test {
	// 정수 2개를 전달받아 합을 구해서 반환하는 메소드
//	public static int sum(int[] numbers) {
//		int sum = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			sum += numbers[i];
//		}
//		return sum; // 반환이 안됨 왜? int result = sum(10, 20); 는 인트 배열형이 아니니까
//	}
//	
//	public static void main(String[] args) {
//		int result = sum(new int[] a = {10, 20, 30, 40, 50}); // 그래서 이렇게 해주거나
//		System.out.println(result);
//	}
	
	public static int sum(int... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int result = sum(10, 20, 30, 40, 50, 60, 70, 80);
		// 이런식으로 굳이 배열을 새로 지정을 해주지 않고도 입력 받는 값을 가변 파라미터로 하면 된다
		// (int[] a) 파라미터의 이 형식을 계속 맞춰서 쓰기 귀찮고 불편해서 편의를 위해 만든 것
		System.out.println(result);
	}
}