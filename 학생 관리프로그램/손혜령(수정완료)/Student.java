import java.util.Scanner;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	Scanner scan= new Scanner(System.in);//입력받는 스캐너를 불러온다. 
	
	//사용자 입력받기
	//이름, 국어 영어 수학 전부 입력 받아야 함. 
	// 학생 1명씩 입력받기??
	

	public Student() {//기본 생성자. 
	
	}
////////학생 하나의 이름,국어,영어,수학 점수 입력받는 메소드
	
	public void setStudent() {//학생 입력받아 저장하기
		System.out.println("학생의 이름을 입력하시오: ");
		name = scan.nextLine();
		System.out.println(name+"학생의 국어점수를 입력하시오: ");
		kor= scan.nextInt();
		System.out.println(name+"학생의 영어점수를 입력하시오: ");
		eng=scan.nextInt();
		System.out.println(name+"학생의 수학점수를 입력하시오: ");
		math= scan.nextInt();
		System.out.println("등록 완료!");
	}

	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
///////////////	
	//평균 내기 메소드
	public int getAverage() {
		return getSum()/3;
	}
	
	public int getSum() {
		return(kor+eng+math);
	}

	
	public void printAllStudent() { //입력한 정보를 모두 볼 수 있도록 출력하는 메소드 
		System.out.println("학생이름: " +name);
		System.out.print("{ 국어점수: "+ kor);
		System.out.print("/영어점수: "+ eng);
		System.out.print("/수학점수: "+ math);
		System.out.println("  }");
	}
	

	
	
	
	
/*
(전)생성자로 생성했던 거 

    public Student(String name, int kor, int eng, int math) {//생성자 이름은 클래스 이름과 같게
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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
		return getSum()/3;
	}
	
	public int getSum() {
		return(kor+eng+math);
	}

*/

	
}
