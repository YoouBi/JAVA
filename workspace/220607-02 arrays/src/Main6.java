// 사용자가 0 이하의 정수를 입력할 때까지 반복하여 입력
// 최근 5개를 출력
// 10 20 30 40 50 60 70 80 90 100 -1 -> 100 90 80 70 60
// 10 20 30 40 50 60 70 80 90 100 -1 -> 60 70 80 90 100

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		int length = 0;
//		int i = 0;
//		int j = 0;
//		int[] k;
//	
//		System.out.println("5개 이상의 정수를 입력해주시고 그만두고 싶으실 때 음의 정수를 입력해주세요.");
//		do {		
//			j = scan.nextInt();
//			if (j < 0)
//				break;
//			length++;
//			k[i] = j;
//			i++;
//		} while (j > 0);
//		
//		int size = length;
//		k = new int[size];
//		
//		for (int l = size - 1; l >= 0; l--) {
//			System.out.println(k[i]);
//		}
		
//////////////어쩔 수 없다 칸 지정해놓고 입력받은 값 다 밀자//////////////

		int j = 0;
		int[] k = new int[5];
	
		System.out.println("5개 이상의 정수를 입력해주시고 그만두고 싶으실 때 음의 정수를 입력해주세요.");
		do {		
			j = scan.nextInt();
			if (j < 0)
				break;
			
			for (int i = 0; i < k.length; i++) {
				if(i > 0) k[i - 1] = k[i];
			
				k[i] = j;
			}
		} while (j > 0);
		
		System.out.println("마지막 5개의 정수는 순서대로 ");
		
		for (int i = 0; i <= k.length - 1; i++) {
			System.out.println(k[i]);
		}
		
		System.out.println("마지막 5개의 정수는 역순으로 ");
		for (int i = k.length - 1; i >= 0; i--) {
			System.out.println(k[i]);
		}
		
		System.out.println("입니다. ");
	}
}