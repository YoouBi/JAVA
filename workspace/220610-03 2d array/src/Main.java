public class Main {
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8, 10 };
		int[] arr2 = { 3, 6, 9, 12, 15 }; // ,18, 21 }; 열의 갯수가 다른 걸 int[][] 2차원 배열을 지정하지 않는 걸로 만들려고 하면 좋은 방법이 아니다
		int[] arr3 = { 4, 8, 12, 16, 20 };
		// 배열을 가지는 배열도 가질 수 있지 않을까 -> 2차원 배열이라고 부른다

		int[][] arr2d = new int[3][5]; // 열의 갯수를 지정 안해줘도 되고 인트 배열만 참조할 수 있다면 되지만
		arr2d[0][3] = 100; // []로 만든 배열에 어떤 값도 없다면 참조하고 있는 인트 배열이 없어서 널 값이 들어가기 때문
		// [5]개의 칸을 가진 배열을 참조하는 [3]개의 칸을 가진 배열
		
		arr2d[0] = arr1;
		arr2d[1] = arr2;
		arr2d[2] = arr3;
		// 인트 원소를 배열로 가지는 배열

		for (int i = 0; i < arr2d.length; i++) { //
			// 이차원 배열의 길이를 알려달라고하면(arr2d.length) 앞에있는 줄 수를 내놓는다 -> 3줄
			for (int j = 0; j < arr2d[i].length; j++) {
				System.out.println(arr2d[i][j]);
			}
		}

//		int[][] arrAnother = { { 2, 4, 6 }, { 3, 6, 9 }, { 4, 8, 12 } };
//		for (int i = 0; i < arrAnother[0].length; i++) {
//			System.out.println(arrAnother[0][i]);
//		}

//		System.out.println(arr2d[0][0]);
//		System.out.println(arr2d[0][1]);
//		System.out.println(arr2d[0][2]);
//		System.out.println(arr2d[0][3]);
//		System.out.println(arr2d[0][4]);

	}
}
