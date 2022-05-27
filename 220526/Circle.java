// 1. 원의 반지름(실수형)을 전달받아 원넓이(실수형)를 반환하는 메소드 작성 후
// 메인메소드에서 호출하여 출력을 통해 값을 확인해보세요.

import java.util.Scanner;

public class Circle {
	// 헤더 파라미터(반환타입)
	public static double area(double r) {
		// 바디
		// 원 넓이 구해서 반환
		return r * r * 3.14;
	}
	
	// 문장
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("넓이를 알고싶은 원의 반지름 값을 써주세요.");
		double r = scan.nextInt();
		
		System.out.println(area(r));
	}
}