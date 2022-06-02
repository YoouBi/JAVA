import java.util.Scanner;

public class TestNewStudent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = 1;
		int value2 = 1;
		int value3 = 1;
//		Score student1 = new Score("민수", 90, 150, 70);
//		Score student2 = new Score("철수", 70, 80, 120);
//		Score student3 = new Score("영희", 130, 100, 80);

		// 입력값으로 바꿔줄 예정
		Score student1 = new Score();
		Score student2 = new Score();
		Score student3 = new Score();
		ClassMate cls1 = new ClassMate(student1, student2, student3);

//		String grade = cls1.getGrade() + "반";
//		String s1Name = student1.getName();
//		String s2Name = student2.getName();
//		String s3Name = student3.getName();

		// 데이터 입력 (반)
		cls1.getGradeDate();
		// 데이터 입력 (이름 , 과목당 점수)
		student1.getStudentDate();
		student2.getStudentDate();
		student3.getStudentDate();

		// 프로그램 시작
		while (value != 4) {
			System.out.println("---원하는 보기를 선택해주세요---");
			System.out.println("1 : 학생들 명단");
			System.out.println("2 : 학생들의 총 평균");
			System.out.println("3 : 학생들 순위");
			System.out.println("4 : 종료");
			value = scan.nextInt();

			switch (value) {
			case 1:
				// 큰보기에서 케이스를 선택하면 메뉴를 또 고를수있게 value값 하나 더만들어줌
				while (value2 != 0) {
					System.out.println("---학생들 명단---");
					System.out.println("학생의 점수확인을 원하시면 숫자를 누르세요");
					System.out.println("1. " + student1.getName());
					System.out.println("2. " + student2.getName());
					System.out.println("3. " + student3.getName());
					System.out.println("0. 이전");
					value2 = scan.nextInt();
					switch (value2) {
					case 1:
						student1.allPrint();
						break;
					case 2:
						student2.allPrint();
						break;
					case 3:
						student3.allPrint();
						break;
					}
				}
				break;
			case 2:
				while (value3 != 0) { // 같은 value2로 했더니 위에서 이미 이전항목(0값)을 선택해서
					// while을 돌릴수가 없었음 그래서 value3으로 하나더 생성
					System.out.println("---학생들 평균---");
					System.out.println("원하시는 학생의 숫자를 누르세요");
					System.out.println("1. " + student1.getName() + "의 평균");
					System.out.println("2. " + student2.getName() + "의 평균");
					System.out.println("3. " + student3.getName() + "의 평균");
					System.out.println("4. 총 학생들의 평균");
					System.out.println("0. 이전");
					value3 = scan.nextInt();
					switch (value3) {
					case 1:
						student1.avgPrint();
						break;
					case 2:
						student2.avgPrint();
						break;
					case 3:
						student3.avgPrint();
						break;
					case 4:
						System.out.println("총 평균 : "
								+ (student1.getAverage() + student2.getAverage() + student3.getAverage()) / 3 + "\n");
						break;
					}
				}
				break;
			case 3:
				System.out.println("학생들 순위");
				// 두개중의 큰수보다 나머지 하나가 더크면 제일큰수
				System.out.println("1위 : " + cls1.mostAvg(student1, cls1.mostAvg(student2, student3)).getName());
				// 2위는 3개의 수면 1,2중 큰수와 2,3중 큰수중 더 작은게 2등!
				System.out.println("2위 : "
						+ cls1.leastAvg(cls1.mostAvg(student1, student2), cls1.mostAvg(student2, student3)).getName());
				// 두개중의 작은수보다 나머지 하나가 더 작으면 제일 작은수
				System.out.println("3위 : " + cls1.leastAvg(student1, cls1.leastAvg(student2, student3)).getName());
				break;
			case 4:
				System.out.println("종료");
				break;
			default:
				System.out.println("다시 입력하세요" + "\n");
				break;
			}
			value2 = 1; // value2랑 value3이 이미 0이되어있어서 다시 선택할수가없어서
			value3 = 1; // while 맨위로 올라가기전에 다시 초기화해줌!
		}

//		int avg1 = student1.getAverage();
//		int avg2 = student2.getAverage();
//		int avg3 = student3.getAverage();
//		
//		int avgSum = avg1 + avg2 + avg3;
//		int totalAvg = avgSum / 3;

		// 버튼식으로 만들고싶어서 switch 적용해볼려함

//		System.out.println("3명의 총 평균 : " + totalAvg + "\n");

//		System.out.print("가장 점수가 높은 학생 : ");
//		System.out.println(cls1.result(student1, cls1.mostAvg(student2, student3)));
	}
}