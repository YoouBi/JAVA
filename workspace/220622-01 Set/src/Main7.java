import java.util.Set;
import java.util.TreeSet;

public class Main7 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>(); // TreeSet은 대소 비교를 할 수 있는 원소를 집어넣으면 정렬된 순서처럼 원소들을 가짐
		set.add(50);
		set.add(17);
		set.add(2);
		set.add(50);
		set.add(22);
		set.add(17);
		set.add(30);
		
//			   50
//			  /  \
//			17	  30
//		   /
//		  2             트리처럼 생겼대서 TreeSet
		
		for (int i : set) {
			System.out.println(i);
		}
	}
}