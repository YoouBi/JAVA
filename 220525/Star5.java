/* 5번 문제
*********
 *******
  *****
   ***
    *
*/

public class Star5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("　");
			}
			for (int j = 9; j >= i * 2 - 1; j--) {
				System.out.print("★");
			}
			/* for (int j = 5; j >= i; j--) {
				System.out.print("★");
			}
			for (int j = 5; j >= i; j--) {
				if (j != 5) {
					System.out.print("★");
				}
			} */
			System.out.print("\n");
		}
	}
}