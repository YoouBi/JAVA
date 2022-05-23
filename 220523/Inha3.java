// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
// 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

public class Inha3 {
	public static void main(String[] args) {
		for (int i = 1; i >= 100; i++) {
			for (int j = 100; j >= i; j--) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}