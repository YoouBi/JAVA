// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, n번째 줄에는 별 n개를 찍는 문제

public class Inha2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
	}
}