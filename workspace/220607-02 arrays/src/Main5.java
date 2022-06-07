// 사용자에게 5번의 정수를 입력받아
// 최근 입력한 순(역순)으로 출력하기
// 예 ) 10 20 30 40 50 -> 50 40 30 20 10

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		int[] k = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("5개의 정수를 입력해주세요.");
		for (int i = 0; i < k.length; i++) {
			int j = scan.nextInt();
			k[i] = j;
		}
		for (int i = (k.length - 1); i >= 0; i--) {
			System.out.println(k[i]);
		}
	}
}