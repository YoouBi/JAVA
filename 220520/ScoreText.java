// 사용자의 학점을 계산하자. 점수를 입력받아 90점 이상 ~ A, 80점 이상 90점 미만 B, 70-80 C, 60-70 D, 60미만 F
import java.util.Scanner;

public class ScoreText {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("학점을 계산하고 싶다면 점수를 입력해주세요. ");
		int score = input.nextInt();
		
		if (score >= 90) {
			System.out.print("당신의 학점은 A입니다.");
		} else if (score >= 80) {
			System.out.print("당신의 학점은 B입니다.");
		} else if (score >= 70) {
			System.out.print("당신의 학점은 C입니다.");
		} else if (score >= 60) {
			System.out.print("당신의 학점은 D입니다.");
		} else {
			System.out.print("당신의 학점은 F입니다.");
		}
	}
}

/*
public class ScoreText {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수는? ");
		int score = scanner.nextInt();
		
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("학점은 " + grade);
	}
}
*/