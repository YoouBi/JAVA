import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* while (false) {
			// 문장1
		} */
		System.out.println("10을 나눌 수를 입력하세요.");
		
		/*int num = input.nextInt();
		
		if (num == 0) {
			System.out.println("0으로 나눌 수 없음");
		} else {
			
		}
		*/
		
		int num;
		do { // 일단 do의 문장을 무조건 1번은 실행하고 while 조건을 실행한다
			// do는 한번만 실행되더라도 반복의 '가능성'이 있는 문
			num = input.nextInt();
			if (num == 0) {
				System.out.println("0으로 나눌 수 없음");
			}
		} while (num == 0); // ; 붙여줘야함!
		System.out.println(10 / num);
	}
}