import java.util.Scanner;

public class Main5 {
	public static int divide(int left, int right) throws MyZeroDivideException {
		// throws MyZeroDivideException, Exception 처럼 여러개를 적어줄수도 있다
		if(right == 0) {
			throw new MyZeroDivideException("나눌 수 없음"); // 정보가 넘어가야하는데 try catch로는 int값 반환이 안될 수 있다
		} else {
			return left / right;
		}
	}
	
	public static int myFunction() {
		// 아직 미완성, 지원하지 않는 기능
		throw new UnsupportedOperationException("내일 만들게. 아직 덜 만듦.");
	}
	
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);

		myFunction();
//		scan.nextInt();
		
//		int result = divide(100, 50); // MyZeroDivideException 가 extends Exception 였을 때 예외처리가 안됐다고 컴파일 에러가 남

		//		try {
//			int result = divide(100, 50);
//		} catch (MyZeroDivideException e) {
//			System.out.println(e.getMessage());
//		}
	}
}