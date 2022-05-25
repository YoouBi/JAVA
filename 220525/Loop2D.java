public class Loop2D {
	public static void main(String[] args) {
		
		for (int j = 0; j < 5; j++) { // 중첩된 반복문의 밖은 아우터 루프
			for (int i = 0; i < 5; i++) { // 안은 이너 루프 라고 한다
				System.out.print("*"); // 흐름을 잘 모르겠을 땐 안의 이너 루프부터 먼저 본 후에 아우터 루프로
			}
			System.out.println();
		}
	}
}