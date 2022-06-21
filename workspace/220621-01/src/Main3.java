import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>(); // LinkedList는 List의 특징과 queue(얘도 인터페이스)의 특징을 구현한(임플리먼트...) 구현체
		// 큐라는 행동에 집중해서 LinkedList를 쓰겠다고 명확하게 써둔 것(선언)
		// 그냥 링크드리스트에서 쓰는거나 큐에서 쓰는거나 똑같이 구현되어 있는 행동인데 우리가 추상적으로 어떻게 더 집중해서 다룰 것이냐임
		// 링크드리스트의 동작은 많아서 찾기 어렵지만 큐는 큐의 동작만 딱 뜰꺼니까 목적에 맞춰서...
		// Queue에서 Examine는 원소를 지우지 않고 제일 앞에 오는 것을 뜻함
		
		queue.add("원소1"); // 추가
		queue.offer("원소2"); // queue에만 있는 offer 동작은 add와 똑같지만 아주 미세한 차이가 있는 추상메소드
		
		System.out.println(queue);
		
		// 둘 다 언제나 앞에 있는 원소를 꺼내줄 것(참조를 반환)
		String elem1 = queue.poll(); // 얘는 원소가 없으면 널을 반환하고
		String elem2 = queue.remove(); // 얘는 원소가 없으면 예외를 발생시킴
		
		System.out.println(elem1);
		System.out.println(elem2);
		
		System.out.println(queue.size());
	}
}

