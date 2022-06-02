import java.util.Scanner;

public class Management {
	private School a;
	private School b;
	private School c;
	
	

	public void manage() {
		
		  Student a = new Student(); 
		  Student b = new Student(); 
		  Student c = new Student(); 
		  School me = new School(a, b, c);
		 

		System.out.println("　　　　　　　학생관리 프로그램");
		System.out.println("----------------------------------");
		System.out.println("1번 : 등록된 학생의 이름   2번 : 반 평균점수");
		System.out.println("3번 : 1등학생의  정보  4번 : 종료");
		
		Scanner scan = new Scanner(System.in);
		int no = 1;
		while(no < 5) {
			no = scan.nextInt();
			if (0 < no && no <= 4) {
				if (no == 1) {
					me.studentName();
					
			    } else if (no == 2) {
			    	me.print();
			    	
			    } else if (no == 3) {
			    	me.Wingrade();
			    	
			    } else if (no == 4) {
			    	System.out.println("프로그램을 종료합니다.");
			    	break;
			    }
			}
		}
	}

	// 반에 학생을 등록. 3명
	// 이름 목록을 볼 수 있어야하고
	// 평균을 볼 수 있고
	// 1등 학생의 정보도 볼 수 있는 프로그램.

}
