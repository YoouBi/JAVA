// 배열과 for문은 짝이다..??
// 배열 쓰다보니 가장 많이 쓰는게 왼쪽부터 훑어보는 것이라...
public class Main6 {
	public static void someMethod(double d, int... arr) { // 가변끼리 파라미터로 이렇게 해도 배열을 전달받을 수 있다
		// 다른 파라미터도 전달받고 싶다고 (int... arr, double d)같은 방식으로 추가하면 에러가 뜬다
		// 파라미터가 여러개 있을때엔 맨 마지막에 위치해야하는 규칙이 있다
		// 우리가 직접 만드는게 아니라 결국에는 만들어지긴 하지만 컴파일러가 배열을 만든다
		// 따라서 int... arr이 언제 끝나고 double d가 시작될지 모르기 때문
		for (int number : arr) {
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		
		someMethod(40, 50, 60, 70, 80); // 같은 타입의 파라미터로 쉼표로 여러개 전달받을 수 있다
		// 이렇게 쉼표로 전달받을 때엔 (int... )에서 참조할 배열을 만들어준다
		
		// 인덱스 없이 순환할 수 있는 방법
//		for (int number : arr) { // for each문? 값을 '읽으려는' 용도
			// : 을 기준으로 오른쪽에는 여러개를 담을 수 있는 것(지금 기준으론 배열)이 온다
			// : 을 기준으로 왼쪽에는 오른쪽에서 꺼낸 값을 저장할 수 있는 변수의 타입과 이름을 써준다
			// 다만 꺼내는 것의 방향은 왼쪽에서부터 일방향으로 바꿀 수 없고, 무조건 하나씩 비교한다
//			arr[0] = 50;
//			arr[1] = 50;
//			arr[2] = 50; // 읽는 용도기 때문에 수정하는 용도로는 쓰지 말고 수정하려면 for(:)문에서 빼서 쓰자
//			System.out.println(number);
//		}
//		someMethod(arr);
		someMethod(new int[] { 20, 30, 40, 50, 60 }); // 메소드를 받는 입장에서는 편해졌지만 호출하는 입장에서는 불편해졌다
		System.out.println("---");
		someMethod(new int[] { 4, 5, 6 });
		System.out.println("종료");
	}
}