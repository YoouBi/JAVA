import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 파일 내용 읽어보기!
public class Main {
	public static void main(String[] args) {
		File newname = new File("d:\\filetest\\newname.txt");
//		System.out.println(newname.exists()); // 일단 파일이 있는지부터 확인
		// 외부의 자원을 소프트웨어로 가져오기 위해서는 데이터가 흐를 수 있는 통로가 하나 필요하다
		Scanner scanner = null; // 콘솔 창에 있는걸 입력해주던 것처럼 파일도 입력해줌

		try {
			scanner = new Scanner(newname); // 파일 객체를 전달받는 생성자는...
			// 또 다른 체크드 인셉션이 뜨는데 파일을 찾지 못할 때 생기는 인셉션
			
			// window > preference> 검색으로 encoding 치면 workspace 나오는데 text file encoding에서 UTF-8로 지정이 되어있지 않으면
			// scanner = new Scanner(newname, "UTF-8"); 한글을 못읽어서 읽는 언어 양식 자체를 바꿔줘야한다
			
			while (scanner.hasNext()) { // 다음줄이 있냐고 물어보고 있는만큼 가져올 것
				System.out.println(scanner.nextLine()); // 다음 줄을 가져오라고 해야하는데 줄 수만큼 반복해야하니까
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} finally {
			if(scanner != null) {
				scanner.close(); // 자원 해제를 위해서 통로를 닫아줌
			}
		}
	}
}
