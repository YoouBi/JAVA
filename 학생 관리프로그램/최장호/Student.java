import java.util.*;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
	}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student(String name) {
		this.name = name;
	}
	
//////////////////////////////////// 학생의 모든 정보를 보여줄수 있는 메소드를 하나 만들었다.
	
	public void getStudent() {
		System.out.printf("이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d", name, kor, eng, math);
		System.out.println();
	}
///////////////////////////////////////////////////
	

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
		return ( kor + eng + math );
	}
	
	
}
