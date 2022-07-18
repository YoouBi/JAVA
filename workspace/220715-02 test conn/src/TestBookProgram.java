/* my_db.books
 * 
 * 도서 관리 프로그램
 * 추가
 * 전체 목록
 * (아이디나 제목이나 가격 등으로 검색 가능)
 * 삭제
 * 수정 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.co.greenart.dbutill.DBUtill;

public class TestBookProgram {
	public static void main(String[] args) {
//		DBUtill
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtill.getConnection();

			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM books");

			while (rs.next()) {
				int id = rs.getInt("bookId");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				System.out.println(id + ". " + title + " (정가 " + price + "원)");
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
