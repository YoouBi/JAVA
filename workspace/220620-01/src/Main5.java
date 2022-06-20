import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		// 편하게 만들고 싶어... 생성자에 다른 리스트를 그대로 넣으면 그대로 생성하는 리스트를 만들 수 있다
//		List<Integer> tens = new ArrayList<>();
//		tens.add(10);
//		tens.add(20);
//		tens.add(30);
//		tens.add(40);
//		List<Integer> list = new ArrayList(tens);
//		근데 이건 일일이 쓰기 귀찮으니까...
//		
//		System.out.println(list);
		List<Integer> list = new ArrayList(Arrays.asList(10, 20, 30, 40, 50)); // 스태틱한 메소드
		// 생성자에 던져줌으로써 원하는 원소값을 가진 리스트를 생성해서 쓸 수 있더라
		// 여기서 의문점 이미 리스트인데 왜 리스트를 던져주지?
		// Arrays로 만든 리스트는 원소 추가나 삭제가 안돼서 이 형태로 '변경없이(변경 불가)' 그대로 쓰겠다면 괜찮은데
		// 원소를 추가하거나 삭제하려면 변경 가능하게 리스트를 던져주는 형태로 써야한다
//		List<Integer> test = Arrays.asList(10, 20, 30, 40, 50);
//		test.add(60);
		
		System.out.println(list);
		
		list.addAll(Arrays.asList(60, 70, 80)); // 리스트를 던져주면 리스트로 추가해야 한다
		System.out.println(list);
		
		list.removeAll(Arrays.asList(30, 40, 50)); // 지우고자 하는 원소를 똑같이 가진 리스트로 removeAll 삭제도 가능
		System.out.println(list);
		
		System.out.println(list.containsAll(Arrays.asList(10, 20))); // 다 있는지 물어봄 하나라도 없으면 false
		
		List<Integer> sub = list.subList(0, 3); // 이런식으로 인덱스 번호를 쓰면 해당 인덱스 번호 범위로 '새 리스트'를 만들어준다
		System.out.println(sub);
		System.out.println(list);
	}

}
