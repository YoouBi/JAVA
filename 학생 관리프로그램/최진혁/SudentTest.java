import java.util.Scanner;

public class SudentTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StuCont cont = new StuCont();
		int number = -1;
		int cnt = 1;
	
		while(true) {
		System.out.println("===========목록==========");
		System.out.println("1. 신규 학생등록 (최대 3명까지 가능)");
		System.out.println("2. 학생 목록 보기");
		System.out.println("3. 각 과목당 평균 점수");
		System.out.println("4. 평균 1등 학생의 정보");
		System.out.println("5. 종료");
		System.out.println("========================");
		
		System.out.print("목록 번호 입력 하세요 : ");
		 number = sc.nextInt();
	
		
		if(number == 1) {
			cont.insert();
			System.out.println("-----------------------프로그램" + cnt +"번 실행 완료");
		}
		
		else if(number == 2) {
			cont.searchAll();

			System.out.println("-----------------------프로그램" + cnt +"번 실행 완료");
		}
		else if(number == 3) {
			
			cont.avg_per_subject();
			System.out.println("-----------------------프로그램" + cnt +"번 실행 완료");
		}
		else if(number == 4) {
			cont.winner();
			System.out.println("-----------------------프로그램" + cnt +"번 실행 완료");
		}
		else if(number == 5) {
			System.out.println("\n <학생 관리 프로그램을 종료합니다.>");
			break;
		}
		else {
			System.out.println("<범위에 없는 목록 번호를 입력하셨습니다.>");
			System.out.println("<다시 입력해주세요.>");
			System.out.println("-----------------------프로그램" + cnt +"번 실행 완료");
		}
		cnt++;
		}
		
	}

}
