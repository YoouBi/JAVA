// 사용자가 입력한 원하는 반복 만큼만.
// 0부터 1씩 증가하는 수를 출력하기.
import java.util.Scanner;

public class LoopInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("몇까지 반복할까요?");
		int x = input.nextInt();
		int y = 0;
		
		while (y <= x) {
			System.out.println(y);
			y++;
		}
	}
}