// 4단 말고도... 사용자의 입력을 받아 원하는 단수의 구구단 출력하는 프로그램.
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 4 * 1 = 4
		// 4 * 2 = 8
		// 4 * 3 = 12
		// 4 * 4 = 16
		// 4 * 5 = 20
		// 4 * 6 = 24
		// 4 * 7 = 28
		// 4 * 8 = 32
		// 4 * 9 = 36
		
		/* int x = 1;
		while (x <= 9) {
			System.out.printf("4 * %d = %d\n", x, 4 * x);
			x++;
		} */
		System.out.println("몇단의 구구단을 출력하고 싶나요?");
		int y = input.nextInt();
		
		int z = 1;
		while (z <= 9) {
			System.out.printf("%d * %d = %d\n", y, z, y * z);
			z++;
		}
	}
}