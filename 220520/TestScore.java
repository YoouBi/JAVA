// 사용자의 점수(정수형)를 입력받아 60점 이상이면 "합격" 출력 미만이면 "불합격" 문자열과 부족한 점수도 같이 출력

import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수를 정수형으로 입력해주세요. ");
		int x = input.nextInt();
		
		if (x >= 60) {
			System.out.print("합격하셨습니다. ");
		} else {
			System.out.printf("%d점으로 합격점 60점에 %d점이 부족하기때문에 불합격하셨습니다.", x, 60 - x);
			// 문자열은 %s 서식 문자로 넣을 수 있음
		}
	}
}