public class TestMax {
	public static int max(int left, int right) {
		return left > right ? left : right; // 삼항연산자로 큰 값 출력
	}
	
	public static void main(String[] args) {
		// 3개 정수 중 가장 큰 값 구하기
		int x = 100;
		int y = 50;
		int z = 75;
		
		int result1 = max(x, y); // 두 개를 비교해서 큰 거 알려주는 거에다가 (x, y) 집어넣음
		int finalResult = max(result1, z);
		
		System.out.println(finalResult);
		
		int m = max(3, max(7, max(5, 1)));
	}
}