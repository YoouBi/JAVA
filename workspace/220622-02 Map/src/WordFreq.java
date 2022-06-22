import java.util.HashMap;
import java.util.Map;

public class WordFreq {
	public static void main(String[] args) {
		String line = "Hello. I'm a java developer";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
//		char[] lineChar = new char[line.length()];
//	
//		for (int i = 0; i < line.length(); i++) {
//			lineChar[i] = line.charAt(i);
//		}
//		
//		for (char a : lineChar) {
//			Integer freq = map.get(a);
//			map.put(a, (freq == null) ? 1 : freq + 1);
//		}
		
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (!map.containsKey(c)) { // key에 문자 c가 없을땐
				map.put(c, 1); // 문자 c에 대한 갯수, 즉 value 값을 1로 하고
			} else { // 이미 있다면
				map.put(c, map.get(c) + 1); // 원래 있던 값에 +1을 해서 집어넣겠다
			}
		}
		
		System.out.println(map);
		
//		Map<String, Integer> m = new HashMap<>();
//		
//		String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem" };
//		// 문자열에 포함된 단어의 빈도를 계산한다.
//		for (String a : sample) {
//			Integer freq = m.get(a);
//			m.put(a, (freq == null) ? 1 : freq + 1); // 단어 하나하나씩 그전에 없어서 null 값이면 1을 넣겠다, 있으면 이미 있는 빈도에 + 1을 하겠다
//		}
//		
//		System.out.println(m.size() + "단어가 있습니다.");
//		System.out.println(m.containsKey("to"));
//		System.out.println(m.isEmpty());
//		System.out.println(m);
	}
}