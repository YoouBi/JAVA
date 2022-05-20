// 사용자가 정수를 입력받아 짝수면 "짝수입니다." 출력하기

import java.util.Scanner;

public class IfEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("짝수 판별을 받을 정수 하나를 입력해주세요. ");
		int x = input.nextInt();
		
		if (x % 2 != 1) {
			System.out.println(x + "는 짝수입니다.");
		} else {
			System.out.println(x + "는 홀수입니다.");
		}
		
		/* if (조건식) {
			문장1
			문장2
		} else {
			문장3
			문장4
		}
		문장5
		조건식이 참일 경우에는 문장 1,2,5가 수행되고 거짓일 경우에는 문장 3,4,5가 수행된다 */
		
		System.out.println("프로그램 종료");
	}
}