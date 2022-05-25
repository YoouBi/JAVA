// 사용자에게 비밀번호를 물어보고 동일할 경우 통과
// 최대 3번의 기회를 줌

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("비밀번호가 무엇입니까?(3번 틀릴 시 프로그램 강제종료)");
		String password = "password486";
		
		for (int i = 1; i <= 3; i++) {
			String pass = scan.nextLine();
						
			if (pass.equals(password)) {
				System.out.println("로그인 되었습니다.");
				break;
			} else {
				System.out.printf("%d회 시도.\n", i);
			}
			
			if (i == 3) {
				System.out.println("강제종료.");
				break;
			}	
		}
	}
}

/* 
public class Password {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String password = "1q2w3e";
		String userInput;
		boolean isOK = false;
		int count = 3;
		do {
			System.out.println("비밀번호를 입력하세요");
			userInput = scan.nextLine(); // do 안도 지역변수로 쳐서 위에 변수 지정을 해준다.
			count--;
			System.out.println("현재 카운트값 확인 : " + count);
			// 비밀번호가 틀렸고 아직 기회가 남아있으면
		} while (!isOk && count > 0);
		
		if (isOk) {
			System.out.println("통과~~");
		} else {
			System.out.println("비밀번호를 확인해주세영");
	}
}*/