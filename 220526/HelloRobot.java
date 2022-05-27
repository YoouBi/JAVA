// 2. 전달받은 정수만큼 "안녕" 이라는 문자열을 출력하는 메소드. (return type : void 반환값 없음)

import java.util.Scanner;

public class HelloRobot {
	public static void hello(int i) {
		for(int j = 1; j <= i; j++) {
			System.out.println("안녕");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("안녕 인사를 몇번 받고 싶나요?");
		int k = scan.nextInt();
		
		hello(k);
	}
}