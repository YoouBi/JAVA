import java.util.Arrays;

public class Main4 {
	// 두 개 정수 배열을 전달받아 결합시켜 반환하는 메소드
	// 예) [1, 2, 3] [10, 11, 12, 13, 14]
	// [1, 2, 3, 10, 11, 12, 13, 14]
	
	// 두 개 정수 배열의 합을 가지는 배열을 반환하는 메소드
	// 예) [1, 2, 3] [10, 11, 12, 13, 14]
	// [11, 13, 15, 13, 14]
	
	public static int[] sum(int[] left, int[] right) {
		int[] sum = new int[left.length + right.length];
		int j = 0;
		for (int i = 0; i < sum.length; i++) {
			if (i < left.length) sum[i] = left[i];
			else {
				sum[i] = right[j];
				j++;
			}
		}
		return sum;
	}
	
	/* 쌤꺼...
	public static int[] concatArray(int[] left, int[] right) {
		int[] newArray = copy(left, right.length);
		
		for (int i = left.length; i < newArray.length; i++) {
			newArray[i] = right[i - left.length];
		}
		return newArray;
	} */
	
	public static int[] sum2(int[] left, int[] right) {
		int[] sum2 = new int[left.length > right.length ? left.length : right.length];
		for (int i = 0; i < sum2.length; i++) {
			if () { //?
				sum2[i] += left[i] + right[i];
			} else if (left.length > right.length) {
				sum2[i] += right[i];
			} else if (left.length < right.length) {
				sum2[i] += left[i];
			}
		}
		return sum2;
	}
	
	/* 쌤이 한거...
	public static int[] sumArray(int[] left, int[] right) {
		if (left.length > right.length) {
			int[] copy = copy(left, 0);
			for (int i = 0; i < right.length; i++) {
				copy[i] += right[i];
			}
			return copy;
		} else {
			int[] copy = copy(right, 0);
			for (int i = 0; i < left.length; i++) {
				copy[i] += left[i];
			}
			return copy;
		}
	} */
	
	/* 쌤 두번째꺼...
	public static int[] sumArray(int[] left, int[] right) {
		int[] copy;
		int[] = target;
		
//		copy = left.length > right.length ? copy(left, 0) : copy(right, 0);
		
		if (left.length > right.length) {
			copy = copy(left, 0);
			target = right;
		} else {
			copy = copy(right, 0);
			target = left;
		}
		
		for (int i = 0; i < target.length; i++) {
			copy[i] += target[i];
		}
		
		return copy;
	} */
	
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		int[] a = { 1, 2, 3 };
		int[] b = { 10, 11, 12, 13, 14 };
		
		int[] larger = new int[arr.length + 2];
		for (int i = 0; i < arr.length; i++) {
			larger[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(larger));
		
		int[] ab = sum(a, b);
		int[] abPlus = sum2(a, b);
		System.out.println(Arrays.toString(ab));
		System.out.println(Arrays.toString(abPlus));
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
	}
}