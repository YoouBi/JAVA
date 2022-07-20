import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.greenart.dbutill.DBUtil;

public class Main {
	public static void main(String[] args) {
		try (Connection conn = DBUtil.getConnection(); // try resource문 으로 열고 닫아야하는 객체(autoClose문을 구현하고 있는 객체)를 써두면 자동으로 close를 해준다
				PreparedStatement pstmt = conn.prepareStatement("");) { // 여러개를 쓰려면 선언을 하고 다음 줄에 다시 쓰면 된다
			pstmt.setString(1, "");
			try (ResultSet rs = pstmt.executeQuery();) { // 이렇게 트라이 안에 트라이로 쓰면 일반적으로 처리하는 예외랑 다르게 처리해야 할 수도 있다
				// .executeQuery는 셀렉문으로 반환 타입, 결과값이 ResultSet로 나올 때 쓰고 
				// .executeUpdate는 INSERT, DELETE, CREATE 처럼 반환 타입이 INT로 나오는 아이들한테 씀
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("")) { // 파일도 자동으로 닫기가 가능하다

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		Connection conn = null;
//		
//		try {
//			conn = DBUtil.getConnection();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
	}
}