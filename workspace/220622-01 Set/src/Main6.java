import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main6 {
	public static void main(String[] args) {
		// Set이 순서가 없긴하지만 그래도 추가된 순서정도는 기억하는게 좋지 않을까? -> LinkedHashSet □-□-□
		Set<String> set = new LinkedHashSet<>();
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("apple");
		
		for (String s : set) {
			System.out.println(s); // 추가된 순서가 유지되고 있더라(현상)
		} // 그래도 Set이니까 인덱스는 없다! get도 안됨!
		
		Set<String> set2 = new HashSet<>(Arrays.asList("apple", "donut", "egg", "fanta"));
		
//		set.addAll(set2);
//		System.out.println(set); // LinkedHashSet에 집어넣은거기때문에 하나하나 추가된 순서를 가지고 있다
		
		set2.addAll(set); // 집어넣는 대상이 무엇이냐에 따라서 삽입되는 순서가 날아갈 수 있다
		System.out.println(set2); // HashSet는 순서를 신경 안쓰기때문에 섞여있다
	}
}
