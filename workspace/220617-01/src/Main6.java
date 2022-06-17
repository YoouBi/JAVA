import java.util.Scanner;

// 은행 계좌
// 필드 : 잔고 (int)
// 메소드 : 입금(int) : void
// 		    출금(int) : void >> 출금액이 보유 잔고 이상일 때 예외(부족한 금액이 얼마인지)
//		  getter() : int

class Bank {
	Scanner scan = new Scanner(System.in);
	
	private int balance = 1740500;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void credits() {
		System.out.println("입금하려는 금액을 입력해주세요.");
		int credits = scan.nextInt();
		
		balance += credits;
	}
	
	public void debits() throws BalanceMiss {
		System.out.println("출금하려는 금액을 입력해주세요.");
		int debits = scan.nextInt();
		
		if (balance >= debits) balance -= debits;
		try {
			if (balance < debits) {
				throw new BalanceMiss("잔고가 출금하려는 금액보다 " + (debits - balance) + "원 적습니다.");
			}
		} catch (BalanceMiss e) {
			System.out.println(e.getMessage()); // 초기화한 message를 게터해왓당
		}
	}
}

public class Main6 {
	public static void main(String[] args) {
		// 은행 계좌 객체 생성
		// 입금 / 출금 / 게터 테스트
		// 출금  호출 >> 예외 처리 (try - catch)
		Scanner scan = new Scanner(System.in);
		Bank jang = new Bank();
		
		while(true) {
			System.out.println("현재 잔고는 " + jang.getBalance() + "입니다.\n입금하려면 1번, 출금하려면 2번, 종료하려면 3번을 눌러주세요.");
			int a = scan.nextInt();
			
			if(a == 1) jang.credits();
			else if(a == 2) jang.debits();
			else break;
		}
	}
}

class BalanceMiss extends RuntimeException {
	public BalanceMiss(String message) {
		super(message);
	}
}