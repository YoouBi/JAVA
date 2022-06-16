abstract class Car {
	public abstract void upWindow();
}

class ButtonCar {
	public void upWindow() {
		System.out.println("창문을 버튼을 눌러 올림");
	}
}

class HandleCar {
	public void upWindow() {
		System.out.println("손잡이로 올림");
	}
}

public class Main {
	public static void main(String[] args) {
//		System.out.println(Days.NUM);
//		Days.num = 100;
		MyInterface.hello();
	}
}