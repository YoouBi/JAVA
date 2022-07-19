import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutill.DBUtill;


public class BooksRepository {
	private Book ResultMapping(ResultSet rs) throws SQLException {
		int bookId = rs.getInt("bookId");
		String title = rs.getString("title");
		int price = rs.getInt("price");
		
		return new Book(bookId, title, price);
	}
	
	// 추가
	public int add(Book book) throws SQLException { // 책 추가만 해주는 클래스인데
		// 결과값을 인트로만 알려준다면 모든 상황에 대한 인트값이 만들어져 있어야 될 것임
		// 잘되면 1, 안되면 예외로 알려줄 것
		
		// 반환은 언제나 간단한 정보를 넘겨주려고 하고 (int로 모든 정보를 사용할 수 있다)
		// 안됐을 경우에만 복잡한 정보를 주려고 하는게 좋다
		String query = "INSERT INTO books (title, price) VALUES ('" + book.getTitle() + "', " + book.getPrice() + ")";
		System.out.println("추가: " + query);
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtill.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
//		} catch (SQLException e) {
//			e.printStackTrace();
		} finally {
			DBUtill.closeStmt(stmt);
			DBUtill.closeConn(conn);
		}
		
//		return 0;
	}
	
	// 목록 전체
	public List<Book> list() throws SQLException {
		String query = "SELECT * FROM books";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Book> list = new ArrayList<>();
		try {
			conn = DBUtill.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				list.add(ResultMapping(rs));
			}
		} finally {
			DBUtill.closeRS(rs);
			DBUtill.closeStmt(stmt);
			DBUtill.closeConn(conn);
		}
		return list; // finally가 일어나고 난 뒤에
	}
	// 검색 (제목) or 검색 (가격)
	public Book selectByTitle(String title) throws SQLException {
		String query = "SELECT * FROM books WHERE title = '" + title + "'";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtill.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if (rs.next()) {
				return ResultMapping(rs);
			} else {
				return null; // 널 값 말고도 빈 객체(빈 리스트가 반환될테니까), 또는 예외로 처리
			}
		} finally {
			DBUtill.closeRS(rs);
			DBUtill.closeStmt(stmt);
			DBUtill.closeConn(conn);
		}
	}
//	public List<Book> selectByPrice(int price) {
//	}

	// 삭제
	public int delete(int bookId) throws SQLException {
		String query = "DELETE FROM books WHERE bookId = " + bookId;
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtill.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtill.closeStmt(stmt);
			DBUtill.closeConn(conn);
		}
	}
	
	// 수정
	public int update(Book book) throws SQLException {
		String query = "UPDATE books SET title = '" + book.getTitle()
				+ "', price = " + book.getPrice()
				+ " WHERE bookId = " + book.getBookId();
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtill.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtill.closeStmt(stmt);
			DBUtill.closeConn(conn);
		}
	}
}