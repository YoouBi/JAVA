public class CarTest {
	public static void main(String[] args) {
//		Car.numberOfCars // 외부의 클래스에서는 정적 변수라 할지라도 프라이빗하면 볼 수 없음
		
		
		int n = Car.getNumberOfCars(); // 정적 메소드 호출
		System.out.println("지금까지 생성된 자동차 수 = " + n);
		
		Car c1 = new Car("blue", 100, 1); // 첫 번째 생성자 호출
//		c1.printStaticNumber();
		Car c2 = new Car("white", 0, 1); // 두 번째 생성자 호출
		
		n = Car.getNumberOfCars(); // 정적 메소드 호출
		System.out.println("지금까지 생성된 자동차 수 = " + n);
	}
}