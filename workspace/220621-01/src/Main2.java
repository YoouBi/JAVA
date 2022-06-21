import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
		
		list.remove(0); // 구현 방법이 다를 뿐 헤더부분이 똑같음
		// 그럼 구현체가 두개나있는데 뭘 써야하나?
		// LinkedList는 추가 삭제가 주목적, 자주 사용할 때
		// 내부적으로 원소들이 좌우로 왔다갔다 할 필요없이 줄만 끊을 뿐이기 때문에 많은 작업이 필요하지 않다
		// ArrayList는 모든 원소들이 순환을 할 때 줄을 하나하나 따라갈 필요가 없으니까 모든 원소에 빨리빨리 접근할 때
		
		list.remove("c");
	}
}
