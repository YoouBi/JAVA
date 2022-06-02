// 학생 (이름, 국영수) 관리 프로그램
// 콘솔 입출력
// 반에 학생을 등록 3명
// 이름 목록을 볼 수 있어야 하고
// 평균 볼 수 있어야하고
// 1등 학생 정보 볼수 있는 프로그램
// 자유롭게

// 기존 만든 클래스 수정. 수정 이후 전 과 후 바뀐 이유 기록하기.
import java.io.ObjectInputStream.GetField;
import java.util.*;

class Class {
	public Student a;
	public Student b;
	public Student c;
	
	public Class(Student x, Student y, Student z) {
		a = x;
		b = y;
		c = z;
	}
		
	void printName() {
		System.out.println(a.getName());
		System.out.println(b.getName());
		System.out.println(c.getName());
	}
	
///////////////////////////////  메뉴를 만들어줬다.
	void getMenu() {
		Scanner scan = new Scanner(System.in);
		int menu;
		do {	
			System.out.println("메뉴를 입력하세요 1(이름 목록), 2(3명의 평균), 3(평균 1등의 정보), 4(시스템 종료)");
			menu = scan.nextInt();
			if (menu == 1) {
				 printName();
			} else if (menu == 2) {
				printAvg();
			} else if (menu == 3) {
				best();
			} else if (menu > 4 || menu < 1) {
				System.out.println("잘못된 입력입니다. 1~4까지만 입력하세요.");
			}
		}
		 while (menu != 4);
		System.out.println("시스템 종료");
	}
/////////////////////////////////////////////////////
	
	
	
	int printAvg() {
		int sum = a.getAverage() + c.getAverage()  + b.getAverage() ;
		System.out.println(sum / 3);
		return sum / 3;
	}
	
	
	
	
/////////////////////////////////// 원래 1등의 이름만 출력하는 메소드를 호출했었다. 하지만 1등의 모든 정보를 출력하는 메소드를 호출하도록 수정했다.
	public void best() {
		if(a.getAverage() >= b.getAverage() && a.getAverage() >= c.getAverage()) {
			a.getStudent();
		} else if(b.getAverage() >= a.getAverage() && b.getAverage() >= c.getAverage()) {
			b.getStudent();
		} else {
			c.getStudent(); 
		}
	}	
///////////////////////////////////////////////
}




///////////////////////////////// 학생을 만들었다. 이 학생은 사용자가 입력한 정보를 자기 자신의 값에 입력하는 행동을 한다.
class InputProgram {
	Student input;
	Student inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생의 이름을 입력하세요");
		String name1 = scan.nextLine();
		System.out.println("국어 점수를 입력하세요");
		int kor1 = scan.nextInt();		
		System.out.println("영어 점수를 입력하세요");
		int eng1 = scan.nextInt();		
		System.out.println("수학 점수를 입력하세요");
		int math1 = scan.nextInt();
		scan.nextLine();				//////////////// 수학점수 입력 이후에 dowhile문에서 오류가 발생했다. enter가 기본으로 입력되어있어 다음 단계로 넘어가지 못했다.
		input = new Student(name1, kor1, eng1, math1);
		return input;
	}
}
////////////////////////////////


class Teacher {
	public void All() {
	InputProgram p = new InputProgram();
	
	Student student1 = p.inputStudent();
	Student student2 = p.inputStudent();
	Student student3 = p.inputStudent();
	
	Class test = new Class(student1, student2, student3);
	test.getMenu();	
	}
	
}





public class TestClassR {
	public static void main(String[] args) {
//////////////////////////////////main은 완전 바꾸었다. 사용자가 입력한 값이 정보가 되는 학생을 3명 만들었다. 그 학생 3명을 학급으로 넣었다.
		
		Teacher t = new Teacher();
		t.All();
	
/////////////////////////////////////////////////////////////
		
	/*	
		Scanner scan = new Scanner(System.in);
		System.out.println("학생의 정보를 입력하세요 이름, 국, 영, 수 : ");
		String name1 = scan.nextLine();
		int kor1 = scan.nextInt();
		int eng1 = scan.nextInt();
		int math1 = scan.nextInt();
		Student student1 = new Student(name1, kor1, eng1, math1);
		
		System.out.println("학생의 정보를 입력하세요 이름, 국, 영, 수 : ");
		String name2 = scan.nextLine();
		int kor2 = scan.nextInt();
		int eng2 = scan.nextInt();
		int math2 = scan.nextInt();
		Student student2 = new Student(name2, kor2, eng2, math2);
		
		System.out.println("학생의 정보를 입력하세요 이름, 국, 영, 수 : ");
		String name3 = scan.nextLine();
		int kor3 = scan.nextInt();
		int eng3 = scan.nextInt();
		int math3 = scan.nextInt();
		Student student3 = new Student(name3, kor3, eng3, math3);
		*/
		
	}

}