import java.util.Scanner;

public class TestMethodTest {
	// 정수 하나를 전달받아 1 ~ 100 사이의 수이면 true를 반환하고, 그렇지 않으면 false를 반환하는 메소드 작성.
	public static int sum(int i, int j, int k) {
		boolean all = ((1 <= i && i <= 100)
					&& (1 <= j && j <= 100)
					&& (1 <= k && k <= 100));
		if (all) {
			int sum = i + j + k;
			return sum;
		} else {
			return 0;
		}
	}
	
	// 사용자가 국어, 영어, 수학 점수를 입력하는데 (사용자 입력값은 무조건 1 ~ 100 사이어야 함.)
	// 입력한 점수와 점수의 합을 출력해보세요~~~~~~~~
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 점수를 순서대로 써주세요.");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		if (sum(kor, eng, math) != 0) {
			System.out.printf("입력하신 국어 %d점, 영어 %d점, 수학 %d점을 합한 총점은 %d점입니다.\n",
							kor, eng, math, sum(kor, eng, math));
		} else {
			System.out.println("한 과목의 점수는 1 ~ 100 사이에 위치해 있어야합니다.");
		}
	}
}