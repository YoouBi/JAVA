import java.sql.Connection;
import java.sql.SQLException;

import kr.co.greenart.dbutill.DBUtill;

// 다오를 쓰는 객체를 만드려면 참조를 해야하니까 필드를 하나 만들고 생성자로 세터를 집어넣을 수 있다
public class BookService {
	private BookDaoParamConn dao;

	public BookService(BookDaoParamConn dao) {
		super();
		this.dao = dao;
	}

	public void setDao(BookDaoParamConn dao) {
		this.dao = dao;
	}
	
	// 신간이 추가되면 비슷한 이름을 가진 책 할인
	public void insertAndUpdate(String title, int price) {
		Connection conn = null;
		
		try {
			conn = DBUtill.getConnection(); // 여러개의 작업을 했더라도 커넥션 객체가 공유되고 있으니까
			conn.setAutoCommit(false); // 여기서 트랜잭션이 발생했고
			dao.update(conn, "%" + title + "%", price);
			dao.insert(conn, title, price);
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback(); // 예외가 생기면 롤백을 할 수 있게 할 수 있음
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			DBUtill.closeConn(conn);
		}
		
	}
}
