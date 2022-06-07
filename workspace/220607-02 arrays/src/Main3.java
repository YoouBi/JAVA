public class Main3 {
	public static void main(String[] args) {
		// 실수 1.02, 0.03, 4.0
		double d1 = 1.02;
		double d2 = 0.03;
		double d3 = 4.0;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		//
		double[] myArr = { 1.02, 0.03, 4.0 };
		
//		System.out.println(myArr); // 참조형 변수. 객체의 행동, 공통적인 특징이라서 원소값을 확인하고자하면 기본적으로는 순환을 통해서 접근을 해줘야한다
		
//		double[] myArr = new double[] { 1.02, 0.03, 4.0 }; // 길이값을 적으면 컴파일 에러가 나고 빼두면 알아서 길이값을 정해준다
		
//		double[] myArr = new double[3];
//		myArr[0] = 1.02;
//		myArr[1] = 0.03;
//		myArr[2] = 4.0;
		
		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
	}
}