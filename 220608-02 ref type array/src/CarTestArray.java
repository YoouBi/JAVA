public class CarTestArray {
	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];
		Car c = new Car();
		
		for (int i = 0; i < cars.length; i++) {
			cars[i] = c; // 같은 자동차에 대해서 값을 참조했으므로 10 10 10 10 10으로 더해져서 50이...나온건가?
		}
		for (Car car : cars) {		
			car.speedUp();
		}
		for (Car car : cars) {
			System.out.println(car);
		}
		
//		for (int i = 0; i < cars.length; i++) {
//			cars[i] = new Car();
//		}
//
//		for (int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i]);
//		}
	}
}