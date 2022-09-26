public class Add {
    public static void main(String args[]) {
        // 변수 이름
        // 영소문자로 시작 (대소문자를 구별 ex.abc, aBC 는 다른 이름)
        // 숫자도 올 수 있음 ex.abc123
        // 공백 x ex.title of book(x) bookTitle(o) 전치사도 잘 안적음
        // 특수문자 안됨. 굳이 써야한다면 - 혹은 _ 두개만 된다
        // 키워드는 쓰면 안됨 ex.int int는 안됨

        // int : 정수형 data type (자료형)
        int x; // 변수 선언 (variable declare)
        // int x; 같은 이름을 가진 변수 만들 수 없음
        int y;
        int sum;

        // 초기화 (initialize)
        x = 100; // 대입연산자 (assignment)
        y = 200;
        sum = x + y;

        System.out.println(sum);
        // System.out.println("sum"); 이라고 쓰면 sum이라는 문자열 그 자체가 출력됨
        // return; 생략 가능
        // System.out.println(); 을 return 키워드 밑에 적으면 도달할 수 없는 문장으로 에러가 남

        System.out.println(x - y);

        int minus;
        minus = x - y;
        System.out.println(minus);
    }
}
