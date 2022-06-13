public class Test {
	public static void main(String[] args) {
		Book b = new Book("자바", 500, "으웡");
		Magazine m = new Magazine("으아", 600, "으아아", 20220613);
		
		System.out.println(b.toString());
		System.out.println(m.toString());
	}
}