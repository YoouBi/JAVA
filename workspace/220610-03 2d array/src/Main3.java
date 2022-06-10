import java.util.Arrays;
import java.util.Random;

// 각 행의 합
// 각 열의 합
// 숫자 7의 개수

public class Main3 {
	public static int[][] randomArray() {
		Random random = new Random();
		int[][] array = new int[5][5];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);
			}
		}
		return array;
	}
	
	public static void print2D(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(Arrays.toString(array[i]));
			System.out.println("\t" + sum(array[i]));
		}
		for (int i = 0; i < array[0].length; i++) {
			System.out.print(sum(col(array, i)) + " ");
		}
		System.out.println("\t7의 개수: " + count(array, 7));
	}
	
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static int[] col(int[][] array, int col) {
		int[] columnArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			columnArray[i] = array[i][col];
		}
		return columnArray;
	}
	
	public static int count(int[][] array, int target) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == target) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[][] randomArray = randomArray();
		int count = 0;

//		System.out.println(Arrays.deepToString(randomArray));
		print2D(randomArray);
		
		System.out.println("-----------------------------");

		for (int i = 0; i < randomArray.length; i++) {
			int k = 0;
			int l = 0;
			for (int j = 0; j < randomArray[i].length; j++) {
				k += randomArray[i][j];
				l += randomArray[j][i];
			}
			System.out.println((i + 1) + "행의 합은 : " + k + "\t" + (i + 1) + "열의 합은 : " + l);
		}

		System.out.println("-----------------------------");

		for (int i = 0; i < randomArray.length; i++) {
			for (int j = 0; j < randomArray.length; j++) {
				if (randomArray[i][j] == 7) count++;
			}
		}
		System.out.println("이 이차배열의 안에서 7의 개수는 " + count + "개이다.");
		
//		System.out.println(sum(randomArray[0]));
		System.out.println(sum(col(randomArray, 0))); // 이게 열로 더한 합이네...????
	}
}