import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.co.greenart.dbutill.DBUtill;

public class BookDaoParamConn { // 커넥션 객체를 직접 열거나 닫지 않을 것(1)
	// BookDao의 로직을 사용하는 객체가.........
	public int update(Connection conn, String title, int price) throws SQLException {
		PreparedStatement pstmt = null; // (1)이니까 스테이트 객체만
	
		try {
//			pstmt = conn.prepareStatement("UPDATE books SET title = ?, price = ? WHERE bookId = ?");
			pstmt = conn.prepareStatement("UPDATE books SET price = ? WHERE title LIKE = ?");
//			pstmt.setString(1, title);
//			pstmt.setInt(2, price);
//			pstmt.setInt(3, bookId);
			pstmt.setInt(1, price);
			pstmt.setString(2, title);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtill.closeStmt(pstmt);
		}
	}

	public int insert(Connection conn, String title, int price) throws SQLException {
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement("INSERT INTO books (title, price) VALUES (?, ?)");
			pstmt.setString(1, title);
			pstmt.setInt(2, price);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtill.closeStmt(pstmt);
		}
	}

	public int delete(Connection conn, int bookId) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("DELETE FROM books WHERE bookId = ?");
			pstmt.setInt(1, bookId);

			return pstmt.executeUpdate();
		} finally {
			DBUtill.closeStmt(pstmt);
		}
	}
}
