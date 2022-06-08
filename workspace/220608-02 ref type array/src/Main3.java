import java.util.Arrays;
import java.util.Scanner;

// p237 2번
// 15
// 63
// 12
// 32
// 2

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int[] ten = new int [10];
		
		System.out.println("10개의 정수를 입력해주세요.");
		for (int i = 0; i < 10; i++) {
			int j = scan.nextInt();
			ten[i] = j;
		}
		
		for (int i = 0; i < 10; i++) { // 01 - 10 반복문
			System.out.println((i * 10 + 1) + "-" + (i * 10 + 10) + " : ");
			for (int j = 0; j < 10; j++) { // 01 - 10 체크
				if(i * 10 + 1 <= ten[j] && ten[j] <= i * 10 + 10) System.out.print('*');
			}
			System.out.println();
		}
	}
}
