// 컵 사이즈 알려주기
// 사용자의 정수를 입력받아서
// 200이상이면 large, 100~200미만이면 medium, 100미만이면 small

public class TestElseIf {
	public static void main(String[] args) {
		int cup = 75;
		
		String size;
		if (cup > 200) {
			size = "large"; // 까지만 있으면 될 수도 있고 안될수도 있기 때문에 안된걸로 생각해서 컴파일 오류가 난다
		} else if (cup >= 100) { // 이미 위에서 걸러지기 때문에 && cup < 200
			size = "medium";
		} else { // 여기까지 왔으면 무조건 100 미만이기 때문에 cup < 100 안씀
			size = "small";
		}
		
		/*
		if (조건식) {

		} else if (다른 조건식) { 

		} else if (다른 조건식) { 
		
		} ... {
		
		} else { 필요없다면 else절은 안써도 됨
		
		} */
		
		System.out.println(size);
	}
}