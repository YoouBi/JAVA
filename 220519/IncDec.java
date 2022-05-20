public class IncDec {
	public static void main(String[] args) {
		int a = 55;
		
		a = 78;	
		
		// System.out.println(a + 5); 처럼 대입 연산을 하면 기존의 값이 변하지 않는다
		// a = a + 5;
		a += 5; // 복합 대입연산자로 줄일 수 있다
		
		System.out.println(a);
		
		a -= 3; // 순서는 산술연산자가 대입연산자 앞에 와야 컴파일 에러가 안난다
		a *= 2;
		a /= 4;
		a %= 2;
	}
}