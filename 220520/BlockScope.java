public class BlockScope {
	public static void main(String[] args) {
		int a = 10; // a는 지역 변수이고 중괄호 안에 있는, 그 범위 안에서만 쓸 수 있는 변수
		{
			System.out.println("가능한가?");
		}
		{{
			{
				int b = 20; // 지역 변수
				
				// int a = 99; 라고 쓰면 이미 a가 정의되어있기 때문에 컴파일 오류 남
				System.out.println("이건??");
				System.out.println(a);
				System.out.println(b);
				// 중괄호로 만든 걸 Block 블록이라고 하는데 이 범위를 제대로 짝을 맞춰 열고 닫기만 한다면 컴파일 된다
			}
			// System.out.println(b); 초기화 시킨 범위의 바깥에서 출력하면 컴파일 에러 남
			// 우리가 쓰는 모든 값들은 프로그램을 종료하면 다 사라짐
		}}
	}
}