import java.util.Deque;
import java.util.LinkedList;

public class Main4 {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<>(); // stack을 쓸 때는 Deque로 쓴다
		stack.push("10"); // 디큐만의 특징인 아래부터 차곡차곡 쌓는 푸쉬가 있다
		stack.push("20");
		stack.push("30");
		
		System.out.println(stack.pop()); // 튀어나온다고 팝, 쌓여있던게 튀어나오는거니까 마지막에 들어간것부터 튀어오를 것
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		// 나는 이 링크드리스트를 Deque라는 목적으로만 쓰겠다! 라고 했는데
//		LinkedList<String> list = new LinkedList<>(); Deque도 쓸건데...리스트도 쓸거야...하면
		// 쓸 수 있는 메소드도 많아져서 엄청나게 복잡해지고 무엇을 주목적으로 쓰려는지도 헷갈릴것
	}
}
