import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

public class Main {
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser();
		
		FileFilter filter = new FileFilter() {
			@Override
			public String getDescription() {
				return "텍스트 파일";
			}
			
			@Override
			public boolean accept(File f) {
				if (f.isDirectory()) {
					return true;
				}
				return f.getName().endsWith(".txt");
			}
		};
		chooser.setFileFilter(filter);
		chooser.showOpenDialog(null);
		
		
//		int result = chooser.showSaveDialog(null);
//		if (result == JFileChooser.APPROVE_OPTION) {
//			System.out.println("저장 버튼 눌렀을 때");
//			
//			File file = chooser.getSelectedFile();
//			System.out.println("사용자가 선택한 파일 : " + file.getAbsolutePath());
//		}
	}
}
