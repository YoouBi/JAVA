// 사용자가 3대 측정
// 벤치, 스쿼트, 데드
// 합이 500이상이면 true
// false
import java.util.Scanner;

public class UnderArmour {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("벤치 측정값을 써주세요. ");
		int bc = input.nextInt();
		System.out.print("스쿼트 측정값을 써주세요. ");
		int sq = input.nextInt();
		System.out.print("데드 측정값을 써주세요. ");
		int dd = input.nextInt();
		int sum = bc + sq + dd;
		
		System.out.print("당신의 총 측정값이 500을 넘었나요? ");
		System.out.println(500 <= sum);
	}
}

/* public class UnderArmour {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("벤치, 스쿼트, 데드 순으로 3번 입력해주세요");
		int bench = scan.nextInt();
		int squat = scan.nextInt();
		int dead = scan.nextInt();
		
		int sum = bench + squat + dead;
		System.out.println(500 <= sum);
	}
} */