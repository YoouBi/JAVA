// 3개의 정수를 입력받아 가장 큰 수를 출력하세요.
import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력해주세요.");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		int biggest;
		int middle;
		int small;
		
		/* int max;
		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}

		System.out.println("가장 큰수는 : " + max); */
		
		if (x >= y && y >= z) {
			biggest = x;
			middle = y;
			small = z;
		} else if (x >= z && z >= y) {
			biggest = x;
			middle = z;
			small = y;
		} else if (y >= z && z >= x) {
			biggest = y;
			middle = z;
			small = x;
		} else if (y >= x && x >= z) {
			biggest = y;
			middle = x;
			small = z;
		} else if (z >= y && y >= x) {
			biggest = z;
			middle = y;
			small = x;
		} else {
			biggest = z;
			middle = x;
			small = y;
		}
		
		System.out.printf("입력한 3개의 정수는 %d, %d, %d 순으로 작아집니다.", biggest, middle, small);
	}
}