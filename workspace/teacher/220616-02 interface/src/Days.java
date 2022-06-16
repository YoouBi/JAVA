public interface Days {
//	public static final int NUM = 10;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WENDSDAY = 3;
}

interface MyInterface {
	default void printHello() {
		System.out.println("Hello");
	}
	
	public static String hello() {
		return "Hello";
	}
	
	public static void myStaticMethod() {
		
	}
	
	static int sum(int a, int b) {
		return a + b;
	}
}