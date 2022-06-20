import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 1));
//		List<String> list2 = new ArrayList<>(Arrays.asList("a", "b", "c"));
		
		// 정수니까 작은 정수가 앞에, 큰 정수가 뒤로 가도록 '정렬'을 해주고 싶다
		Collections.sort(list); // Collections라는 클래스가 있는데 얘는 파라미터로 리스트 한개를 받음
		System.out.println(list); // 오름차순 정렬로 출력됨
		
		int index = Collections.binarySearch(list, 8); // 리스트의 원소를 던져주면 인덱스의 번호를 알려준다
//		int index2 = Collections.binarySearch(list2, "a");

		System.out.println("8의 인덱스: " + index);
//		System.out.println("a의 인덱스: " + index2);
		
		Collections.reverse(list); // 역순으로 바꾸기
		System.out.println(list); // 내림차순으로 출력
		
		Collections.shuffle(list); // 순서 의미 없다! 섞어라!
		System.out.println(list);
		
		System.out.println(Collections.max(list)); // 최대값
		System.out.println(Collections.min(list)); // 최소값
		
		Collections.fill(list, 33); // 길이값은 그대로 유지하면서 안에 있는 원소값을 전부 다 변경
		System.out.println(list);
		
		Collections.replaceAll(list, 33, 77); // 특정한 원소값만 찾아서 변경
		System.out.println(list);
		
//		list.clear();
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70));
		Collections.copy(list, target); // 원본 리스트에 앞에서부터 (90, 80, 70)를 '뒤집어 쓰는 것'
		// 때문에 target의 원소 배열처럼 3칸이 있어야만 뒤집어 쓸 수 있고 최소한의 3칸이 없다면 컴파일 오류가 난다
		
		System.out.println(list);
	}
}
