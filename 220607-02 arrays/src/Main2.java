public class Main2 {
	public static void main(String[] args) {
		// 길이가 5인 정수 (int)형 배열을 선언 초기화 하고
		// 모든 원소(element:들어있는 하나하나의 값)의 값을 100으로 설정해보세요.
		int[] myBox = new int[5]; // 왼쪽에는 길이값 포함하지 않는 타입만 써주는거라 int[5]의 형식은 오류남
		
		for (int i = 0; i < myBox.length; i++) {
			myBox[i] = 100;
		}
//		myBox[5] = 100; // 컴파일할땐 문제가 없는데 실행할 때 문제가 생겨서 프로그램이 종료되어버린다		
		
		for (int i = 0; i < myBox.length; i++) {
			System.out.println(i + "번째 index의 원소값 : " + myBox[i]);
		}
		
		System.out.println("프로그램 정상 종료"); // err이 뭐징
	}
}