import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutill.DBUtill;

public class RestaurantsDaoImpl implements RestaurantsDao { // 구현체라는 걸 표현해주기 위해 뒤에 Impl을 붙임
	private Restaurant resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String tradeName = rs.getString("tradeName");
		String callNumber = rs.getString("callNumber");
		String address = rs.getString("address");

		return new Restaurant(id, tradeName, callNumber, address);
	}
	
	public int[] create(List<Restaurant> list) throws SQLException {
		String query = "INSERT INTO restaurant (tradeName, callNumber, address) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtill.getConnection();
			pstmt = conn.prepareStatement(query);
			
			for (Restaurant r : list) {
				pstmt.setString(1, r.getTradeName());
				pstmt.setString(2, r.getCallNumber());
				pstmt.setString(3, r.getAddress());
				pstmt.addBatch();
			}
			
			return pstmt.executeBatch();
		} finally {
			DBUtill.closeStmt(pstmt);
			DBUtill.closeConn(conn);
		}
	}

	@Override
	public int create(String tradeName, String callNumber, String address) throws SQLException {
		String query = "INSERT INTO restaurant (tradeName, callNumber, address) VALUES (?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null; // Statement처럼 명령을 알려주는건 동일하지만 미리 준비를하고 그 후에 실행을 함
		// 준비라는 건 ?를 포함하는 SQL 명령문이 있다면 인자(파라미터)로 전달받아서 값을 넣어주는 동작을 할 수 있는 것
		// 그리고 그 값이 다 넣어지면 준비가 끝났으니까 명령어를 실행시켜 동작하는 것

		try {
			conn = DBUtill.getConnection();
			pstmt = conn.prepareStatement(query); // 파라미터로 작성한 쿼리문을 집어넣고
			pstmt.setString(1, tradeName); // pstmt를 보면 set으로 ?들을 세팅해주는 메소드들이 있다
			// 첫번째 물음표에 들어갈거니까 위치로 1, 그리고 뒤에는 값을 넣어준다
			pstmt.setString(2, callNumber);
			pstmt.setString(3, address);

			return pstmt.executeUpdate();
		} finally {
			DBUtill.closeStmt(pstmt);
			DBUtill.closeConn(conn);
		}
	}

	@Override
	public List<Restaurant> read() throws SQLException {
		String query = "SELECT * FROM restaurant";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		
		try {
			conn = DBUtill.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(resultMapping(rs));
			}
		} finally {
			DBUtill.closeRS(rs);
			DBUtill.closeStmt(pstmt);
			DBUtill.closeConn(conn);
		}

		return list;
	}

	@Override
	public Restaurant read(int id) throws SQLException {
		String query = "SELECT * FROM restaurant WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtill.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				return resultMapping(rs);
			}
		} finally {
			DBUtill.closeRS(rs);
			DBUtill.closeStmt(pstmt);
			DBUtill.closeConn(conn);
		}
		
		return null;
	}

	@Override
	public int update(int id, String tradeName, String callNumber, String address) throws SQLException {
		String query = "UPDATE restaurant SET tradeName = ?, callNumber = ?, address = ? WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtill.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, tradeName);
			pstmt.setString(2, callNumber);
			pstmt.setString(3, address);
			pstmt.setInt(4, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtill.closeStmt(pstmt);
			DBUtill.closeConn(conn);
		}
	}

	@Override
	public int delete(int id) throws SQLException {
		String query = "DELETE FROM restaurant WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtill.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtill.closeStmt(pstmt);
			DBUtill.closeConn(conn);
		}
	}
}
