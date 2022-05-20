// 1. 사용자가 입력한 정수가 0 이상이며 7의 배수일 때만 true를 출력하세요. 나머지 경우는 false
import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력해주세요. ");
		int x = input.nextInt();
		int seven = x % 7;
		
		boolean zero = (x >= 0);
		boolean sevenMultiples = (seven == 0);
		
		System.out.println("정수 " + x + "는 0 이상의 수이며 7의 배수인가요?");
		System.out.println(zero && sevenMultiples);
	}
}