import java.util.List; // 얘도 util 패키지
import java.util.ArrayList; // 얘도 util 패키지
import java.util.Iterator; // 얘도 util 패키지

public class Main4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// 지금 왜 List<String> list = 형으로 쓰느냐
		// 추상적인 개념으로 가두려고 List라는 친구가 모든 List의 특징을 가지고 있으니까
		// ArrayList<String> list = new ArrayList<>();도 똑같이 쓸 수 있는데
		// List 인터페이스 형으로도 쓸 수 있으니까 지금 그냥 수업에서 써보는 것...
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		
		// 원소 '1개만! 지우는거면!' 이렇게 해도 됨
//		System.out.println(list.contains(new String("banana"))); // equals로 비교를 하고 있었다...
//		list.remove("banana");
//		
//		System.out.println(list); // remove로 객체를 던져주면 찾아서 지워주는데 동등함(equals)을 비교하고 같을 때 지워주더라
		
		// 위의 리스트에서 5글자 문자열만 찾아서 지우기
		// 이런건 전통적인 for문으로 찾아서 하기 힘들다...
		// 그래서 for-each문으로 하면 될까?
//		for (String s : list) {
//			if (s.length() == 5) {
//				list.remove(s);
//			}
//		}
//		System.out.println(list);
		// 포 이치 문은 변경하는 작업은 하지 않는게 좋다고 했었음. 그래서 이런 작업 안돼...
		
		// 리스트는 iterable(인터페이스로써 뜻은 열거 가능한, 반복 가능한)이라는 특징을 가지고 있는데 (상속)
		list.iterator(); // 원소 하나하나를 볼 수 있게끔 도와주는 친구
		// 반환 타입을 보면 iterator로 하나하나의 원소가 문자열로 되어있음
		Iterator<String> iterator = list.iterator(); // iterator 특징은 다음껄 가져오라고 하면 다음껄 가져온다
		while (iterator.hasNext()) { // 다음꺼 있으면 가져와라
//			System.out.println(iterator.next()); // 근데 얘도 반복해서 가져오라고 하면 없는데도 가져오려고 함
			String str = iterator.next();
			if (str.length() == 5) {
				iterator.remove(); // 또 어떤 기능이 있냐면 현재 가지고 온 객체를 컬렉션 객체에서 '삭제' 해줄 수 있음
				// iterator를 지운것처럼 느껴지지만 'iterator보고 지워달라!'고 한 것
				// 넥스트를 호출하면 다음껄 가르킴(220620.png 보기!)
				// 그래서 가르키고 있는 참조하고 있는걸 지워라! 하는거
			} // 인덱스 012같은건 신경쓰지 않고 모든 원소 중 내가 원하는 원소가 있냐 없냐만 신경써서 없앴음
		} // 순환하며 삭제를 하려면 iterator가 필수!
		// Iterator라는 건 리스트의 원소를 하나씩 꺼내오는 '객체'이기 때문에 참조하기 위해서 이름을 붙여(Iterator<String> iterator) 쓰는 것
	}
}
