import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main5 {
	public static void main(String[] args) {
		// 중복되지 않는 1 ~ 45 사이의 정수 6개를 가지는 집합
		Random random = new Random();
		Set<Integer> set = new HashSet();
		
		// boolean 값으로 false값을 반환받으면 다시 굴리게 만드는 방법도 있다
		while (set.size() != 6) {
			set.add(random.nextInt(44) + 1);
		}
		
		System.out.println(set);
		
		List<Integer> list = new ArrayList<>(set);
		
//		Collections.sort(set); // 인덱스가 없어서 정렬 못함
		Collections.sort(list);
		
		System.out.println(list);
	}
}
