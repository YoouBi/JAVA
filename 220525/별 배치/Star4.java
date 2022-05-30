public class Star4 {
	public static void main(String[] args) {
		int input = 5;
		for (int i = input; i > 0 ; i--) {
			for (int j = 1; j < i ; j++) {
			System.out.print(" ");
			} 
			for (int j = input; j >= i ; j--) {
			System.out.print("*");
			}
			for (int j = input; j > i ; j--) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}