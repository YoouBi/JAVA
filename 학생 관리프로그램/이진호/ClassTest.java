package hello;

import java.util.Scanner;
//학생관리 프로그램
// 콘솔 입출력
// 반에 학생을 등록, 3명
// 시작화면 (반의 이름을 입력하세요)
// 학생의 이름을 입력하세요
// 학생의 국어 점수를 입력하세요
// 학생의 영어, 수학 점수를 입력하세요.

// 이름 목록을 볼수있어야 하고
// 평균을 볼 수 있어야 하고
// 1등학생의 정보도 볼수있는 프로그램.
// 자유롭게
// 기존에 만들었던 클래스 << 수정. 수정을 해야하는 이유와 전후가 어떻게 바뀌었는지 기록.

class Classes {
	private String Classes;
	private Student st1; // static을 쓰면 새로운 변수가 안 생기고 st1이라는 값이 고정된 상태에서 이름만 바뀌기때문에 이런 경우에는 static을 쓰지 않는 것이 좋다.
	private Student st2;
	private Student st3;
	private int avg1;
	private int avg2;
	private int avg3;

	public Classes(String Classes, Student st1, Student st2, Student st3) {
		this.Classes = Classes;
		this.st1 = st1;
		this.st2 = st2;
		this.st3 = st3;
	}

	// 입력받는 메소드를 추가함
	public void infoInput() {
		System.out.println("정보 입력 프로그램");
		Scanner scan = new Scanner(System.in);
		// 1번 입력
		System.out.println("1번 학생의 이름을 입력하세요.");
		st1.setName(scan.nextLine());
		System.out.println("1번 학생의 국어 점수를 입력하세요.");
		st1.setKor(scan.nextInt());
		System.out.println("1번 학생의 영어 점수를 입력하세요.");
		st1.setEng(scan.nextInt());
		System.out.println("1번 학생의 수학 점수를 입력하세요.");
		st1.setMath(scan.nextInt());
		scan.nextLine();
		// 2번 입력
		System.out.println("2번 학생의 이름을 입력하세요.");
		st2.setName(scan.nextLine());
		System.out.println("2번 학생의 국어 점수를 입력하세요.");
		st2.setKor(scan.nextInt());
		System.out.println("2번 학생의 영어 점수를 입력하세요.");
		st2.setEng(scan.nextInt());
		System.out.println("2번 학생의 수학 점수를 입력하세요.");
		st2.setMath(scan.nextInt());
		scan.nextLine();
		// 3번 입력
		System.out.println("3번 학생의 이름을 입력하세요.");
		st3.setName(scan.nextLine());
		System.out.println("3번 학생의 국어 점수를 입력하세요.");
		st3.setKor(scan.nextInt());
		System.out.println("3번 학생의 영어 점수를 입력하세요.");
		st3.setEng(scan.nextInt());
		System.out.println("3번 학생의 수학 점수를 입력하세요.");
		st3.setMath(scan.nextInt());
	}

	public void getClassName() {
		System.out.println("학생들의 이름 " + st1.getName() + " " + st2.getName() + " " + st3.getName());
	}

	public void getStudentAvg() {
		avg1 = st1.getAvg();
		avg2 = st2.getAvg();
		avg3 = st3.getAvg();
	}

	public void getClassAvg() {
		getStudentAvg();
		int sumAvg = avg1 + avg2 + avg3;
		int cAvg = sumAvg / 3;

		System.out.println("학생들의 평균은 : " + cAvg);
	}

	public void getClass1st() {
		getStudentAvg();
		if (avg1 >= avg2) {
			if (avg1 >= avg3) {
				System.out.println("평균이 가장 높은 학생은 : " + st1.getName());
			} else {
				System.out.println("평균이 가장 높은 학생은 : " + st3.getName());
			}
		} else {
			if (avg2 >= avg3) {
				System.out.println("평균이 가장 높은 학생은 : " + st2.getName());
			} else {
				System.out.println("평균이 가장 높은 학생은 : " + st3.getName());
			}
		}
	}
}