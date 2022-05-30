public class TestDog {
	public static void main(String[] args) {
		Dog d = new Dog("까망이", "포메라니안", 3);
		d.print();
		System.out.println();
		
		Dog d2 = new Dog("하양이", "파트라슈");
		d2.print();
		System.out.println();
		
		d.setName("멍뭉이");
		d.print();
	}
}