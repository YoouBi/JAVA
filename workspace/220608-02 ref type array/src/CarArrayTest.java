public class CarArrayTest {	
	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];
		
		// for-each문으로 하려고 하면...null 값으로 나오는데
		// 참조를 가져오려고 하니까 null값이 나오는 것
		// c에 값을 넣은 것...뒷말 까먹음...ㅠㅠㅠㅠ(220608에 캡쳐한 그림 참조)
		// 우리가 원하는 배열에 대해서 원소값을 초기화하는건 힘들다 다만, (1)
//		for (Car c : cars) {
//			c = new Car();
//		}
		
//		for (Car c : cars) { // 참조하고 있는 값을 바꾼 것이 아니라 '참조하고 있는 대상'을 바꾼 것이라 (출력값은...? 아니면 진짜로?)된다
			
			// for-each문에 가져온 변수에
			// c = <<?? ~는 은 내 의도와 다를 수 있다
			// 참조하고 있는 값을 디버깅, 혹은 콘솔창에 출력을 해보는 것으로 한번 비교해보자
			
//			car.speedUp();
//			근데
//			c = null;와
//			c.color = "asdf";는  다르다
//		}
		
		for (int i = 0; i < cars.length; i++)
			cars[i] = new Car();
		
		for (int i = 0; i < cars.length; i++)
			cars[i].speedUp(); // 이게 없으면 속도는 0으로 나옴
//		
//		for (int i = 0; i < cars.length; i++)
//			System.out.println(cars[i]);
		
		for (Car c : cars) {
			System.out.println(c);
		} // (1) 처럼 값을 순차적으로 확인하는 것에 대해선 for-each문이 best, 오히려 좋다
		
//			System.out.println(cars[i].toString()); 호출 생략해도 나온다...! 심지어 @3432871 막 이런 모양도 아니다!
		// 객체의 기본 행동 중 하나로 객체를 문자열로 다루고자할 때, toString()이라는 메소드가 자동적으로 호출이 되는데
		// toString() 메소드로 "속도:기어:색상:" 형태로 반환되도록 만들어두었기 때문에 값 반환 가능
	}
}