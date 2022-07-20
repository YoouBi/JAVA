import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.greenart.dbutill.DBUtil;

// 이렇게 db로 파일을 받아오는 것에 대한 장단점이 있는데
// 장점은 db가 관리를 한다는 것인데 db 자체의 장점이 pk라는 걸 고유하게 주니까
// 1. 파일들에 대해서 특정한 값을 키값으로써 관리할 수 있고,
// 2. PK로써 유니크하게 관리도 가능하고,
// 3. 참조해야할 객체가 있다면 파일이 삭제되고 변경되는 걸 막아줄 수 있다
// 는 장점들이 있으니까 그런 장점들을 활용할 수 있다
// 단점은 불러들였다가(다운받고) 반환해야하니까(내 컴퓨터에서 실행) 그런 실행 시간들이 걸려 좀 느리다는 것이다
public class FileDB { // 파일이 올라갔다는건 DB가 테이블의 ROW로써 존재한다는 것
	public static void main(String[] args) {
		// 0과 1을 여러개 담을 수 있는 BLOB을 쓴다
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try { 
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM files WHERE id = ?");
			pstmt.setInt(1, 1000);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getNString("name");
				Blob file = rs.getBlob("file");
				
				InputStream inputStream = file.getBinaryStream();
				FileOutputStream fos = new FileOutputStream(new File("다운로드받은거.png"));
				
				int b = 0;
				while (( b = inputStream.read()) != -1) {
					fos.write(b);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		
//		try { 
//			conn = DBUtill.getConnection();
//			pstmt = conn.prepareStatement("INSERT INTO files (id, name, file) VALUES (?, ?, ?)");
//			pstmt.setInt(1, 1000);
//			pstmt.setString(2, "파일이름");
//			pstmt.setBlob(3, new FileInputStream(new File("춘식1.png")));
//			
//			pstmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			DBUtill.closeStmt(pstmt);
//			DBUtill.closeConn(conn);
//		}
	}
}
