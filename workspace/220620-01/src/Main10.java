import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<>(Arrays.asList("사과", "포도", "오렌지", "배", "수박"));
		
		// 콘솔 입출력
		
		// 과일 목록 보여주기
		while (true) {
			System.out.println("================ 과일 목록 ================");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(i + 1 + ") " + list.get(i));
			}

			// 고객에게 과일 주기 (제일 앞에거부터 줌)
			System.out.println("================ 매장 관리 ================\n1.고객에게 과일 주기\n2.재고 과일 추가하기\n지정된 번호 중 선택 해 주세요");
			int x = scan.nextInt();

			if (x == 1) {
				System.out.println("이 청과점에서는 정해진 순서대로만 과일을 팝니다\n" + list.remove(0) + " 과일을 사시겠습니까?\n1.그래도 삽니다 2.안살게요;;");
				scan.nextLine();
				int y = scan.nextInt();
				
				System.out.println(x +"" + y);
				if (y == 1) list.remove(0); // 왜... if 조건이 아닐때도 삭제가 되는거지???
				
			// 재고 과일 추가하기 (제일 마지막에 추가) - 진열대가 최대 10개
			} else if (x == 2) {
				if(list.size() <= 9) {
					System.out.println("재고 목록에 추가할 과일을 입력해주세요.");
					scan.nextLine();
					String z = scan.nextLine();
					
					list.add(z);
				} else {
					System.out.println("이 청과점에는 10개의 과일만 진열 가능합니다.");
					continue;
				}
			} else {
				System.out.println("청과점 관리 프로그램을 종료합니다.");
				break;
			}
		}
	}
}