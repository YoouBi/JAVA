public class MethodHead {
	// 정수 두 개를 전달받아 왼쪽이 큰지 오른쪽이 큰지 혹은 같은지를 알고 싶음.
	// 불연으로 표현하기에는 나와야할 값이 3개라서 안됨

	// public static int compare(int left, int right) {
		// return left - right;
	// }
	
	// public은 아무나 다 써도 된다고 허용하는 접근 제한자
	// static는 정적 메소드로 
	// 정적 메소드 중에는 String.valueOf(123); 같은 느낌
	// Scanner scan = new Scanner(System.in); 처럼 실행할 때 인스턴스를 불러와서 쓰는 참조형 메소드 Scanner는
	
	public static char compare(int left, int right) {
		if (left > right) {
			return 'L';
		} else if (left < right) {
			return 'R';
		} else {
			return 'S';
		}
	}
	
	// short compare(int, int)
	
	public static void main(String[] args) {
		char result = compare(150, 170);
		System.out.println(result);
	}
}