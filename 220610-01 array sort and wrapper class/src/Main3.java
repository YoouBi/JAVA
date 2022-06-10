public class Main3 {
	public static void main(String[] args) {
		// 둘 다 10이라는 값을 가진 걸 표현하고 싶었는데
		int number1 = 10;
		// number1는 원시형이라 .을 써도 불러올 수 있는게 없다
		Integer refNumber = Integer.valueOf(10); // 참조는 하나라서 상태를 나타내는 값도 하나만 넣어 박싱할 수 있다ㅠ
		// number1는 .을 쓰면 값을 반환해줄 수 있는 메소드들을 불러낼 수 있는 객체가 된다
		// 그래서 둘은 같은 값을 가졌지만 '행동'을 가질 수 있는 레퍼런스 타입을 다루고 싶다면 박싱을 해서 객체로 만드는 것이다
		
		// 우리가 number1의 대소를 비교하려면
		// int number2 = 20; 비교할 값을 만들고...
		// 그걸로 또 값 비교하는 연산자로 비교하고... 해야하지만
		// refNumber.compareTo(20); 으로 바로 알려줄 수 있다
		
		// 또한 아까 배운 list는 원시형 형태를 못쓴다
		
		// Integer 안엔 스태틱한 친구들도 많다 Integer.MAX_VALUE 는 최댓값을 찾아주는 칭구칭구 최솟값도 되고... sum도 있고...
		System.out.println(Integer.max(100, 500)); // 인퍼런스가? 가진게 아니라? 스태틱한거라
		// 한개만 박싱해서 어떻게 쓰지...? 하고 고민할 수 있겠지만 쓰는 메소드에 필요한 상태에 넣어줄 수 있다
	}
}