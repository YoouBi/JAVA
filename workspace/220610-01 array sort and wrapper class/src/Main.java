import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// 정렬 배운다... 정렬 알고리즘을 만드는것도 아닌데 무서워하지 말고 내 꺼에 잘 녹여내면 된다
		// 알고리즘으로 만들 수 있지만 매번 그럴수는 없으니까 원시형 데이터에 기반해서 정렬할 수 있는 메소드 sort를 이미 만들어뒀다
		int[] arr = { 50, 30, 20, 60, 10 };
		
		Arrays.sort(arr); // 파라미터 배열 참조를 하나 건네받는다
		// 1자리, 2자리, 3자리 ~ 마지막자리 순서대로 그 자리 안에 있는 값을 비교를해서 자리를 땡긴다

		System.out.println(Arrays.toString(arr));
	}

}