
public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student(String name, int kor, int eng, int math) {
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
	
	public int getSum() { // public void getSum()로 썼을 때 붉은 오류 줄에 마우스를 올리면 어떻게 수정할지
		return ( kor + eng + math ); // 질문이 뜨는데 누르면 바로 수정해준다! 저장은 스스로...
	}
}
