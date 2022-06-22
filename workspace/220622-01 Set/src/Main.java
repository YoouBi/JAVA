import java.util.HashSet;
import java.util.Iterator;

// set 중복에만 집중
public class Main {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("qwer"); 
		set.add(Integer.valueOf(10));
		set.add("qwer"); // set은 add를 할 때 자기가 가진 원소 중 중복되는 것이 있다면 걸러내고 추가를 하지 않는다
		
		// 추가 될수도 있고 아닐수도 있는 가능성이 있음 그래서 불연값으로 확인할수도 있음
		boolean b1 = set.add("qwer");
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("qwer");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(set.size());
		
		System.out.println(set.toString());
		
//		set.get(0); // set은 list와 다르게 원소들의 인덱스라는걸 가지고있지 않고 그래서 get이라는 행동(메소드) 자체가 없다
//		for (int i = 0; i < set.size(); i++) {
//			set.get(i);
//		} // 이런 get으로 인덱스 값들을 하나하나 확인하는 방법은 안되고
		// for-each문으로 하나하나 프린트하는 방법,
		for (Object o : set) {
			System.out.println(o);
		}
		
		// Iterator로 순차적으로 프린트하는 방법이 있다
		Iterator<Object> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
