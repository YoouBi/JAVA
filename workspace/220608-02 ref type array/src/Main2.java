// p237 1번

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] chair = new int[10];
//		Arrays.fill(chair, 0); // 기본적으로 정수의 지정되지 않는 값은 0이기 때문에 굳이 초기화 안해줘도 될 듯
		int YesOrNo = 1;
		
		while (YesOrNo != 0) {
			System.out.println("좌석을 예약하시겠습니까?(1 또는 0)");
			YesOrNo = scan.nextInt();
			if (YesOrNo == 0) {
				System.out.println("좌석 예약 프로그램을 종료합니다.");
				break;
			}
			else if (YesOrNo == 1) {
				System.out.println("현재의 예약 상태는 다음과 같습니다.\n"
					+ "--------------------------\n"
					+ "1　2　3　4　5　6　7　8　9　10\n"
					+ "--------------------------");
				for (int a : chair) {
					System.out.print(a + "　");
				}
				System.out.println("\n몇번째 좌석을 예약하시겠습니까?");
				int seat = scan.nextInt();
				if (0 < seat && chair[seat - 1] == 1 && seat < 11) {
					System.out.println("이미 예약되어있는 자리입니다.");
				} else if (chair[seat - 1] == 0) {
					chair[seat - 1] = 1;
					System.out.println("예약되었습니다.");
				} else {
					System.out.println("입력하신 좌석은 없는 번호입니다.");
				}
			} else System.out.println("잘못된 입력값입니다.");
		}
	}
}