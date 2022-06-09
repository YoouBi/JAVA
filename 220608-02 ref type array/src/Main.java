public class Main {
	public static void main(String[] args) {
//		String str1 = "ABC";
//		String str2 = "DEF";
//		String str3 = "GHI";
		
		String[] arr = new String[3]; // 타입만 원시형에서 참조형으로 바뀌었을 뿐 크게 다를게 없다
		// arr도 참조형으로 가르키고 있는건 문자열 배열일거고
		// 각각의 칸에서도 "ABC" "DEF" "GHI" 값이 들어간게 아니라 참조를 하고 있을것이다
		// 그래서 초기화할 때 값 지정을 해주지 않으면 null 값이 들어갈 것
		arr[0] = "ABC";
		arr[1] = "DEF";
		arr[2] = "GHI";
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}