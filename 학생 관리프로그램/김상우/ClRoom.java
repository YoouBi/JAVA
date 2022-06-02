import java.util.Scanner;

// 반에 학생 3명을 등록을 하고 이름 목록을 볼 수 있어야 함
// 등록한 학생의 점수 평균을 볼 수 있어야 하고 1등의 정보를 볼 수 있게 하라
// 기존에 만들었던 클래스를 수정 해야 한다면 해야하는 이유와 전 후가 어떻게 바뀌었는지 기록하기.
public class ClRoom {
	private Student s1;
	private Student s2;
	private Student s3;

	public ClRoom(Student s1, Student s2, Student s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public Student getS1() {
		return s1;
	}

	public void setS1(Student s1) {
		this.s1 = s1;
	}

	public Student getS2() {
		return s2;
	}

	public void setS2(Student s2) {
		this.s2 = s2;
	}

	public Student getS3() {
		return s3;
	}

	public void setS3(Student s3) {
		this.s3 = s3;
	}

	public void printNameAll() {
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(s3.getName());
	}

	public void printAver() {
		System.out.println((s1.getName()) + " 평균 점수 : " + (s1.getKor() + s1.getEng() + s1.getMath()) / 3);
		System.out.println((s2.getName()) + " 평균 점수 : " + (s2.getKor() + s2.getEng() + s2.getMath()) / 3);
		System.out.println((s3.getName()) + " 평균 점수 : " + (s3.getKor() + s3.getEng() + s3.getMath()) / 3);
	}

	public void printBestAver() {
		int a = (s1.getKor() + s1.getEng() + s1.getMath()) / 3;
		int b = (s2.getKor() + s2.getEng() + s2.getMath()) / 3;
		int c = (s3.getKor() + s3.getEng() + s3.getMath()) / 3;
		if (a > b && a > c) {
			System.out.println("1등 : " + s1.getName());
		} else if (b > a && b > c) {
			System.out.println("1등 : " + s2.getName());
		} else if (c > a && c > b) {
			System.out.println(("1등 : " + s3.getName()));
		} else {
			System.out.println();
		}

	}

//반복문과 switch 문을 사용하여 관리자 목록 프로그램 만들기. 
	public void manage() {
		boolean a = true;
		while (a) {
			System.out.println("관리 프로그램 \n(1번: 학생 이름 \n 2번 : 학생 성적 \n 3번 : 학생 성격 \n 4번 : 프로그램 종료)");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			switch (n) {
			case 1:
				System.out.println(s1.getName() + " , " + s2.getName() + " , " + s3.getName());
				break;

			case 2:
				System.out.println((s1.getName()) + " 평균 점수 : " + (s1.getKor() + s1.getEng() + s1.getMath()) / 3);
				System.out.println((s2.getName()) + " 평균 점수 : " + (s2.getKor() + s2.getEng() + s2.getMath()) / 3);
				System.out.println((s3.getName()) + " 평균 점수 : " + (s3.getKor() + s3.getEng() + s3.getMath()) / 3);
				break;

			case 3:
				System.out.println(s1.getName() + " : 싸가지 없음 \n" + s2.getName() + " : 착함 \n" + s3.getName() + ": 멋있음");

			case 4:
				a = false;
			}
		}
	}

}
