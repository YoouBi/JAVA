// 사용자가 몇 개의 정수를 입력할지 먼저 정한 후.
// 정수를 입력하면
// 합과 평균을 구해서 출력하는 프로그램.

// 짝수끼리 합과 평균
// 홀수끼리 합과 평균

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("몇개의 정수를 합할 건가요?");
		int i = input.nextInt();
		
		System.out.println("앞서 적은 갯수만큼의 정수를 적어주세요.");
		int sum1 = 0;
		int sum2 = 0;
		
		for (int j = 1; j <= i; j++) {
			int num = input.nextInt(); // 정수 입력
			
			if (num % 2 == 0) {
				int two = num;
			} else {
				int one = num;
			}
			
			sum1 += one;
			sum2 += two;
		}

		System.out.printf("짝수끼리의 합은 %d이고, 홀수끼리의 합은 %d이다.", sum2, sum1);
	}
}