import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// 배열은 고정적인 길이값을 가지고 있어서 그때그때 길이값을 조정하기 힘들기 때문에
		// 자바에서는 비슷한 구조를 가지지만 사용하기 편한 형태로 클래스를 하나 제공해주는데, ArrayList라고 하는 클래스이다
		ArrayList list = new ArrayList(); // 배열처럼 여러개의 자료들을 가지고 있을 수 있는 하나의 객체
		list.add("문자열 객체"); // 길이값을 정해주지 않는다 리스트에 추가만 하면 된다
		list.add(new Object()); // ArrayList라는 객체는 .add로 '객체를 추가'할 수 있다
		list.add(Integer.valueOf(100)); // 기본형 타입의 value을 집어넣을 수 없다. 오로지 객체만 다룸
		list.add(Double.valueOf(55.55));
		
		// 그럼 아래의 원시형들은 왜 가능하냐???
		list.add(500); // 이 친구는 인트 정수형 타입인데 객체로 사용하고 싶다면 Integer타입에 맞게끔 포장을 해줘야하는데 오토박싱이 일어나면서 객체가 담긴 것
		list.add(123.123); // auto-boxing 123.123라는 Double 인스턴스가 만들어져서 그걸 '참조'
		
		int size = list.size(); // 안에 있는 원소들을 배열로서 관리하는데 이 배열의 length를 capacity라고 부르는데 알아서 정해준다
		// 이 capacity는 기본 10개정도의 배열이 정해져있는데 모자라면 배열을 크게 만들고 작으면 줄여줌
		// 내부의 쾌적화를 위해 capacity의 크기는 미리 정해줄 수도 있지만
		// ex) ArrayList list = new ArrayList(65); 처럼
		// 사이즈는 언제나 동적이니까 미리 정해줄 수 없다
		System.out.println(size); // 몇개가 담겼는지 보니까, 6개가 들어가있다. 근데 우리가 지정해준게 아니라 집어넣으니까 자동으로 칸이 생긴 것
		// 그리고 삽입된 애들한테는 자동으로 인덱스 번호가 생긴다(배열처럼 칸, 사이즈가 '동적으로' 생김)
		
		// 인덱스 번호가 생겼으니 인덱스 번호로 가져올 수도 있다
		System.out.println(list.get(0)); // 얘는 get으로 가져옴
		System.out.println(list.get(2)); // 해당 인덱스 번호에 있는 객체 '''''참조'''''를 반환해준다
		System.out.println(list.get(3)); // int형 배열처럼
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // 이렇게 배열처럼 쓸 수 있어서 이름도 ArrayList
		}
		
		for (int i = list.size(); i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		for (Object o : list) { // for-each문도 쓸 수 있음
			System.out.println(o);
		}
	}
}