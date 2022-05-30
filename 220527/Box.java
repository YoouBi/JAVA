public class Box {
	// 값/상태 -> 멤버변수(member variable)/필드(fields) : 객체의 구성 요소
	int length; // 가로 세로의 값을 정해줘야하는데 값으로 나타낼 수 있는 것을 상태라고 한다
	int width; // 상태라는 것은 클래스 안에서 변수의 형태로 표현 가능
	int height;
	/* int volume = length * width * height;가 왜 안되느냐!
	// 부피를 상태로 나타내봤다가 안돼서 동작으로 나타내봄
	
	int volume;로 변수 선언을 먼저 하고

	public int getVolume() {
		return volume; 으로 밑의 인스턴스에서 참조해서 하는 방식도 되지 않는다
	} 왜냐하면 Box a = new Box(); 같은 방식으로 불러왔을 때 초기화되는 형식이
	값을 지정하지 않았다면 0으로 자동 인식하여
	int length = 0; int width = 0; int height = 0;가 되기 때문에
	a.width = 3; 같은 상태값 초기화는 
	이미 계산식 int volume = length * width * height;가 진행 된 후에 초기화되기 때문에
	int volume = 0 * 0 * 0;으로 출력이 0이 되기 때문이다
	*/
	
	// 메소드/기능 or 동작은 메소드로 표현 가능
	// void는 리턴값 ()는 무언갈 구하기 위해 외부에서 전달 받아야하는 값, 파라미터
	public void printAllState() {
		System.out.println(width); // 필드라는 친구는 width가 지금 {}안에 없는데 어떻게 출력할 수 있지?
		System.out.println(length); // 범위가 public void printAllState() { 가 아니라 public class Box { 안 전부로
		System.out.println(height); // 자기꺼니까 자기가 쓸 수 있다고 인식
	}
	// 저장하고 컴파일까지!
	
	// 박스는 자기자신의
	// 부피를 구해서 정수형 값으로
	// 알려줄 수 있음 (반환)
	// Box로 만들어진 인스턴스들은 가로세로길이 값이 다 알려져있기 때문에 호출하면 됨
	public int getVolume() {
		return length * width * height;
	}
}