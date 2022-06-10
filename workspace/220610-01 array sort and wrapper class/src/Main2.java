public class Main2 {

	public static void main(String[] args) {
		int number = 22;
		// Wrapper class 원시형 형태들을 포장을 해준다고 해서 랩
//		Byte b; // 바이트 객체를 참조할 수 있는 참조형 변수가 하나 선언된거
//		Short
//		Integer // 특이하게 이름자체가 좀 바뀌는 친구들이 있는데
//		Long
//		Float
//		Double
//		Character // 이 둘. Char는 원래 
//		Boolean
		Integer i = new Integer(10); // 필드 10을 상태로 가지고 있는 i라는 Integer 생성자 안에 던져주면 참조해서 객체가 생성된다
		// 지금 우리가 성정한건 자바의 8버전인데 (구글검색 : java integer...)
		// Deprecated 즉, 자바 기능이 9이상일때 기능을 바로 없애면 프로그램으로 만든 기능들이 다 동작하지 않을것이라 바로 없애진 못하고 없앨거라고 알려주는 것
		// 그리고 이걸 써라~~~ 해줄건데...
		// 암튼 줄이 그어지고 Deprecated가 뜨는 건 동작은 되지만 곧 없어질거라고 알려주는거라 쓸 수는 있음!
		Integer i2 = Integer.valueOf(500); // 이렇게 객체의 형태를 바꾸는 과정을 포장하는 과정이라고 해서 boxing이라고 한다
		int primitiveInt = i2.intValue(); // 다시 원시형 형태로 바꾸고 싶으면 unboxing으로 풀 수 있음
		
		System.out.println(primitiveInt);
		Integer auto = 100; // 자동으로 이루어져서 auto-boxing이라고 부른다
		int un = auto; // 오토라는 레퍼런스 인스턴스에 객체라는 형태로 담겨있던 걸 자동으로 풀어내는 반대 과정도 가능하다
		
		Integer value = Integer.valueOf("5959"); // 문자열 형태로 되어있는 표현을 숫자부분만 잘라내서 문자로 수정해서 담아내준다
		int result = Integer.valueOf("1234"); // 자동 오토 박싱이 일어날거니까 인트형으로도 밸류를 써도 인트값이 담길 것
				
		Integer.parseInt("90");
	}

}
