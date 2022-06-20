import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); // <generic>으로 담길 형에 대해서 정해줄 수 있음
		// 얘가 가지고 있는 모든 원소들은 원시형 타입이 아니고 객체이기 때문에 int 형으로 쓸 수는 없다

		// String, Object도 들어갈 수 있다
		list.add(10); // 앞이 대문자인 <Double>로 했을 때도 오류가 나는데, 오토박싱이 안 일어나서 그렇다
		list.add(20); // 안의 정수를 20.0 실수로 만들어두면 오토박싱이 일어난다
		list.add(30);
		list.add(40);
		
//		list.add("asdf"); // Integer형으로 지정해놨기 때문에 이젠 다른 형을 집어넣을 수 없다
		
		// ArrayList의 정수형들을 더하고 싶다
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
//			Object o = list.get(i); // 다운 캐스팅 하려던 흔적... 쌤 지우는게 너무 빠르세요... 안써도 뭐에서 뭘로 바뀌었는지 알고 싶어요...
//			if (o Integer) {
//				sum += list.get(i); // 오브젝트 타입의 참조(객체)라서 더할 수가 없음
//			}
			sum += list.get(i);
		}
		System.out.println(sum);
	}
}