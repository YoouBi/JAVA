import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("가", "나", "다", "다", "가", "라"));
		// 리스트에 중복된 원소들이 있을 때 중복된것들을 제거하고 오로지 자기자신만 있는 원소들만 있는 형태를 얻고싶다 -> set
		
		// 위의 ArrayList의 생성자에 바로 리스트를 집어넣는 방법처럼
		Set<String> set = new HashSet<>(list); // HashSet에 바로 리스트를 집어넣을수도 있는데 이때 중복된 애들을 지우고 독립적인 원소들을 가진다
		
		// 셋은 알아서 중복을 걸러줄꺼니까 리스트에 있는걸 셋에 집어넣기만 하면 됨
//		for (int i = 0; i < list.size(); i++) {
//			set.add(list.get(i));
//		}
		
		System.out.println(set);
	}
}
