// 3. 사용자가 입력한 4자리의 정수가 좌우가 같을 때 true를 출력하세요. 나머지 경우는 false
// ex) 1221 -> true,      1557 -> false     9009 -> true
import java.util.Scanner;

public class Mirror {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("4자리로 이루어진 정수를 써주세요. ");
		int x = input.nextInt();
		
		int xtho = x / 1000;
		int xhun = x % 1000 / 100;
		int xtan = x % 100 / 10;
		int xdig = x % 10;
		
		boolean mi1 = (xtho == xdig);
		boolean mi2 = (xhun == xtan);
		
		System.out.print("이 정수의 좌우는 같은가요? ");
		System.out.println(mi1 && mi2);
	}
}