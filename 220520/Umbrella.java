// 오늘의 날씨를 물어보고 "비"를 입력받으면 우산을 챙겨가라고 문자열 출력하는 프로그램

import java.util.Scanner;

public class Umbrella {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("오늘의 날씨는 어떤가요? ");
		String weather = input.nextLine();
		
		if (weather.equals("비")) { // (weather && ("비")) 는 논리연산자이기 때문에 논리'값'으로 연산해서 문자열은 컴파일 오류가 남
			System.out.println("우산을 챙겨가세요.");
		}
		
		System.out.println("좋은 하루 보내세요.");
	}
}