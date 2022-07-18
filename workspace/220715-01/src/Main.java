import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");

			// table A : 컬럼 B VARCHAR(10) PK
			String query = "CREATE TABLE A (B VARCHAR(10) PRIMARY KEY);";
			query = "DROP TABLE A";
			// 명령을 내릴 수 있는 스테이트먼트라는 객체는 커넥션 객체에서 만들 수 있다
			stmt = conn.createStatement();
			
			stmt.executeUpdate(query); // Update는 수정작업(추가, 생성, 변경, 삭제) 동작

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) { // 닫는 순서는 반대로
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
