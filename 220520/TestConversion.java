public class TestConversion {
	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4; // 계산을 먼저 하고 실수형의 상자에 담겼기 때문에 뒤의 소수점을 버린 1에 다시 소수점을 붙인 1.0
		System.out.println(f);
		
		f = (double) 5 / 4;
		System.out.println(f);
		
		f = 5 / (double) 4;
		System.out.println(f);
		
		f = (double) 5 / (double) 4;
		System.out.println(f);
		
		i = (int) 1.3 + (int) 1.8; // 인트로 뒤의 소수점을 버린 1과 1을 더하게 되었기 때문에 2 출력
		System.out.println(i);
		
		i = (int) (1.3 + 1.8); // 3.1이라는 실수값을 계산 후에 인트 값으로 바꾸었기 때문에 3 출력
		System.out.println(i);
	}
}
		