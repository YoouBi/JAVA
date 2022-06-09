public class Main {
	public static void main(String[] args) {
		// 배열은 하나의 이름으로 여러개의 표현을 동적으로 사용가능
		int[] aBox; // [대괄호로]정수형 배열 변수 선언
		aBox = new int[4]; // 길이나 4인 배열 초기화.
		// new가 왜 붙느냐? 객체로서 길이가 4개인 정수를 담을 수 있는 배열을 참조하고 있다	
		// aBox = 10;은 안됨 aBox는 정수를 여러개 담을 수 있는 박스이지, 정수 하나를 지정하는 변수가 아님
		
		System.out.println("배열의 길이값: " + aBox.length);
//		aBox.length = 10; // final 즉 상수가 되어버리기 때문에 자바 배열은 초기화할 때 정해둔 길이 값을 변경할 수 없다.
		
		aBox[0] = 56;
		aBox[1] = 57;
		aBox[2] = 58;
		aBox[3] = 59;
		
		System.out.println(aBox[0]);
		System.out.println(aBox[1]);
		System.out.println(aBox[2]);
		System.out.println(aBox[3]);
	}
}
