// X의 배수를 순서대로 입력하세요.

// 2 ~ 9 까지의 무작위 수를 정하여
// 사용자가 해당하는 수의 배수를 순서대로 입력하게끔 하여
// 틀릴 경우 종료

// 예) 랜덤 수가 6일 경우
// 사용자 입력 : 6 o/12 o/18 o/21 x 종료

import java.util.Scanner;
import java.util.Random;
// import java.util.*; 은 util 아래의 모두를 불러오는 것

public class InputNumberOrder {
	public static void main(String[] args) {
		Random random = new Random();
		int ran = random.nextInt(7) + 2;
		System.out.printf("%d의 배수를 순서대로 입력하세요.\n", ran);
		
		Scanner scan = new Scanner(System.in);
		for (int i = 1; ; i++) {
			int input = scan.nextInt();
			int mul = ran * i;
			if (input != mul) {
				System.out.println("X : 배수가 아니거나 순차적으로 적지 않았습니다.");
				break;
			} else {
				System.out.println("O");
			}
		}
		
		/* 
		int anwser = 0;
		while (true) {
			anwser += number;
			int userInput = scan.nextInt();
			
			if (anwser != userInput) {
				break;
			}
		}
		System.out.println("종료");
		*/
	}
}