import java.util.Scanner; // 1. 스캐너를 불러온다

public class Student {
	Scanner scan = new Scanner(System.in); // 2. 스캐너 클래스를 새로 만든다

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public String a; // 4. 입력한 값을 class 내내  저장할 수 있게 변수 지정을 미리 해준다
	public int b;
	public int c;
	public int d;
	
	String k;

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student() {
		
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
		return (kor + eng + math); // 질문이 뜨는데 누르면 바로 수정해준다! 저장은 스스로...
	}

//	public void pipi() { // 3. 스캐너로 3명의 학생들의 이름을 입력할 메소드를 만든다
//		System.out.pri영수 점수를 차례로 등록해주세요.");
//		for(int j = 1; j <= 3; j++) {ntln("삐약이반에 들어갈 학생 세명의 이름과 국
//			k = "student" + j;
//			
//			System.out.print(k);
//			
//			System.out.println("의 이름, 국어 점수, 영어 점수, 수학 점수 순으로 입력해주세요.");
//			a = scan.nextLine(); // 이클립스 한줄 복사는 ctrl+alt+방향키
//			b = scan.nextInt();
//			c = scan.nextInt();
//			d = scan.nextInt();
//			scan.nextLine();
//			
//			Student k = new Student(a, b, c, d);
//		}
//	}

}




///////////////////////////////////////////////////////////






class Class {
	Scanner scan = new Scanner(System.in);
	
	
	
	Student student1, student2, student3;
	void pipiName() { // 이름 목록 불러내는 프로그램
		System.out.printf("삐약이반의 학생으로는 %s 학생, %s 학생, %s 학생이 있습니다.", student1.getName(), student2.getName(), student3.getName());
	}
	
	
	
	public Class(Student student1, Student student2, Student student3) {
		super();
		this.student1 = student1;
		this.student2 = student2;
		this.student3 = student3;
	}

	void pipiAverage() {
		int aver = (student1.getAverage() + student2.getAverage() + student3.getAverage()) / 3;
		System.out.printf("삐약이반 전체의 평균은 %d점입니다.", aver);
	}
	
	
	

	
	public Student firstName() {
		if (student1.getAverage() >= student2.getAverage() && student1.getAverage() >= student3.getAverage()) {
			return student1;
		} else if (student2.getAverage() > student1.getAverage() && student2.getAverage() >= student3.getAverage()) {
			return student2;
		} else {
			return student3;
		}
	}
	
	void pipiFirstPlace() {
		Student bestStudent = firstName();
		System.out.printf("삐약이반의 1등은 %s 학생으로 국어 %d점 영어 %d점 수학 %d점 총 평균점수 %d점을 보유하고 있습니다.", 
				bestStudent.getName(), bestStudent.getKor(), bestStudent.getEng(), bestStudent.getMath(), bestStudent.getAverage());
	}
	
	
	
	
	
	public void pipiStudent() { // 이름 목록과 평균, 1등 학생의 정보를 볼 수 있는 프로그램
//		pipi();
		while(true) {
			System.out.println("열람하고 싶은 정보의 번호를 입력해주세요.");
			System.out.println("1.삐약이반 학생 이름 목록 2.삐약이반 전체 평균점수 3.삐약이반 1등 학생 정보  4.삐약이반 정보 열람 종료");
			int i = scan.nextInt();
			
			if (i == 1) {
				pipiName();
			} else if (i == 2) {
				pipiAverage();
			} else if (i == 3) {
				pipiFirstPlace();
			} else if (i == 4) {
				System.out.println("삐약이반 정보 열람을 종료하겠습니다.");
				break;
			} else {
				System.out.println("잘못된 번호가 입력되었습니다.");
			}
		}
	}
}
	

class input {
	
	Student input;
	Student inputStudent() {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		scan.nextLine();
		input = new Student(name, kor, eng, math);
		return input;
	}
	
}
