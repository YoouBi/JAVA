import java.util.Scanner;

public class Room {
	private Student s1;
	private Student s2;
	private Student s3;
	Scanner scan = new Scanner(System.in);

	public Room(Student s1, Student s2, Student s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
//학생 이름 전부 나열
	public void printAllName() {
		System.out.printf(" %s, %s, %s", s1.getName(), s2.getName(), s3.getName());
	}
	
//원하는 사람의 이름을 입력하면, 그 사람의 정보를 선택해서 보고싶다!!	
	public void selectName() {
		boolean go = true;
		do {//입력한 이름이 존재하지 않으면 반복하고, 입력한 이름이 있으면 모든 항목을 출력한다. 
				System.out.println("조회하고 싶은 학생의 이름을 입력하세요: ");
				String select = scan.nextLine();
				if (select.equals(s1.getName())) {
					System.out.println("입력하신 정보 입니다. ");
					s1.printAllStudent();
					break;
				} else if (select.equals(s2.getName())) {
					System.out.println("입력하신 정보 입니다. ");
					s2.printAllStudent();
					break;
				} else if (select.equals(s3.getName())) {
					System.out.println("입력하신 정보 입니다. ");
					s3.printAllStudent();
					break;
				} else {
					System.out.println("입력한 이름은 존재하지 않습니다. ");
				}
			
			}while(go);
		
		
	}

	

	public int roomAver() {
		return (s1.getAverage() + s2.getAverage() + s3.getAverage()) / 3;
	}

	public Student roomTop() {
		Student top;
		if ((s1.getAverage() >= s2.getAverage()) && (s1.getAverage() >= s3.getAverage())) {
			top = s1;
		} else if (s2.getAverage() >= s3.getAverage()) {
			top = s2;
		} else {
			top = s3;
		}
		return top;
	}

	public void lookFor() {
		System.out.println("어떤 정보를 조회하고 싶은지 입력하시오. \n 1번:국어   2번:영어   3번:수학   4번: 이 학생의 평균");
		int num = scan.nextInt();
		if (num == 1) {
			System.out.println("국어 점수: "+roomTop().getKor());
		} else if (num == 2) {
			System.out.println("영어 점수: "+roomTop().getEng());
		} else if (num == 3) {
			System.out.println("수학 점수: " +roomTop().getMath());
		} else {
			System.out.println("평균 점수: "+roomTop().getAverage());
		}
	}

}
