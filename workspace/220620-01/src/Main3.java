import java.util.List;
import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // 왼쪽 선언할 때 타입을 선언했다면 우측에는 <>만 써줘도 됨
		// ArrayList는 자바의 컬렉션이라는 패키지 구성에 따라서 구성되어있는데 어레이리스트도 상속 구조로 만들어져있다
		// 리스트라는 특징을 가지고 있다고 해서 부모는 리스트라는 친구가 인터페이스로 있다
		// 그래서 우리는 이걸 리스트라는 형태(인터페이스여서 동작, 추상적)로도 다룰 수 있다
//		list. // 로 봤을 때 add와 get이 있다. '순서가 있는 인덱스'로 삽입과 반환(getter로 호출)이 가능
		
		// 위의 리스트에 10, 20, 30, 40
		for (int i = 1; i <= 4; i++) {
			list.add(i * 10);
		}
		
		// 모든 원소들을 출력해보세요
		System.out.println(list.toString()); // 원소값들을 문자열 형태로 보고싶으면 배열의 toString처럼 출력 가능
		list.set(1, 15); // 1번째 인덱스의 참조값을 15로 바꿈
		System.out.println(list);
		
		System.out.println(list.contains(20)); // 리스트에는 인덱스로 접근하는게 아니라 ...(중간 설명 못적음)
		// ()오브젝트 값으로서 원소값이 있는지 없는지 확일한 수 있는 메소드가 준비되어있는데
		System.out.println(list.indexOf(20)); // 없는 인덱스는 -1로 표현되니까 -1
		System.out.println(list.indexOf(30)); // 30은 2번째 인덱스에 있음
		
		list.remove(2); // 2번째 인덱스(int값) 제거하니까 우측에 있는 인덱스가 하나씩 줄어들더라
		System.out.println(list); // 결과값을 보면 자동으로 사이즈가 줄어든 것을 볼 수 있다
		
		list.add(0, 0); // 원하는 위치에 삽입도 가능
		System.out.println(list); // 원소가 앞에 끼어듦으로서 뒤의 인덱스가 1씩 증가, 밀려남
		
		list.clear(); // 리스트에 있는 원소들을 다 날려버리고 싶다
//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i); // 삭제할때는 논리적인 결과가 안나옴... 왜냐... 지워지면서 인덱스가 땡겨지니까 하나씩 남게 됨
//		}
		System.out.println("지운 결과 : " + list);
		System.out.println(list.size() == 0);
		System.out.println(list.isEmpty()); // 리스트가 다 지워졌는지 확인
	}
}