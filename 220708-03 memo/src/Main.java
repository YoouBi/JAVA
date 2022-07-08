import java.io.File;

import javax.swing.JFileChooser;

// GUI 어플리케이션으로 메모장을 만들어보기
// 파일 저장, 열기, ...
// 어떤 걸 열어서 볼건지 물어보는 창부터
public class Main {
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser(); // 파일 선택을 할 수 있는 다이얼로그 역할
//		chooser.showOpenDialog(null);
		chooser.showSaveDialog(null);
		int result = chooser.showSaveDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			System.out.println("저장 버튼 눌렀을 때");
			
			File file = chooser.getSelectedFile();
			System.out.println("사용자가 선택한 파일 : " + file.getAbsolutePath());
		}
	}
}