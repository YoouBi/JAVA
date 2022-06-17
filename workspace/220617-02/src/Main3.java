import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) {
		StringBuilder word = new StringBuilder();
		String longline = "apple banana carrot donut";

		String[] split = longline.split(" "); // 문자열 하나하나를 배열에 담아준 것
		System.out.println(split[2]);
		System.out.println("======================");
		
		StringTokenizer st = new StringTokenizer(longline, " "); // 왼쪽은 잘라내는 문자열, 오른쪽은 기준",./"처럼 여러개의 기준도 가능

//		st.hasMoreTokens();
//		String a = st.nextToken();
//		System.out.println(a);
		int i = 0;
		while (st.hasMoreTokens()) { // 있냐고 물어보고 가져오게
			i++;
			String result = st.nextToken();
			System.out.println(result.equals("carrot")); // 얘가 가져오는 건 문자열이라 이런것도 가능 이건 그냥 carrot단어 있는지 검색하는 것
			System.out.println("----------------------");
			System.out.println(result + " 뒤에 공란이 있는 단어 자른 문자열");
			if(i == 2) {
				System.out.println(st.nextToken() + " 인덱스 숫자로 몇번째 단어 꺼낼지 정하기");
			}
		}
//		System.out.println(st.nextToken()); 를 단어가 4개인데 5개 이상 가져오라고 막 반복하면 예외적인 상황이라고 오류가 뜸	
		
//		for (int i = 0; i < longline.length(); i++) {
//			if(longline.charAt(i) == ' ') {
//				for (int j = 0; j < i; j++) { // 라스트 인덱스 오브
//					word.append(longline.charAt(j));
//				}
//				
//			}
//			for (int j = word.lastIndexOf(" "); j < word.length(); j++) {
//				System.out.println(word.charAt(j));
//			}
//		}
	}
}