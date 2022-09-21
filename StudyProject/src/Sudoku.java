import java.util.ArrayList;
import java.util.Random;

public class Sudoku {
	public static void main(String[] args) {
		Random random = new Random();
		int startnum = random.nextInt(9) + 1;
		int startrow = random.nextInt(9);
		int startcalum = random.nextInt(9);
		
		int[][] Allarr = new int[9][9];
		Allarr[startrow][startcalum] = startnum;
		
		ArrayList<String> startnine;
		
		// 일단 같은 행렬은 다 빼고 그 다음에 같은 3*3 칸을 빼야할 것 같은데...아니면 반대로??
		if(startrow/3 == 1) {
//			startnine
		} else(startrow/3 == 2) {
			
		}
		
		System.out.print(startnum);
		
		for (int i = 1; i <= 81; i++) {
			if(i == 1) {
				System.out.print("");
			} else {
				System.out.print("□");
				if(i % 3 == 0) {
					if(i % 9 == 0) {
						System.out.println("");
					} else {
						System.out.print("│");
					}					
				}
				
				if(i % 27 == 0 && i != 81) {
					System.out.println("───┼───┼───");
				}
			}
		}
	}
}
