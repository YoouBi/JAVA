// 정수 2개를 입력받아서 큰 수에서 작은 수로 나눈 몫과 나머지를 출력
import java.util.Scanner;

public class DivMod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 정수 a, b 입력받기
		System.out.println("두 개의 정수를 써주세요.");
		int x = input.nextInt();
		int y = input.nextInt();
		if (x >= y) { // a / b, a % b 계산하기
			
			System.out.printf("큰 수 %d를 작은 수 %d로 나눈 몫은 %d, 나머지는 %d입니다."
								, x, y, x / y, x % y);
		} else { // b / a, b % a 계산하기
			
			System.out.printf("큰 수 %d를 작은 수 %d로 나눈 몫은 %d, 나머지는 %d입니다."
								, y, x, y / x, y % x);
		}
		// 이렇게 쓰면 출력을 영어로 해주세요! 했을 때 then절과 else절의 출력을 모두 바꿔야하기 때문에
		// 출력을 밖에 빼서 한번에 수정할 수 있도록 만드는 것이 좋다
		
		System.out.println("두 개의 정수를 써주세요.");
		int a = input.nextInt();
		int b = input.nextInt();
		int div;
		int mod; // 변수 선언을 먼저 해주고 중괄호 안에 초기화를 하면 컴파일 오류가 안난다
		
		if (a != 0 && b != 0) {
			if (a >= b) {
				div = a / b;
				mod = a % b;
			} else {
				div = b / a;
				mod = b % a;
			}
		}
		// 결과 출력하기
		System.out.println("몫: " + div);
		System.out.println("나머지: " + mod);
	}
}