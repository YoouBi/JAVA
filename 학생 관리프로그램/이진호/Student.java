package hello;

// 학생
public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;

	// 이름 국어점수 영어점수 수학점수
	// 생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student(String name) {
		this(name, 0, 0, 0);
	}

	// getter setter
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
	
	public int getAvg() {
		return (kor + eng + math) / 3;
	}

	public void avg() {
		System.out.println(getName()+ " 학생의 평균은 " + getAvg());
	}

	public String score() {
		return String.format("%s \n 국어: %d, 영어:%d, 수학%d, 평균 : %d", name, kor, eng, math, (kor + eng + math) / 3);
	}
}
	

//자기평균점수를 알려줄수있는 메소드
