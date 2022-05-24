// 자판기 프로그램
// 돈을 자판기에 넣는다.
// 상품을 내가 원하는 만큼 선택하도록 반복한다. 
// 계산을 선택하면 반복문을 끝낸다.
// 1번 콜라 : 1500
// 2번 사이다 : 1300
// 3번 계산 
// 총 몇 개의 캔을 구입하고, 거스름돈은 얼마인지 출력하세요
import java.util.Scanner;

public class Drink{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int cokeCount = 0;
		int ciderCount = 0;
		boolean con = true;
		
		System.out.print("돈을 투입해주세요.");
		int money = scan.nextInt();
		
		while(con){
			System.out.print(" 1번 콜라: 1500 2번 사이다: 1300 3번 계산:");
			int number = scan.nextInt();
			
			if(number == 1){
				if( money >= 1500){
					money -= 1500;
					cokeCount++;
					
				} else{
					System.out.println("잔액이 부족합니다.");
				}			
			} else if(number == 2){
				if(money >= 1300){
					money -= 1300;
					ciderCount++;
				} else{
					System.out.println("잔액이 부족합니다.");
				}				
			} else if(number == 3){
				con = !con;
			} else{
				System.out.println("잘못된 입력입니다.");
			}
			
		}
		System.out.printf("구입한 캔의 개수는 콜라%d개 사이다%d개 이고 거스름돈은%d원 입니다.", cokeCount, ciderCount, money);
	}
}