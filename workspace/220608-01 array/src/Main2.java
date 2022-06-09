public class Main2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

//		int[] copy = arr; // 새 참조를 만들어서 원본 배열과 같은 걸 만들고자하면
		// 같은걸'참조'하는 배열을 만드는거지 새로운 배열이 생기는건 아니다
		int[] copy = new int[arr.length]; // 그래서 똑같은 배열을 새로 만들려면 new 지정으로 똑같은 길이값부터 지정해서
		
		for (int i = 0; i < arr.length; i++) { // for문으로 원본 배열 순환
			copy[i] = arr[i];
		}
		
		arr[0] = 1000; // 복사본이 만들어졌으므로 원본 수정을 해도 카피본은 그대로일 것
		// int[] copy = arr; 였을때는 원본 수정을 해도 카피본까지 바뀌었구나... 어제 수업 제대로 안들었군...
		
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}
	}
}