import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;

import kr.co.greenart.dbutill.DBUtill;

class Restaurant {
	private int restId;
	private String tradeName;
	private int callNumber;
	private String adress;

	public Restaurant(String tradeName, int callNumber, String adress) {
		super();
		this.tradeName = tradeName;
		this.callNumber = callNumber;
		this.adress = adress;
	}

	public Restaurant(int restId, String tradeName, int callNumber, String adress) {
		super();
		this.restId = restId;
		this.tradeName = tradeName;
		this.callNumber = callNumber;
		this.adress = adress;
	}

	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public int getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(int callNumber) {
		this.callNumber = callNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Restaurant [restId=" + restId + ", tradeName=" + tradeName + ", callNumber=" + callNumber + ", adress="
				+ adress + "]";
	}
}

class Menu {
	private int mentId;
	private String food;
	private int price;
	private int restId;

	public Menu(String food, int price, int restId) {
		super();
		this.food = food;
		this.price = price;
		this.restId = restId;
	}

	public Menu(int mentId, String food, int price, int restId) {
		super();
		this.mentId = mentId;
		this.food = food;
		this.price = price;
		this.restId = restId;
	}

	public int getMentId() {
		return mentId;
	}

	public void setMentId(int mentId) {
		this.mentId = mentId;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	@Override
	public String toString() {
		return "menu [mentId=" + mentId + ", food=" + food + ", price=" + price + ", restId=" + restId + "]";
	}
}

/*
 * restaurants 테이블에 대한 db access를 수행하는 객체를 작성해보세요. 작성 후 테스트!!
 * 
 * 메소드(입력값) : 반환값 throws 예외
 * 
 * C(상호명, 전화번호, 주소) or C(음식점) : 행 개수 throws SQLException R() : List<음식점> throws
 * SQLException R(id) : 음식점 throws SQLException U(id, 상호명, 전화번호, 주소) or U(음식점) :
 * 행 개수 throws SQLException D(id) : 행 개수 throws SQLException
 * 
 * --------------------------------------------------------------------
 * 
 * 여러 행의 음식점 추가
 */

public class Restaurants {
	private Restaurant RestaurantResultMapping(ResultSet rs) throws SQLException {
		int restId = rs.getInt("restId");
		String tradeName = rs.getString("tradeName");
		int callNumber = rs.getInt("callNumber");
		String adress = rs.getString("adress");

		return new Restaurant(restId, tradeName, callNumber, adress);
	}

	private Menu MenuResultMapping(ResultSet rs) throws SQLException {
		int mentId = rs.getInt("mentId");
		String food = rs.getString("food");
		int price = rs.getInt("price");
		int restId = rs.getInt("restId");

		return new Menu(mentId, food, price, restId);
	}

	// 추가
	public int add(Restaurant restaurant) throws SQLException {
		String query = "INSERT INTO restaurant (title, price) VALUES ('" + restaurant.getTradeName() + "', "
				+ restaurant.getCallNumber() + "', " + restaurant.getAdress() + ")";
		System.out.println("추가: " + query);

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

	// 목록 -> R() : List<음식점>
	public List<Restaurant> restlist() throws SQLException {
		String query = "SELECT * FROM restaurant";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		List<Restaurant> list = new ArrayList<>();
		try {
			conn = DBUtill.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				list.add(RestaurantResultMapping(rs));
			}
		} finally {
			DBUtill.closeRS(rs);
			DBUtill.closeStmt(stmt);
			DBUtill.closeConn(conn);
		}
		return list;
	}

	// 메뉴 목록 -> R(id) : 음식점
	public List<Menu> menuList() throws SQLException {
		String query = "SELECT * FROM menu";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		List<Menu> list = new ArrayList<>();
		try {
			conn = DBUtill.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				list.add(MenuResultMapping(rs));
			}
		} finally {
			DBUtill.closeRS(rs);
			DBUtill.closeStmt(stmt);
			DBUtill.closeConn(conn);
		}
		return list;
	}

	// 수정 -> U(id, 상호명, 전화번호, 주소) or U(음식점) : 행 개수
	public int update(Restaurant restaurant) throws SQLException {
		String query = "UPDATE restaurant SET tradName = '" + restaurant.getTradeName() + "', callNumber = "
				+ restaurant.getCallNumber() + "', adress = " + restaurant.getAdress() + " WHERE restId = "
				+ restaurant.getRestId();

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

	// 삭제 -> D(id) : 행 개수
	public int delete(int restId) throws SQLException {
		String query = "DELETE FROM restaurant WHERE restId = " + restId;

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
	
	public void menu() {
		System.out.println("1.음식점 추가, 2.음식점 목록, 3.음식점의 메뉴 목록, 4.음식점 정보 수정, 5.음식점 폐업");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		switch (num) {
		case 1:
			add();
			break;
			
		case 2:
			break;
			
		case 3:
			break;
			
		case 4:
			break;
			
		case 5:
			break;

		default:
			break;
		}
	}

	private void add() {
		System.out.println("제목, 전화번호, 주소를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		
		String tradeName = scan.nextLine(); // 입력받자말자 입력값 처리를 해주자
		if (tradeName.length() > 15) {
			System.out.println("40자를 넘었습니다.");
			return;
		}
	
		int price = scan.nextInt();

		String tradeName = scan.nextLine();
		
		try {
			int result = repo.add(new Book(title, price));
			
			System.out.println("개의 책이 추가되었습니다.");
		} catch (SQLException e) {
			if(e.getErrorCode() == 1062) { // MySQL에서는 1062가 중복됐다는 코드
				System.out.println("중복된 제목. 제목을 다시 확인해주세요.");
//			} else if (e.getErrorCode() == 1406) { // 이미 우리가 준 제약이니까 예외 상황으로 두지 말고
//				System.out.println("길이가 너무 깁니다.");
			}
			System.out.println("데이터를 추가하는 과정이 실패했습니다. 다시 시도해주세요.");
		}
	}
	
	public static void main(String[] args) {

	}
}