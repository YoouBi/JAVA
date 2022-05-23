// 1 ~ 10까지 출력하세요.
public class Loop1 {
	public static void main(String[] args) {
		boolean con = true;
		
		int i = 0;
		while (i < 5) { // 조건식이 참이면 중괄호 안의 문장 수행, 이후 다시 while문으로 돌아온다
			System.out.println("반복됩니다.");
			i++;
		}
		
		// Hello World 10번 출력하기
		int j = 0;
		while (j < 10) {
			System.out.println("Hello World");
			System.out.println("j의 값: " + j);
			j++;
		}
		
		int k = 1;
		while (k <= 10) {
			System.out.println(k);
			k++;
		}
		/* System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10); */
	}
}