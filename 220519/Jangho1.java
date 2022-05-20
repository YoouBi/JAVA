// 네 자연수 A, B, C, D가 주어진다. 이때, A와 B를 붙인 수와 C와 D를 붙인 수의 합을 구하는 프로그램을 작성하시오.
// 두 수 A와 B를 합치는 것은 A의 뒤에 B를 붙이는 것을 의미한다. 즉, 20과 30을 붙이면 2030이 된다.

import java.util.Scanner;

public class Jangho1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("(1 ≤ A, B, C, D ≤ 1,000,000)을 충족하는 네 자연수 A, B, C, D를 순서대로 쓰시오. ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		
		String bString = "" + b;
		int bDig = bString.length();
		int aa = a * Math.pow(10, bDig));
				
		System.out.println(aa);
		
		/* int dDig = 
		int cd = (c * dDig ) + d;
		
		System.out.println(ab);
		System.out.println(a + "와 " + b + "를 순서대로 나열한 값 " + ab + "와 " 
		                 + c + "와 " + d + "를 순서대로 나열한 값 " + cd + "의 합은 " + abcd + "이다."); */
	}
}