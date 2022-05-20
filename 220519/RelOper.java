// 관계연산자 뭔갈 물어보고 그걸 불연값으로 들을 수 있는

public class RelOper {
	public static void main(String[] args) {
		System.out.println(55 == 55); // 이퀄이라 대입연산자가 아니라 양 옆이 같냐고 물어본 것
		System.out.println(55 != 55); // !는 부정을 뜻하기 때문에 다르냐고 물어본 것
		System.out.println(55 > 55); // 왼쪽의 값이 더 크냐고 물어본 것(초과)
		System.out.println(55 < 55); // 왼쪽의 값이 더 작냐고 물어본 것(미만)
		System.out.println(55 >= 55); // 왼쪽의 값이 오른쪽보다 크거나 같냐고 물어본 것(이상)
		System.out.println(55 <= 55); // 왼쪽의 값이 오른쪽보다 작거나 같냐고 물어본 것(이하)
	}
}