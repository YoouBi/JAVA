// 사용자의 입력 n, m에 대해
// n^m(n의 m제곱)을 출력하기
import java.util.Scanner;

public class InputMul {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("무슨 수를 몇 제곱하고 싶은지 순서대로 적어주세요.");
		int x = input.nextInt();
		int y = input.nextInt();
		int mul = x;
		System.out.println(mul);
		
		for (int z = 1; z < y ; z++) {
			mul *= x;
		}
		
	System.out.println(x + "의 " + y + "제곱 값은 " + mul + "입니다.");
	}
}