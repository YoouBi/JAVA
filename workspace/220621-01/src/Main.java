import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 자바도 리스트의 추가와 삭제에 관해서 구현해놓은 LinkedList라는 클래스가 있다
		List<String> list = new LinkedList<>(); // LinkedList도 리스트의 구현체니까 동작은 똑같다

		list.add("문자열1");
		list.add("문자열2");
		list.add("문자열3");
		list.add("문자열4");
		
		list.get(0); // 리스트니까 인덱스로 접근
		list.get(1);
		list.get(2);
		list.get(3);
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		
		for (String s : list) {
			System.out.println(s);
		}
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			iter.next();
		}
	}

}
