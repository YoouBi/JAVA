// 사용자에게 정수 하나를 입력받아서
// 제곱 값을 출력하는 프로그램

import java.util.Scanner;

public class Squared {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		int squared;
		
		System.out.print("정수 값을 입력하시오: ");
		x = input.nextInt();
		
	    squared = x * x;
		System.out.print("제곱 값: " + squared);
	}
}

/* import java.util.Scanner;

public class Pow {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 하나 입력해주세요: ")
		int x = scan.nextInt();
		
		System.out.print("제곱 값은: " + (x + x))
	}
} */

