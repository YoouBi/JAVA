import java.util.Scanner;

// 학급(반)
// 학생 1번 
// 학생 2번
// 학생 3번

// 3명의 학생의 이름을 콘솔에 출력할 수 있음.
// 2. 학생 3명의 총 평균을 알려줄 수 있음.
// 3. 평균점수가 가장 높은 학생을 알려줄 수 있음. => 동일 점수. 1 < 2 < 3 순으로

public class StudentClass {
	// Student타입 학생 3명 선언
	private Student student1;
	private Student student2;
	private Student student3;

	Scanner scan = new Scanner(System.in);

	// 비교를 위한 max 값
	private double max = 0;

	// 학생을 학급에 넣어주는 생성자
	public StudentClass(Student student1, Student student2, Student student3) {
		this.student1 = student1;
		this.student2 = student2;
		this.student3 = student3;
	}

	// new null값으로 초기화하는 생성자
	public StudentClass() {

	}

	// new 학생을 입력받아서 설정해주는 메소드
	public Student setStudent(Student student) {
		System.out.print("이름을 입력하세요:");
		String name = scan.next();
		System.out.print("국어 점수를 입력하세요:");
		int kor = scan.nextInt();
		System.out.print("영어 점수를 입력하세요:");
		int eng = scan.nextInt();
		System.out.print("수학 점수를 입력하세요:");
		int math = scan.nextInt();
		student.setName(name);
		student.setKor(kor);
		student.setEng(eng);
		student.setMath(math);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		return student;
	}

	// 모든 학생 이름을 콘솔에 출력
	public void printStudent() {
		System.out.println(student1.getName());
		System.out.println(student2.getName());
		System.out.println(student3.getName());
	}

	// 세학생의 평균의 합을 반환
	public double getAverageSum() {
		return student1.getAvg() + student2.getAvg() + student3.getAvg();
	}

	// 세학생의 총 평균을 반환
	public double getAllAvg() {
		return getAverageSum() / 3.0;
	}

	// 평균 점수가 1등인 학생을 반환
	public Student getRankOne() {
		max = (student1.getAvg() >= student2.getAvg()) ? student1.getAvg() : student2.getAvg();
		max = (max >= student3.getAvg()) ? max : student3.getAvg();

		if (max == student1.getAvg()) {
			return student1;
		} else if (max == student2.getAvg()) {
			return student2;
		} else {
			return student3;
		}
	}

	// new 학생을 NULL값으로 초기화 하는 메소드
	public Student initStudent(Student student) {
		String name = null;
		int kor = 0;
		int eng = 0;
		int math = 0;
		student.setName(name);
		student.setKor(kor);
		student.setEng(eng);
		student.setMath(math);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		return student;
	}

	// new 학생 삭제 하는 메소드
	public void removeStudent() {
		System.out.print("삭제할 학생을 입력하세요:");
		String name = scan.next();

		if (name.equals(student1.getName())) {
			this.student1 = initStudent(student1);
		} else if (name.equals(student2.getName())) {
			this.student2 = initStudent(student2);
		} else if (name.equals(student3.getName())) {
			this.student3 = initStudent(student3);
		} else {
			System.out.println("학생 목록에 없는 이름입니다.");
		}

	}

	// new 비어있는 자리에 학생 추가 하는 메소드
	public void addStudent() {
		if (student1.getName() == null) {
			this.student1 = setStudent(student1);
		} else if (student2.getName() == null) {
			this.student2 = setStudent(student2);
		} else if (student3.getName() == null) {
			this.student3 = setStudent(student3);
		} else {
			System.out.println("정원 초과 입니다.");
		}
	}

	// new 학생 정보를 수정하는 메소드
	public void reTouchStudent() {
		System.out.print("수정할 학생의 이름을 입력해주세요: ");
		String name = scan.next();
		if (name.equals(student1.getName())) {
			this.student1 = setStudent(student1);
		} else if (name.equals(student2.getName())) {
			this.student2 = setStudent(student2);
		} else if (name.equals(student3.getName())) {
			this.student3 = setStudent(student3);
		}
	}

	// 원하는 학생의 모든 정보 출력 메소드
	public void wantPrintStudent() {
		System.out.print("원하는 학생의 이름을 입력해주세요: ");
		String name = scan.next();
		if (name.equals(student1.getName())) {
			student1.allPrint();
		} else if (name.equals(student2.getName())) {
			student2.allPrint();
		} else if (name.equals(student3.getName())) {
			student3.allPrint();
		}
	}
	
	// new 콘솔에서 입력받아서 학생의 정보를 입력/출력 하는 메소드
	public void manageProgram() {

		while (true) {
			System.out.print("1:학생 등록\n2:반 학생 이름 출력\n3:반평균 출력\n4:1등 학생정보 출력\n5:수정\n6:삭제\n7:추가\n8:원하는 학생 성적 출력\n9:종료\n");
			int n = scan.nextInt();
			System.out.println();
			switch (n) {
			case 1: // 등록
				this.student1 = setStudent(student1);
				this.student2 = setStudent(student2);
				this.student3 = setStudent(student3);
				break;
			case 2: // 학생들 출력
				printStudent();
				break;
			case 3: // 반평균 출력
				System.out.println("평균: " + getAllAvg());
				break;
			case 4: // 1등의 정보 출력
				System.out.println("*********1등*********");
				getRankOne().allPrint();
				break;
			case 5: // 수정
				reTouchStudent();
				break;
			case 6: // 삭제
				removeStudent();
				break;
			case 7: // 추가
				addStudent();
				break;
			case 8:
				wantPrintStudent();
				break;
			case 9: // 종료
				return;
			default: // 잘못된 입력 알려주기
				System.out.println("잘못된 입력입니다.");
				break;
			}

			System.out.println();
		}
	}

}