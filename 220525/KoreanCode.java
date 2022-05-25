// 주민번호를 입력하면 성별을 출력하는 프로그램
// ex) xxxxxx-1xxxxxx
import java.util.Scanner;

public class KoreanCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주민번호를 입력해주세요.\n(제출 양식 : xxxxxx-xxxxxxx)");
		String num = scan.nextLine();
		
		if (num.length() == 14) {
			char m = num.charAt(7);
	
			switch (m) {
			case '1': 	case '3':
				System.out.println("제출하신 주민번호의 성별은 남성입니다.");
				break;
			case '2': 	case '4':
				System.out.println("제출하신 주민번호의 성별은 여성입니다.");
				break;
			default: // 없으면 컴파일 에러가 날 수도 있는데
					// 초기화가 '언제나' 일어나는지를 봐야한다
					// 실행 상 어떤 경우에는 초기화가 안되는 경우가 한번이라도 있다 싶으면 컴파일이 에러난다
				System.out.println("잘못된 주민번호입니다.");
			}
			
			/*if (num == '1' || '3')? // 문자는 어떻게 보면 정수로 표현 가능하기 때문에 ||로 비교 가능하다
			*/
		}
	}
}