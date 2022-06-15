// 학생 : 이름, 나이
// 영국학생 : 인사할 수 있음 (Hello)
// 한국학생 : 인사할 수 있음 (안녕)
// 미국인 : 인사할 수 있음 (Wassup)

interface Hello {
	void hello();
}
interface EngHello extends Hello {
	void howoldru();
}
interface KorHello extends Hello {
	void whatdoesyourfatherdo();
}


class Student {}
class BritStudent extends Student implements Hello {
	@Override
	public void hello() {
		System.out.println("Hello");
	}
}
class KorStudent extends Student implements KorHello {
	@Override
	public void hello() {
		System.out.println("안녕");
	}

	@Override
	public void whatdoesyourfatherdo() {
		System.out.println("느그 아브지 무하시노");
	}
}
class American implements Hello {
	@Override
	public void hello() {
		System.out.println("Wassup");
	}
}

public class Main2 {
	public static void main(String[] args) {
		// 인터페이스의 형으로 인스턴스를 참조하여 인사시켜 보기~~
		KorStudent s1 = new KorStudent();
		BritStudent s2 = new BritStudent();
		American s3 = new American();
		
		Hello[] arr = new Hello[3];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].hello();
		}
	}
}
















