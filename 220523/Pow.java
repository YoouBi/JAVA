// 사용자의 입력 n, m에 대해
// n^m(n의 m제곱)을 출력하기
import java.util.Scanner;

public class Pow {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("무슨 수를 몇 제곱하고 싶은지 순서대로 적어주세요.");
		int n = input.nextInt();
		int m = input.nextInt();
		long pow = 1;
		System.out.println(pow);
		
		for (int i = 0; i < m ; i++) {
			pow *= n;
		}
		
	System.out.println(n + "의 " + m + "제곱 값은 " + pow + "입니다.");
	}
}