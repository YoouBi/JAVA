// 구구단
// 2단부터 9단까지

public class Gugudan {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i *j);
			}
		}
	}
}