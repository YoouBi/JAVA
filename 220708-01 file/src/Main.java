import java.io.File;

public class Main {
	public static void main(String[] args) {
		File file = new File("d:\\Java\\test.txt"); // 절대적 경로

		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists()); // 존재하고 있는가?

		File f2 = new File("d:\\Java\\asdf.txt"); // 파일 객체는 존재
		// 실제의 파일은 아니고 외부의 존재를 소통시킬 수 있는 객체

		System.out.println(f2.getName());
		System.out.println(f2.getPath());
		System.out.println(f2.exists());

		File dir = new File("d:\\Java"); // 객체뿐만 아니라 폴더, 디렉토리도 가리킬 수 있음
		System.out.println(dir.getName());
		System.out.println(dir.getPath());
		System.out.println(dir.exists());
		
		System.out.println("파일인가요? " + dir.isFile());
		System.out.println("디렉토리인가요? " + dir.isDirectory());
		
		// 우리가 지금 실행시키고 있는 소프트웨어는 드라이브와 무관한 곳에서 실행되고 있음
		// 그래서 드라이브의 파일을 찾기 위해 경로..............
	}
}

// 하드디스크라고 하는 물리적/논리적으로 나눌 수 있는 장치로서 하나의 드라이브
// A, B는 옛날에 쓰던 플로피디스크 자리
// 그래서 하드디스크는 다음 자리인 C부터 자리를 차지함
// 파일을 기록하는데에 있어서 자기들이 알아서 구역(섹터)을 나눠서 기록을 하는 편
// 우리들이 우리 기준으로 나눠서 기록을 해야하는데 분류를 위해서 폴더라는 구조로 나눔
// 오토데스크라는......................
// 폴더(디렉토리) 안에는 각각의 파일들을 가지고 있는데 이 파일들은 차지하는 공간, 즉 용량이 있다
// 기록을 하는 이유는 나중에 엑세스하기(다시 접근하기) 위함 -> 그러려면 이름이 있어야함
// 그래서 파일들은 똑같은 이름을 가질 수 없고 고유한 이름을 가지고 있다
// OS?라는 친구가 엑세스하기 위해서 대략적으로 어떤 내용을 갖고 있는가를 오른쪽에 확장자로써 나타냄