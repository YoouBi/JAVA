import java.util.Scanner;
import java.util.Random;

public class LetterGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random(); // Random 메소드는 랜덤한 난수를 만들어주는 역할
		int answer = random.nextInt(100); // 0부터 100까지의 수 중 한개를 뽑아서 객체를 만들어줌
		int quess;
		// int quess= -1;
		int tries = 0;
		
		// 반복 구조
		do {
			System.out.print("정답을 추측하여 보시오: ");
			quess = scan.nextInt();
			tries++;
			
			if (quess > answer)		// 사용자가 입력한 정수가 정답보다 높으면
				System.out.println("제시한 정수가 높습니다.");
			if (quess < answer)		// 사용자가 입력한 정수가 정답보다 낮으면
				System.out.println("제시한 정수가 낮습니다.");
		} while (quess != answer);
		
		// for ( ; guess != answer; ) 는 비추천. 괜히 세미콜론만 두개 붙어서 복잡해지고 필요없는 부분이 있음
		/* while (guess != answer) { // guess값이 초기화가 되어있지 않으니 지정하고
			System.out.print("정답을추측하여보시오:");
			guess = scan.nextInt();
			tries++;

			if (guess > answer)
				System.out.println("제시한정수가높습니다.");
			if (guess < answer)
				System.out.println("제시한정수가낮습니다.");
		} */
		
		System.out.printf("축하합니다. 시도 횟수 = %d \n", tries);
	}
}