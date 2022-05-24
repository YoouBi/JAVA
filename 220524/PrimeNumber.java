// 사용자가 입력한 정수가 소수임을 확인하여 출력하는 프로그램

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int x = scan.nextInt();
		int y = 0;
		
		System.out.print(x + "의 약수는 ");
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.print(i + " ");
				y++;
			}
		}
	
		if (y == 2) {
			System.out.print(" 로 약수의 개수가 2개인 소수이다.");
		} else {
			System.out.printf(" 로 약수의 개수가 %d개로 소수가 아니다.", y);
		}
	}
}