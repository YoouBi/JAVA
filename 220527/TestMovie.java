public class TestMovie {
	public static void main(String[] args) {
		// Movie m = new Movie(); // Movie(); 필드 초기화를 위해서 이렇게 적어둔 것 : 생성자
		// 생성자(constructor)
		// 지금 호출한 친구는 생성자 중 '기본 생성자'라는 이름을 갖는 생성자로서
		// 필드를 초기화 해주는데 기본 값으로 초기화를 한다
		// 기본 값은
		// 정수형 -> 0
		// 실수형 -> 0.0
		// 논리형 -> false
		// 참조형 -> null
		// 그래서 아무 값도 안적고 컴파일을 할 시 null과 0이 나오는 것
		
		// 호출할 때 이렇게 써줄 수 있음
		Movie m = new Movie(
						"새영화"
						, 7.5
						, "새감독"
						, 2022
						, "영화");
						// 파라미터의 타입과 순서, 갯수를 꼭 확인!
		System.out.println(m.title);
		System.out.println(m.grade);
		System.out.println(m.nyeondo);
		// m.printAll();
		
		// Movie m = new Movie();
		// m.title = "범죄도시2";
		// m.score = 9.5;
		// m.director = "이상용";
		// m.publishYear = 2022;
		
		// m.printAll();
		
		// Movie m2 = new Movie();
		// m.title = "위대한 개츠비";
		// m.score = 9.2;
		// m.director = "배즈 루어먼";
		// m.publishYear = 2013;
		
		// m2.printAll();
	}
}