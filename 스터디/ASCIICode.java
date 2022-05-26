import java.util.Scanner;

public class ASCIICode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("ASCIICode를 알고싶은 알파벳 소문자, 대문자, 숫자 0-9 중 한 문자를 써주세요.");
		String a = scan.nextLine();
		char b = a.charAt(0);
		
		System.out.printf("%s의 ASCIICode는 %d이다.", b, b + 0);
		
		// char z = 'B';
		// System.out.println(z + 0);
		// System.out.println((char)(z + 1));
		// 1byte = 8비트(01로 표현 가능한 2의 8승)
		// 아스키 코드(약속이 적혀있는 표, 공유하면 누구나가 읽을 수 있음)가 7비트로 문자를 담아냈는데
		// 		*나머지 1비트는 수신할 때 쓰인다고 한다
		// 이미 하나하나의 비트에 문자 하나하나가 저장되어 있으므로 저장된 abcd 외의 한글같은 다른 문자는 쓸 수 없다
		// 아스키 코드는 미국놈이 만들었기 때문에 영어만 저장되어있고 다른 언어는 없다
		// 그런데 자신의 나라의 문자를 표시할 수 있는 유니 코드조차 여러개가 있다ㅠㅠ (뭘...선택하지...?)
		// 따라서 각 나라의 문자를 쓰기 위해 다국어를 사용할 수 있는 유니 코드 중 UTF-8을 우리가 쓰고 있는 것이다
		// 코드는 A를 인코딩하면 65가 되고 65(2의 7승 중 65번째)를 디코딩하면 다시 A로 표현하자, 라는 약속과도 같은 것이라 공유된 사람들끼리만 쓸 수 있다!
	}
}