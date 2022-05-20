import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		System.out.println("한줄을 입력하세요");
		scan.nextLine(); // 엔터 하나 가져와봐라
		String line = scan.nextLine(); // int i = scan.nextInt();가 한줄을 띄우는데
		// scan.nextLine();는 엔터를 보면 동작하기 때문에 빈 문자열을 출력해서
		// 위에 scan.nextLine();를 넣어줘서 엔터 하나를 쓰게 해서 상쇄시킨다
		
		System.out.println(line);
	}
}