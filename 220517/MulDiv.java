public class MulDiv {
    public static void main(String args[]) {
        // System.out.println("ABC" / 5); 정수의 합연산은 되지만 -*/는 수행할 수 없다고 컴파일러가 번역 자체를 안해준다(문법 자체가 어긋나기 때문에)
        System.out.println(50 / 0); // 컴파일은 되었지만 실행 중에 에러가 난 예외적인 상황에서 프로그램 진행을 하지 못하고 비정상적 종료가 일어남

        System.out.println("10 곱하기 5는 " + (10 * 5)); // 연산자의 순서 때문에 곱하기가 먼저 수행되고 + 가 된다
        System.out.println("22 나누기 4는 " + (22 / 4));
        System.out.println("22 나누기 4는 " + (22.0 / 4.0)); // 소수점 결과값까지 보고 싶다면 나누는 계산식의 정수도 소수점까지(실수로) 적어준다

        System.out.println("프로그램 정상 종료");
    }
}