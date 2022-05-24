// 사용자가 입력한 정수의 약수를 나열하고 총 개수를 출력하세요
import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("약수를 알고 싶은 정수를 입력해주세요.");
		int x = input.nextInt();
		int z = 0;
		
		System.out.print(x + "의 약수는 ");
		for (int y = 1; y <= x; y++) {
			if (x % y == 0) {
				System.out.print( y + " ");
				z++;
			}
		}
		System.out.print("이고 약수의 총 갯수는 " + z + "개이다.");
	}
}