import java.util.Scanner;

public class Score {
	Scanner scan = new Scanner(System.in); // 콘솔 입력 추가
	private String name;
	private int kor;
	private int eng;
	private int math;

//	public Score(String name, int kor, int eng, int math) {
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}

	// 기존 임의의 데이터에서 입력만 가능하도록 수정
	public void getStudentDate() { // 학생의 정보를 입력
		System.out.println("학생의 이름을 입력하세요 : ");
		name = scan.nextLine();
		System.out.println("학생의 국어점수 : ");
		kor = scan.nextInt();
		System.out.println("학생의 영어점수 : ");
		eng = scan.nextInt();
		System.out.println("학생의 수학점수 : ");
		math = scan.nextInt();
	}

//	
	public String getName() {
		return name;
	}

//
//	public void setName(String name) {
//		this.name = name;
//	}
//
	public int getKor() {
		return kor;
	}

//
//	public void setKor(int kor) {
//		this.kor = kor;
//	}
//
	public int getEng() {
		return eng;
	}

//
//	public void setEng(int eng) {
//		this.eng = eng;
//	}
//
	public int getMath() {
		return math;
	}
//
//	public void setMath(int math) {
//		this.math = math;
//	}

	public int getSum() {
		return kor + eng + math;
	}

	public int getAverage() {
		return getSum() / 3;
	}

	public void avgPrint() {
		System.out.printf("%s의 평균 : %d\n", name, getAverage());
	}

	public void allPrint() {
		// 메인에 치기 귀찮아서 한번에 만듬
		System.out.println("이름 : " + name);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
	}
}
