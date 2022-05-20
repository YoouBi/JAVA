// 2. 사용자에게 3개의 정수를 입력받아 순서대로 입력된 수일 경우 true를 출력하세요. 나머지 경우는 false
// ex) 1 2 3 -> true,     4 5 6 -> true,    7 9 10 -> false
import java.util.Scanner;

public class Sequential {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 셋을 적어주세요. ");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		boolean before = (x + 1 == y);
		boolean after = (y + 1 == z);
		
		System.out.println("적은 정수 셋은 순서대로 입력된 정수인가요? ");
		System.out.println(before && after);
		
		// System.out.println(y == x + 1 && y == z - 1);
		// 관계연산자가 산술연산자보다 우선순위가 더 낮아서 x + 1이 먼저 되고 y == x + 1 비교가 후에 일어나는 것
	}
}