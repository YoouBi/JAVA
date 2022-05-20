// 79페이지 연습

public class IntegerTypes {
	public static void main(String[] args) {
		byte b = 100;
		short s = 30000;
		int i = 10_000_000; // ,로 자릿수 표현하면 자바에서는 여러개로 구분해서 컴파일 에러나기 때문에 _로 표기한다
		long l = 123456789L; // 롱타입의 큰 숫자라는 걸 알려주기 위해 L을 붙여줬다 안붙이면 int값이네? 라고 인식한다
		// long 변수에는 접미사인 L을 붙여줘야(소문자 대문자 상관없지만 소문자는 1과 헷갈릴 수 있어서!) 컴파일 에러가 발생하지 않는다
		// 컴퓨터 언어 혹은 컴퓨터...마다도 int의 바이트 크기가 다를 수 있기 때문에 외워서 쓰기보다는 확인해서 쓴다
		
		int bs = b + s; // 작은 범위의 친구(byte)와 큰 범위의 친구(short)를 연산하면 큰 범위의 친구(short)로 따라간다
		System.out.println(bs);
		
		byte b2 = 100;
		
		byte sum = b + b2; // 넉넉하게 큰 범위의 공간을 지정해줘야 컴파일 에러가 안난다
		System.out.println(sum);
	}
}