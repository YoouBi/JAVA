import java.util.Scanner;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;


	public Student() {
		// 콘솔 입력에 따라 정보를 등록할 수 있도록 생성자 파라미터 편집
		Scanner scan = new Scanner(System.in); 
		String name = scan.nextLine();
		System.out.println("국어점수를 입력해주세요 ");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력해주세요 ");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력해주세요 ");
		int math = scan.nextInt();

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getAverage() {
		return getSum() / 3;
	}

	public int getSum() {
		return (kor + eng + math);
	}

}
