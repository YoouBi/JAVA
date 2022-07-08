import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main7 {
	public static void main(String[] args) {
		Map<Integer, Set<Integer>> lotto = new LinkedHashMap<>();
		
		lotto.put(1000, new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
		lotto.put(1001, new HashSet<Integer>(Arrays.asList(7, 8, 9, 10, 11, 12)));
		lotto.put(1002, new HashSet<Integer>(Arrays.asList(13, 14, 15, 16, 17, 18)));
		
		// lotto.txt 출력
		// 1000 : [1, 2, 3, 4, 5, 6]
		// 1001 : [7, 8, 9, 10, 11, 12]
		// 1002 : [13, 14, 15, 16, 17, 18]
		
		File file = new File("d:\\filetest\\lotto.txt");
		PrintWriter pw = null;
		
		 // 기존의 내용이 사라지고 덧붙여짐
//		try {
//			pw = new PrintWriter(file);
//			pw.println("새 번호 : 20, 22, 24, 26, 28, 30");
//		} catch (FileNotFoundException e) {
//		} finally {
//			pw.close();
//		}
		
		Set<Integer> keySet = lotto.keySet();
		try {
			pw = new PrintWriter(new FileWriter(file));
			
//			for (int i = 0; i < lotto.size(); i++) {
////			pw.println(1000 + i + " : " + lotto.get(1000 + i));
//				pw.println(lotto.keySet().toArray()[i] + " : " + lotto.get(lotto.keySet().toArray()[i]));
//			}
			
			for(Integer i : keySet) { //for-each로
				pw.println(i + " : " + lotto.get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(pw != null) {
				pw.close();
			}
		}
		
		PrintWriter pw2 = null;
		try {
			pw2 = new PrintWriter(new FileWriter(file, true)); // 뒤에는 append 값
			pw2.println("새 번호 : 20, 22, 24, 26, 28, 30");
		} catch (IOException e) {
		} finally {
			pw2.close();
		}
	}
}
