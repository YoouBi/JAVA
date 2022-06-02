import java.util.Scanner;

public class ClassMate {
	Scanner scan = new Scanner(System.in);
	int grade;
	Score student1;
	Score student2;
	Score student3;

	public ClassMate(Score student1, Score student2, Score student3) {
//		this.grade = grade;  반은 입력받을예정
		this.student1 = student1;
		this.student2 = student2;
		this.student3 = student3;
	}

	public void getGradeDate() {
		System.out.println("학생 관리 프로그램");
		System.out.println("몇반인지 입력하세요 : ");
		grade = scan.nextInt();
	}

	public int getGrade() {
		return grade;
	}
//
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}
//
//	public Score getStudent1() {
//		return student1;
//	}
//
//	public void setStudent1(Score student1) {
//		this.student1 = student1;
//	}
//
//	public Score getStudent2() {
//		return student2;
//	}
//
//	public void setStudent2(Score student2) {
//		this.student2 = student2;
//	}
//
//	public Score getStudent3() {
//		return student3;
//	}
//
//	public void setStudent3(Score student3) {
//		this.student3 = student3;
//	}

	// 1등뽑기
//	public Score mostAvg (Score a, Score b) {
//		return a.getAverage() >= b.getAverage() ? a : b;
//	}
//	
//	public String result (Score a, Score b) {
//		return a.getAverage() >= b.getAverage() ? a.getName() : b.getName();
//	}   --- 순위를 줘보고 싶어서 if로변경

//	public Score ranking (Score a, Score b, Score c) {
//		if (a.getAverage() >= b.getAverage()) {
//			if (a.getAverage() >= c.getAverage()) {
//				System.out.println("1위 : " + a.getName());
//				if (b.getAverage() >= c.getAverage()) {
//					System.out.println("2위 : " + b.getName());
//					System.out.println("3위 : " + c.getName());
//				} else {
//					System.out.println("2위 : " + c.getName());
//					System.out.println("3위 : " + b.getName());
//				}
//			} else {
//				System.out.println("1위 : " + c.getName());
//				if (a.getAverage() >= b.getAverage()) {
//					System.out.println("2위 : " + a.getName());
//					System.out.println("3위 : " + b.getName());
//				} else {
//					System.out.println("2위 : " + b.getName());
//					System.out.println("3위 : " + a.getName());
//				}
//			}
//		} else {
//			if (b.getAverage() >= c.getAverage()) {
//				System.out.println("1위 : " + b.getName());
//				if (a.getAverage() >= c.getAverage()) {
//					System.out.println("2위 : " + a.getName());
//					System.out.println("3위 : " + c.getName());
//				} else {
//					System.out.println("2위 : " + c.getName());
//					System.out.println("3위 : " + a.getName());
//				}
//			} else {
//				System.out.println("1위 : " + c.getName());
//				if (a.getAverage() >= b.getAverage()) {
//					System.out.println("2위 : " + a.getName());
//					System.out.println("3위 : " + b.getName());
//				} else {
//					System.out.println("2위 : " + b.getName());
//					System.out.println("3위 : " + a.getName());
//				}
//			}
//		}
//	} 너무 어지러워서 정리하고 싶음

	// 보다 큰수
	public Score mostAvg(Score a, Score b) {
		return a.getAverage() >= b.getAverage() ? a : b;
	}

	// 보다 작은수
	public Score leastAvg(Score a, Score b) {
		return a.getAverage() < b.getAverage() ? a : b;
	}

//	
//	public int mostSubject (int a, int b) {
//		return a >= b ? a : b;
//	}
}
