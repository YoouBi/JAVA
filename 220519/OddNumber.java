// 사용자가 입력한 정수가 짝수면 true, 홀수면 false를 출력해보세요.

import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("홀수인지 짝수인지 판별할 정수를 입력해주세요.");
		int x = input.nextInt();
		int xCopy = x;
		x = x % 2;
		
		boolean num = ( x == 0);
		boolean odd = ( x == 1);
		System.out.print(xCopy + "는 짝수인가요? " + num);
		System.out.print(xCopy + "는 홀수인가요? " + odd);
	}
}

/* import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수?? ");
		int x = scan.nextInt();
		
		System.out.println(x % 2 == 0);
	}
} */