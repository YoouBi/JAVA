import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		map.put("일", 1); // add가 아닌 put으로 집어넣는데 왼쪽은 key, 오른쪽이 value값이다
		map.put("이", 2);
		map.put("삼", 3);
		map.put("사", 4);
		
		System.out.println(map.size());
		
		System.out.println(map.get("이")); // get이라는 메소드가 있지만 int값이 아니라 key라는 객체의 값을 받는다
		System.out.println(map.get("삼"));
		System.out.println(map.get("오")); // 없는 key 값을 넣으면 null을 반환한다
		
		if (!map.containsKey("이")) { // 얘도 중복되는 값 검색하는 메소드가 있음
			map.put("이", 2222); // 없을 때만 집어넣어라
		}
		System.out.println(map.get("이")); // 중복되는 key값을 가질 수 없댔으니까 짝을 이루고 있던 밸류 객체가 새 값 참조로 변경됨
		// 중복을 미리 걸러서 막는게 아니라 덮어씌워버림
	}
}
