import java.util.StringJoiner;

public class Main2 {
	public static void main(String[] args) {
//		"[1, 2, 3]" 이런 형식을 쓰려면 StringJoiner
		StringJoiner sj = new StringJoiner(",", "[", "]"); // 얘도 마찬가지로 문자열을 합쳐줄건데 뭘로 구분할거냐 는 ()안에 있는 걸로 구분
		// 배열 생성자처럼 시작과 끝에 뭘 붙여줄지도 정해줄 수 있음
		sj.add("1");
		sj.add("2");
		sj.add("3");
		
		String result = sj.toString();
		
		System.out.println(result); // 이건 명시적
		System.out.println(sj); // 우리가 다루고자 하는 객체가 문자열 형태라서 자동적으로 toString이 호출되기 때문에 이렇게 써도 출력이 된다
		System.out.println(sj.toString());
	}
}
