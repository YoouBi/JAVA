import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("banana");

		System.out.println(set.size());
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next()); // Set이라는 녀석은 인덱스가 없으니까 삽입된 순서를 전혀 신경쓰지 않는다
		} // 그러니까 순서대로 관리하는데에는 전혀 신경을 쓰지 않고 중복이라는 것에만 집중
		
		// 원소가 있냐없냐(contains) 같은 걸 살펴보는 행동에 집중되어있다
		set.contains("banana");
		set.contains("donut");
	}
}