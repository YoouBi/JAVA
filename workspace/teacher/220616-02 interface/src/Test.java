class MyClass {
	public static int num;
	
	public int fields = 10000;
	
	static {
		System.out.println("테스트테스트");
		MyClass2.hello();
	}
}

class MyClass2  {
	static void hello() {
		System.out.println(MyClass.num);
		System.out.println(new MyClass().fields);
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println("시작~~~~~~~~");
		MyClass2.hello();
	}
}
