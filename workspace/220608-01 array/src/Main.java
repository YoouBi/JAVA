public class Main {
	public static void main(String[] args) {
		// 다음과 같은 정수형 배열이 있을 때
		int[] arr = { 15, 32, 222, 119, 534, 36, 9, 1234 };
		int count = 0;
		
		// 2자리 수의 개수와 목록을 콘솔창에 출력해보세요~
		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i] / 100 > 0) && arr[i] < 10) {
				count++;
			}
		}
		System.out.println("개수 : " + count);
		System.out.println("-- 목록 --");
		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i] / 100 > 0) && arr[i] < 10) {
				System.out.println(arr[i]);
			}
		} // 논리의 순서때문에 똑같은 루트의 for문 반복을 두번하게 되었지만
		// 배열 혹은 메소드를 활용하면 될 것
		
		// 개수 : 3
		// -- 목록 --
		// 15
		// 32
		// 36
	}
}