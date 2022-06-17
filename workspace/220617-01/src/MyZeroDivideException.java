import java.time.LocalTime;

// public class MyZeroDivideException extends Exception {
public class MyZeroDivideException extends RuntimeException { // 실행 때 강요하지 않도록 RuntimeException을 많이 씀
	public MyZeroDivideException(String message) {
		super(message + ", " + LocalTime.now() + "에 발생하였음");
	}
}
