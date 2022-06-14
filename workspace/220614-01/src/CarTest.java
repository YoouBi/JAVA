import java.util.Scanner;

class Car {
	private String model;

	public Car(String model) {
		this.model = model;
	}
	
	@Override // 실수하지 않으려면 쓰자!
	public boolean equals(Object obj) { // 객체 하나를 전달받아서 확인하면 되겠다! 하고 이런 헤더를...
		if (obj instanceof Car)
			return model.equals(((Car) obj).model);
		else
			return false;
	}
	
//	public boolean equals(Object obj) {
//		if (obj instanceof Car) {
//			Car otherCar = (Car) obj;
//			return model.equals(otherCar.model);
//		} else {
//			return false;
//		}
//	}
}

public class CarTest {
	public static void main(String[] args) {
		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		
//		System.out.println(firstCar == secondCar);
		firstCar.equals(new Scanner(System.in)); // 상향 형변환이 일어날 수 있으니까 new Scanner...?
		// 자동차가 생각하기엔 스캐너라는 애랑 나랑은 완벽하게 다른 형태를 띄고 있으니가 비교할 필요가 없다고 생각함
		// 그래서 형이 다르니까 연산의 결과로 false를 반환할 것
		System.out.println(firstCar.equals("HMW520")); // 문자열을 넣어도 자동차랑 다르니까...!
		
		if (firstCar.equals(secondCar)) {
			System.out.println("동일한 종류의 자동차입니다.");
		} else {
			System.out.println("동일한 종류의 자동차가 아닙니다. ");
		}
	}
}