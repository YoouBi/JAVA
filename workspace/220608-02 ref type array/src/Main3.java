// p237 2번
// 15
// 63
// 12
// 32
// 2

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int[] ten = new int [10];
		
		System.out.println("1~100 안에 들어가는 10개의 정수를 입력해주세요.");
		for (int i = 0; i < 10; i++) {
			if(0 < i && (ten[i - 1] < 1 || 100 < ten[i - 1])) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				i--;
			}
			int j = scan.nextInt();
			ten[i] = j;
		}
		
		for (int i = 0; i < 10; i++) { // 00 - 90 십의 자리 반복문
			System.out.print((i * 10 + 1) + "-" + (i * 10 + 10) + " : ");
			for (int j = 0; j < 10; j++) { // 해당 십의 자리 안 ten[] 배열 숫자가 들어가는지 체크
				if(i * 10 + 1 <= ten[j] && ten[j] <= i * 10 + 10) System.out.print('*');
			}
			System.out.println();
		}
	}
}	

//		int[] zero, one, two, three, four, five, six, saven = new int[10];
//		System.out.println("10개의 정수를 입력해주세요.");
//		
//		for (int j = 0; j <= 10; j++) {
//			for (int i = 0; i < 10; i++) {
//				if (j == 1) zero[i] = i + 1;
//				else if (j == 2) one[i] += 10 + zero[i];
//		}
		// 헉 이렇게 일일이 안만들어도 한번에 만들어서
		// int[] another = Arrays.copyOfRange(temp, 0, temp.length);로 1번째에서 10번째까지 복사하기 해도 되겠당
		
//		int[] hun = new int[100];
//		for (int i = 0; i < 100; i++) {
//			hun[i] = i + 1;
//		}
//		
//		System.out.println("10개의 정수를 입력해주세요.");
//		for (int i = 0; i < 10; i++) {
//			int j = scan.nextInt();
//			for (String a : hun) {
//				a += '*';
//			}
//		}
// 1~100 배열 안에 들어가는걸로 체크할랬는데 배열 자체를 입력받을 정수로 입력해서...?
