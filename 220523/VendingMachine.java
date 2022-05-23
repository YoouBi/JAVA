// 자판기 프로그램 돈 입력
// 반복하여 입력을 받아
// 1번 콜라 : 1500
// 2번 사이다 : 1300
// 3번 계산
// 총 몇 개의 캔을 구입하고, 거스름돈은 얼마인지 출력하세요 (외상 안 됨)

// 사용자가 입력한 정수의 약수를 나열하고 총 개수를 출력하세요

// 사용자가 입력한 5개의 정수 중 가장 큰 수를 출력하세요
// 사용자가 입력한 영단어(latin 문자열)에서 모음(a e i o u)이 몇 개인지 출력하세요

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("자판기에 넣은 금액이 얼마입니까?");
		int money = input.nextInt();
		
		int sum = 0;
		int coke = 0;
		int cider = 0;
		
		// 반복의 조건 몇번 입력할건지 먼저? 개입되는데 중요한 것은 넣은 돈으로 살 수 있는지. 계산을 입력했을 때 끝
		System.out.print("계산 되어야할 캔의 금액을 쓰고, 음료수를 전부 다 샀다면 0이라고 써주세요.");
		input.nextInt();
		for (int i = 1; i != 0; i++) {
			int can = input.nextInt();
			
			if (can == 1500)  {
				coke++;
			} else if (can == 1300) {
				cider++;
			} else if (can == 0) {
				i = 0;
			} else {
				System.out.println("자판기에 없는 음료수인 것 같습니다.");
			}
		}
		
		sum = (1500 * coke) + (1300 * cider);
		int num = coke + cider;
		
		System.out.printf("총 %d개의 캔을 샀으며 거스름돈은 %d원입니다." ,num , money - sum);
	}
}