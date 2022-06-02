// 학생
// 이름
// 국어 점수
// 영어 점수
// 수학 점수

// 생성자
// getter / setter

// 자기 평균 점수를 알려줄 수 있음.

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;

	// 모든 파라미터 값을 다 받아오는 생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// new 파라미터를 입력안받고 생성하기위한 생성자
	public Student() {

	}

	// name만 받고 나머지는 0으로 초기화 되는 생성자
	public Student(String name) {
		this.name = name;
	}

	// name을 반환해주는 getter
	public String getName() {
		return name;
	}

	// name값을 설정해주는 setter
	public void setName(String name) {
		this.name = name;
	}

	// 국어 점수를 반환해주는 getter
	public int getKor() {
		return kor;
	}

	// 국어 점수를 설정해주는 setter
	public void setKor(int kor) {
		this.kor = kor;
	}

	// 영어 점수를 반환해주는 getter
	public int getEng() {
		return eng;
	}

	// 영어 점수를 설정해주는 setter
	public void setEng(int eng) {
		this.eng = eng;
	}

	// 수학 점수를 반환해주는 getter
	public int getMath() {
		return math;
	}

	// 수학 점수를 설정해주는 setter
	public void setMath(int math) {
		this.math = math;
	}

	// 점수 합
	public int getSum() {
		return kor + eng + math;
	}

	// 평균 점수 얻기
	public double getAvg() {
		return getSum() / 3.0;
	}

	// new 학생의 모든 정보를 출력해주는 메소드
	public void allPrint() {
		System.out.println("이름: " + getName());
		System.out.println("국어: " + getKor());
		System.out.println("영어: " + getEng());
		System.out.println("수학: " + getMath());
		System.out.println("평균: " + getAvg());
	}

}