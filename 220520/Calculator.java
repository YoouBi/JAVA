// 정수 2개와 연산자(문자열 + - * /) 등을 입력받아 사칙연산을 수행하는 계산기 프로그램

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 2개를 입력하세요.");
		int x = input.nextInt();
		int y = input.nextInt();
		input.nextLine();
		System.out.print("계산하고 싶은 사칙연산 중 한 기호(연산자)를 써주세요.");
		String cal = input.nextLine();
		
		if (cal.equals("+")) {
			System.out.printf("%d와 %d를 더한 값은 %d다.", x, y, x + y);
		} else if (cal.equals("-")) {
			System.out.printf("%d에 %d를 뺀 값은 %d다.", x, y, x - y);
		} else if (cal.equals("*")) {
			System.out.printf("%d와 %d를 곱한 값은 %d다.", x, y, x * y);
		} else if (cal.equals("/")) {
			System.out.printf("%d에 %d를 나눈 몫은 %d이고 나머지는 %d다.", x, y, x / y, x % y);
		} else {
			System.out.println("입력이 잘못되었습니다.");
		}
	}
}