import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.co.greenart.dbutill.DBUtill; // 이클립스에서는 프로젝트를 바로 포함시킬 수 있다

public class TestConn {
	public static void main(String[] args) {
//		DBUtill
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		System.out.println("실행 흐름1");
		
		try {
			conn = DBUtill.getConnection();
			
			System.out.println("실행 흐름2");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT 1");
			
			if (rs.next()) {
				int result = rs.getInt(1);
				System.out.println("확인 : " + result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtill.closeRS(rs);
			DBUtill.closeStmt(stmt);
			DBUtill.closeConn(conn);
		}
	}
}
