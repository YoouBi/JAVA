// 사용자의 나이와 이름을 입력받아서
// 자기랑 같으면 true 출력하기

import java.util.Scanner;

public class AgeName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int myAge = 26;
		String myName = "장영빈";
		
		System.out.println("나이가 어떻게 되나요? ");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("이름은 어떻게 되나요? ");
		String name = input.nextLine();
		// String name = input.next(); 는 스페이스를 기준으로 입력받는다
		
		System.out.println(myName.equals(name) && (myAge == age));
	}
}