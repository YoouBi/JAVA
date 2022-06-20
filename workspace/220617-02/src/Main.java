public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("원본"); // 생성자로 빈 칸도 되고 문자열을 등록하고 시작할 수도 있다
		// 자바에서 자체적으로 같은 인스턴스 참조가 가능한 StringBuilder를 만들어뒀다
		// StringBuilder 는 조작이 가능하니까 캐릭터의 배열
		// 칸 수가 모자라면 늘릴 것
		sb.append(",One="); // 오른쪽에 붙음
		sb.append(1);
		sb.append(",DoubleValue=");
		sb.append(255.0);
//		sb.append(",One=")
//			.append(1)
//			.append(",DoubleValue=")
//			.append(255.0); // 식으로 자기 자신의 참조를 리턴, '반환'한다
		// 그래서 원본 sb은 '불변'이라고?????????
		
//		sb. // 문자열처럼 인덱스를 알아본다던지 인덱스에 따른 캐릭터를 알아본다던지 값에 대한 변경이(지우고, 잘라내고, 사이에 추가 등) 가능하다
		sb.reverse();
		
		sb.setCharAt(0, 'Q'); // 인덱스 번호와 무슨 문자로 바꿀 것인지
//		sb.replace();
		sb.insert(1, "시작"); // 추가
		
		String result = sb.toString();
		System.out.println(result);
		
//		String str = "원본 문자열";
//		String other = "다른 문자열";
//		String origin = "원본 문자열";
		
//		String concat = str + other; // 문자열 합 연산을 하면 어쩔 수 없이 새 인스턴스를 생성할 수 밖에 없다. 공간의 비효율적 사용
//		System.out.println(concat);
//		System.out.println("원본 문자열다른 문자열" == concat); // 참조가 다르다 -> 현재 같은 값을 가진 문자열 인스턴스가 2개
		
//		System.out.println(str == origin); // 자바에서 문자열은 공간을 먹기 때문에 최대한 같은 참조를 하려고 한다
		
		
		///////////////////////////////////////////////////////
		
		
		StringBuffer sbuffer;// 똑같이 문자열 조작이 가능하지만 왜 나누었나??
		// 자바는 멀티 스레드(동작 흐름)를 조작 가능한 언어인데
		// 지금 흐름이 1개인데 멀티 스레드는 여러개의 흐름
		// 여러개의 흐름들이 스트링버퍼라는 애한테 접근해서 서로 조작하고 읽으려고 할 때 문제가 생기지 않게 안전하게 만들었다
		// StringBuilder는 그런 작업이 안들어가있는데 왜 쓰나?? 그런 작업이 없는만큼 조금 빠르다
	}
}
