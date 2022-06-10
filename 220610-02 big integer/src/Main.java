import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		
		// 롱을 넘어서는 아주 큰 값을 입력하고 싶다! 정수에서 롱을 넘어서는 큰 값은 BigInteger!
		BigInteger value1 = BigInteger.valueOf(Long.MAX_VALUE + Long.MAX_VALUE);
		System.out.println(value1); // 은 범위를 넘어가서 이상하게 나온다
		BigInteger value2 = new BigInteger("9223372036854775808");
		// 그래서 문자열 형태로 다룰 수 있게끔 생성자를 만들어야한다
		System.out.println(value2);
		System.out.println(value2.add(new BigInteger("10"))); // 숫자처럼 더할수도 있음
		
		System.out.println(value2); // value2 가 바뀐건 아니고 새 BigInteger를 만들어서 반환해준거라 원래 상태값은 변하지 않음
		
		// double, float은 오차를 낼 수 있는 근사값
		BigDecimal dec = new BigDecimal("0.123456789");
		System.out.println(dec);
		
		BigDecimal d = new BigDecimal(0.1);
		System.out.println(d);
	}
}
