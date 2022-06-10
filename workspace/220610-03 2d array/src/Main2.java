import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		// 2 ~ 5의 제곱수들을 각 원소로 가지는 2차원 배열 선언 초기화 후에 모든 원소 출력해보기
		// 2 4 8 16 ...
		// 3 9 27 81 ...
		// ...
		// 열 값은 자유롭게!
		// to.영빈이에게
		// 안녕 영비낭 언니는 지금
		// 자리에 들어가기 싫어서 여기 있어
		// 니 자리 따뜻하당 ♡
		// 나는 지금 집에 가고싶어.... 언제 가지 ,,,,
		// 귀염둥이 영빈아
		// 이제 쓸 말이 없다,,,,,
		// 엄청엄청엄청 예쁜 혜령언니가 ♡
		// 상체를 숙이지 말고, 하체만 움직여서 체중을 힘에 실어
		// 팔은 쭉 뻗어서 힘을 전달해
		// 그렇게 장호를 때리면 됨.

		int[][] arr2d = new int[4][10];

		for (int i = 0; i < arr2d.length; i++) { // 행
			for (int j = 0; j < arr2d[i].length; j++) { // 열
				if (j == 0)
					arr2d[i][j] = i + 2;
				else
					arr2d[i][j] = arr2d[i][j - 1] * (i + 2);
				System.out.print(arr2d[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(Arrays.deepToString(arr2d));

		int[][] arr = { { 2, 4, 8, 16, 32 }, { 3, 9, 27, 81, 243 }, { 4, 16, 64, 256, 1024 },
				{ 5, 25, 125, 625, 3125 } };

		int[][] arr2 = new int[4][5];
		for (int i = 0; i < arr2.length; i++) {
			int n = 1;
			for (int j = 0; j < arr2[i].length; j++) {
				n *= 2 + i;
				arr2[i][j] = n;
			}
		}

//		System.out.println(Arrays.toString(arr)); 은 배열 안에 배열이 들어있어서 안됨...ㅠㅠㅠㅠ
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(arr2));

		System.out.println(arr == arr2); // 참조가 다르다
		System.out.println(Arrays.equals(arr, arr2)); // 문자열로도 안됨
		System.out.println(Arrays.deepEquals(arr, arr2)); // deepEquals 비교로 된다!
	}
}