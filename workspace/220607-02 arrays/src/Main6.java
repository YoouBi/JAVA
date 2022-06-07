// 사용자가 0 이하의 정수를 입력할 때까지 반복하여 입력
// 최근 5개를 출력
// 10 20 30 40 50 60 70 80 90 100 -1 -> 100 90 80 70 60
// 10 20 30 40 50 60 70 80 90 100 -1 -> 60 70 80 90 100

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = 0;
		int j = 0;
		int[] k = new int[size];
	
		System.out.println("5개 이상의 정수를 입력해주시고 그만두고 싶으실 때 음의 정수를 입력해주세요.");
		while (j > 0) { // 앗 j가 for문에서 지역변수가 돼서 새로운 조건문을 써줘야할듯!
			for (int i = 0; i < k.length; i++) {
			j = scan.nextInt();
			if (j < 0) {
				break;
			}
			k[i] = j;
			size++;
			}
		}
		
		for (int i = size - 1; i >= 0; i--) {
			System.out.println(k[i]);
		}
	}
}