// 연산과 형변환

public class Swap {
	public static void main(String[] args) {
		int a = 10;
		int b = 55;
		int c = a;
		
		// 각 변수의 값을 교환하여 최종적으로 a = 55라는 값을, b = 10이라는 값을 가지게 하려면
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
	}
}