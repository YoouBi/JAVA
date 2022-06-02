import java.util.Scanner;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;

	
	public Student() {
		System.out.println("이름과 성적을 입력하세요.");
		Scanner name = new Scanner(System.in);
		this.name = name.nextLine();
		this.kor = name.nextInt();
		this.eng = name.nextInt();
		this.math = name.nextInt();
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
