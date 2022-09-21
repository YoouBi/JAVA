
public class Maze {
	public static void main(String[] args) {
		for (int i = 1; i <= 400; i++) {
			if(i == 21 || i == 22 || i == 379 || i == 399) {
				System.out.print("□");
			} else {
				System.out.print("■");
			}
			
			if(i%20 == 0 && i != 0) {
				System.out.println("");
			}
			// 방향성 정하는 랜덤 숫자
			// 정했을 때 가장 마지막 벽 전까지 도달 할 수 있는 랜덤 숫자
		}
	}
}
// 제일 처음은 기본 연산자로 출력
// 다음은 이중 배열로 출력
// 그 다음은 미로 칸 직접 입력해서 계산 되도록 출력
// 다음은 직접 움직여서 탈출할 수 있도록 출력