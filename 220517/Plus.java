public class Plus {
    public static void main(String[] args) {
        // println이라는 method (메소드)를 call (호출)
		// 메소드 호출이란? 메소드를 버튼이 아닌 이름으로 제공, 이 이름을 불러주면 그 기능을 사용할 수 있음
        System.out.println(10 + " " + "10");
        System.out.println("20" + 20); // 문자열이 덧붙여진걸로 받아들임
        System.out.println(); // 줄 공백
        System.out.println(5.123);
        System.out.println(0.1 + 0.1);

        System.out.print(1); // 다음줄로 줄바꿈이 일어나지 않고 그 다음 출력이 오른쪽에 붙어서 하나씩 출력됨
        System.out.print(2);
        System.out.print(3);
    }
}