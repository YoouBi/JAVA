import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/my_db";
		String id = "root";
		String password = "root";

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

	public static void selectAllBook() {
		Connection conn = null;
		Statement stmt = null;
//		stmt.executeQuery("SELECT * FROM books");
		// 조회하고자하는 셀렉문의 경우 익스큐트쿼리를 쓰면 됨
		// 반환값으로 result set을 준다
		ResultSet rs = null; // result set은 한줄씩 결과를 준다

		try {
			conn = makeConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM books");
			// executeQuery
			// Statement 객체는 SQL 실행문을 .............
			// 실행 결과는 정수로 표현 가능(1행이 실행되었다)
			// 그런데 SELECT문으로 테이블을 본다면 인트 값으로 확인할 수 없으니까
			// 테이블을 볼 수 있게끔 만들어둔 result 객체를 반환하는 executeQuery를 쓰는 것
			
			while (rs.next()) { // 다음 행이 없다면 boolean값을 반환
				int id = rs.getInt("bookId");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				System.out.println(id + ", " + title + ", " + price);
			};
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (stmt != null) {
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

	public static int insertBook(String title, int price) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;

		try {
			conn = makeConnection();
			stmt = conn.createStatement();

			result = stmt
					.executeUpdate("INSERT INTO books (title, price) VALUES (" + "'" + title + "', " + price + ");");

			System.out.println(result + "행이 추가되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
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

		return result;
	}

	public static void main(String[] args) {
//		insertBook("새로운 책입니당", 13000);
		selectAllBook();
	}
}
