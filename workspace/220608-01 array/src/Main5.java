import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		
		Arrays.fill(arr, 100);
		
		System.out.println(Arrays.toString(arr));
		
//		int[] temp = { 40, 50 ,60 };
//		
//		int[] another = Arrays.copyOfRange(temp, 0, temp.length);
//		// temp의 복사본을 0번째에서 temp.length만큼 복사하겠다
//		System.out.println(Arrays.toString(another));
		
		
//		int[] copy = Arrays.copyOf(arr, arr.length);
//		int[] arr2 = arr;
//		
//		System.out.println(Arrays.toString(copy));
//		System.out.println(Arrays.equals(arr, copy)); // null 확인까지 같이 될 것이다
//		System.out.println(Arrays.equals(arr, arr2));
	}
}