// (1, 1) (1, 2) (1, 3) (1, 4)
// (2, 1) (2, 2) (2, 3) (2, 4)
// (3, 1) (3, 2) (3, 3) (3, 4)
// (4, 1) (4, 2) (4, 3) (4, 4)

public class Print2D {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println(); // 값을 받지 않아도 입력되도록 메소드를 만들었다!(편의 제공)
		}
	}
}