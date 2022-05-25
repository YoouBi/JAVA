// (1) (2) (3) (4) (5)
// (5) (4) (3) (2) (1)
// (1) (2) (3) (4) (5)
// (5) (4) (3) (2) (1)
// (1) (2) (3) (4) (5)

public class PrintNumbers {
	public static void main(String[] args) {
		/* for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= 5; j++) {
					System.out.print("(" + j + ") ");
				}
			} else {
				for (int j = 5; j >= 1; j--) {
					System.out.print("(" + j + ") ");
				}
			}
			System.out.println();
		} */
		
		for (int i = 1; i <=5; i++) {
			switch (i) {
				case 1:		case 3:		case 5:
				for (int j = 1; j <=5; j++) {
					System.out.printf("(%d) ", j);
				}
				System.out.println();
				case 2:		case 4:
				for (int j = 1; j <=5; j++) {
					System.out.printf("(%d) ", j);
				}
			}
		}
	}
}