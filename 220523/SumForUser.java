import java.util.Scanner;

public class SumForUser {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 사용자가 정수 범위를 지정 (시작-끝 입력)
		// 합
		// ex) 0 100 5050
		System.out.println("어디서부터 어디까지의 정수를 합할지 두 정수를 지정해주세요.");
		int x = input.nextInt();
		int y = input.nextInt();
		int sum = 0;
		
		for (; x <= y; x++) {
			sum += x;
		}
		
		/* for (int i = x; i <= y; i++) {
			sum += i;
		} */
		
		System.out.printf("두 수의 합은 %d입니다.", sum);
	}
}