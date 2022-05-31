public class Hello {
	public static void hello() {
		int a = 10;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
	}
	
	public static void main(String[] args) {
		int number = 10;
		System.out.println("Hello World!");
		System.out.println(number);
		hello();
		number++;
		System.out.println("Hello World!");
		System.out.println(number);
		number++;
		System.out.println("asdf");
		System.out.println(number);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
