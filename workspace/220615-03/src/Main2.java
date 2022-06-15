// 학생 : 이름, 나이
// 영국학생 : 인사할 수 있음 (hello)
// 한국학생 : 인사할 수 있음 (안녕)
// 미국인 : 인사할 수 있음 (Wassup)

// 메소드 구현까지
public class Main2 {
	public static void main(String[] args) {
		// 인터페이스의 형으로 인스턴스를 참조하여 인사시켜보기~~~
		IGreet EngStu = new Eng();
		IGreet KorStu = new Kor();
		IGreet Ameman = new Ame();
		
		// 배열이 만들어진거지 인터페이스에 인스턴스가 만들어진게 아님
		// 인스턴스가 되는게 아니라는게 간단히 말해서 new Greet();를 할 수 없다는 것
		// Greet 타입 참조 불가능...?
		IGreet[] arr = new IGreet[3]; // 3개의 객체니까 오브젝트 배열이면 다 담을 수 있다
		arr[0] = EngStu; // 업캐스팅 일어나서 배열에 잘 담길 것
		arr[1] = KorStu;
		arr[2] = Ameman;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].greet();
			// Object[] arr = new Object[3] 였다면 오브젝트 형이라 자식의 모든 동작을 담아내는게 아니라 toString과 equals밖에 못함
		}
		
		EngStu.greet();
		KorStu.greet();
		Ameman.greet();
	}
}
