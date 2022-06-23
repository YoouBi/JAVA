import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>(); // 정렬 기준이 따로 있다면 컴페레이터를? 하나 따로 던져주면 된다...???
		map.put("hello", 1);
		map.put("world", 2);
		map.put("abc", 123);
		
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("hello", 1);
		treeMap.put("world", 2);
		treeMap.put("abc", 123);
		
		System.out.println(map);
		System.out.println(treeMap);
	}
}