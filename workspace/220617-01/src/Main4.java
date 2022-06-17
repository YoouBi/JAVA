public class Main4 {
	public static void main(String[] args) {
		try {
			int left = 10;
			int right = 0;
			
			if (right == 0) {
				// 0으로 나누려고 함 (예외적인 상황)
				// 보고서 적어서 던질거임.
				throw new MyZeroDivideException("0으로 나눈 예외적인 상황이 발생했습니다~~~"); // 우리가 만든 이 예외 객체로 예외를 발생(던진다)시킬 것
				// 지금 쓰는 건 Exception으로 모든 예외가 걸리지만
				// 내가 쓸 예외를 새롭게 정의해놓는다면(MyZeroDivideException로 만듦!) 원래의 예외 방식처럼 똑같이 쓸 수 있지 않을까
			}
		} catch(MyZeroDivideException e) {
			System.out.println(e.getMessage()); // 우리가 직접 만든 예외 상황이 출력됨
		}
	}
}
