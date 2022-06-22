import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("둘리", 100); // 사람 이름이 중복되지 않는 유일한거다 라고 생각해서 각 한개로 key를 지정
		map.put("홍길동", 90);
		map.put("도우너", 150);
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "둘리"); // 각각의 사람은 고유한 번호를 가지고 있다고 생각해서 번호를 key로 지정
		map2.put(4, "홍길동"); // key는 짝을 이룰 때 하나만 있는 고유한 것으로 지정(set값으로 저장)
		map2.put(3, "도우너");
		
		System.out.println(map.toString());
		
		// 키가 고유하니까 짝꿍도 고유할거다 라고 해서
		Set<Entry<String, Integer>> entrySet = map.entrySet(); // entry는 짝꿍(키와 밸류를 한덩어리로 묶은 것 다른 언어에서는 보통 페어라고 부른다)을 말하는 객체
		for (Entry<String, Integer> e : entrySet) {
			System.out.println(e.getKey() + "=" + e.getValue());
		} // 전체 원소를 한덩어리 ~ 세덩어리(자바에서는 이 덩어리를 Entry라고 부름)까지 순환해서 볼려고
		
		// 하나의 짝꿍들을 '순환'하면서 보고 싶다...??? -> 다 보려면 key가 필요함
		Set<String> keySet = map.keySet(); // 중복된 값이 없는 key는 keySet으로 관리
		
		for (String key : keySet) { // Set이니까 for-each문도 된다
			System.out.println(key + "=" + map.get(key));
		}
		
//		Iterator<String> iter = keySet.iterator(); // set은 순환할 수 있으니까
//		while (iter.hasNext()) { // 한개씩 가져와서
//			String key = iter.next();
//			Integer value = map.get(key); // map에 key를 집어넣는 것 그럼 짝꿍을 이루는 밸류 값이 튀어나오더라
//			
//			System.out.println(key + "=" + value);
//		}
	}
}
