// 사용자에게 초단위의 시간을 입력받아
// 시간 분 초로 변환을 하는 프로그램

// 입력예) 3666
// 출력예) 1시간 1분 6초

// 60초가 1분 60분이 1시간
import java.util.Scanner;

public class SecToTime {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int hour;
	int min;
	int se;
	int time;
	
	System.out.print("초를 입력하시오: ");
	time = input.nextInt();
	
	se = time % 60;
	min = (time / 60) % 60;
	hour = (time / 60) / 60;
	System.out.print("시간은: " + hour + "시 " + min + "분 " + se + "초");
	}
}

/* public class SecToTime {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Scanner.out.print("초 단위의 정수를 입력하세요.");
	int second = scanner.nextInt();
	
	// Scanner.out.println("입력한 수: " + second); 확인
    int hour = second / 3600;
	int minute = (second % 3600) / 60;
	int secondCal = second % 60;
	지금 second 변수 선언을 이미 썼는데, 원래 있던 변수의 값이 변경되어도 상관없다 하면 그대로 활용해도 된다
	
	System.out.print(hour + "시간");
	System.out.print(minute + "분");
	System.out.print(secondCal + "분");
    } // 테스트를 여러번 수행해서 논리적 흐름 제대로 수행되고 있는지
} */