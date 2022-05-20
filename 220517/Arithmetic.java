// 두 수 44와 72의 + - * / 각각의 연산결과를 출력해보세요.

public class Arithmetic {
    public static void main(String args[]) {
        int x;
        int y;
        int sum;
        int minus;

        x = 44;
        y = 72;
        sum = x + y;
        minus = x - y;

        System.out.println("44 더하기 72는 " + sum);
        System.out.println("44 빼기 72는 " + minus);
        System.out.println("44 곱하기 72는 " + (x * y));
        System.out.println("72 나누기 44는 " + (y / x));
    }
}