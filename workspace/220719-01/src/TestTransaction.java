import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.co.greenart.dbutill.DBUtill;

public class TestTransaction {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		
		try {
			conn = DBUtill.getConnection();
			conn.setAutoCommit(false);
			// 트랜잭션을 자바에서 관리해주려면 트랜잭션은 커넥션이랑 관리되어있으니까 오토 커밋을 조정해주면 되는데 기본 값이 트루로 되어있다
					
			pstmt = conn.prepareStatement("INSERT INTO books (title, price) VALUES (?, ?)");
			pstmt2 = conn.prepareStatement("UPDATE books SET title = ?, price = ? WHERE title = ?");
			
			for (int i = 0; i < 5; i++) {
				pstmt.setString(1, i + "번째 책");
				pstmt.setInt(2, 1000 * i);
				pstmt.addBatch();
			}
			
			pstmt2.setString(1, "책1");
			pstmt2.setInt(2, 50000);
			pstmt2.setString(3, "1번째 책");
			
			pstmt.executeBatch();
			pstmt2.executeUpdate();
			
			// 모든게 정상적으로 흘러간다면 여기까지 도달할 것
			conn.commit(); // 그러니까 여기서 커밋을 적용시킴
		} catch (SQLException e) {
			System.out.println("롤백합니다.");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			DBUtill.closeStmt(pstmt);
			DBUtill.closeConn(conn);
		}
	}
}

// Dao에서 하던건 자기가 열고닫는 메소드를 불러오는거니까 로직을 바꿀 수 없음
// 그런데 지금 여기서 하는 방식으로 하면 로직에서 read커넥션, update커넥션을 모두 관리하면서 커밋을 하고 예외가 생기면 롤백 할 수 있다