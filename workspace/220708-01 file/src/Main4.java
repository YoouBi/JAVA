import java.io.File;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		// d:\filetest\한글이름.txt
		
//		File fileKor = new File("d:\\filetest\\한글이름.txt");
//		// 윈도우에서는 한글명의 파일 생성 가능
//		try {
//			System.out.println("생성됨? " + fileKor.createNewFile());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		fileKor.renameTo(new File("d:\\filetest\\newname.txt"));
		// 애도 마찬가지로 성공하면 트루 실패하면 펄스의 불연값을 리턴함
		
		File mytext = new File("d:\\filetest\\mytext.txt");
		mytext.delete(); // 삭제도 되지만 복구는 없당
		
		// 지금 하고 있는 파일 생성들은 운영체제(윈도우) 위에서 하고 있는 것이라 허락을 받아야함
		// 그래서 권한이 없는 곳에서는 파일 입출력이 일어나지 않고 에러가 난다
		// 바탕화면이라던가 내 문서 같은 곳에는 높은 권한이 필요해서 파일 입출력이 잘 안일어날 수도...
	}
}