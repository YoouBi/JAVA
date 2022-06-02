import java.util.Scanner;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student() {
		Scanner s = new Scanner(System.in); // 기본 생성자를 지우고 Scanner를 사용하여 사용자가 학생 이름과 과목별 점수를 입력할 수 있게 설정함
		this.name = s.nextLine();
		this.kor = s.nextInt();
		this.eng = s.nextInt();
		this.math = s.nextInt();
	}

	public String getName() {
		this.name = name;
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public int getKor() {
		this.kor = kor;
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		this.eng = eng;
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		this.math = math;
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
