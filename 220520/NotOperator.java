public class NotOperator {
	public static void main(String[] args) {
		boolean t = true;
		
		t = !t; // true를 반대로 뒤집었으니 false 값이 되었다
		System.out.println(t);
		
		!((10 > 3) && (3 == 3)) // false
		!(!(10 > 3) || (3 == 3)) // false
	}
}