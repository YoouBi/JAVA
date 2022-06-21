import java.time.LocalDate;

interface LeafletHandler { // 전단지 내용을 배포할 객체
	String give();
}

// 위의 인터페이스를 구현하는 클래스를 작성하세요. 추상메소드를 오버라이드 해야합니다. 구현 바디는 (전화번호 문자열 반환)
// 일수 광고 전단지 제공자
// 전화번호가 포함되어야함
class LoanAD implements LeafletHandler {
	private String phone; // 전화번호를 동적으로 하고 싶으면 필드를 만들면 그때그때 넣어서 쓸 수 있을 것이다
	
	public LoanAD(String phone) {
		super();
		this.phone = phone;
	}

	@Override
	public String give() {
		return phone;
	}
}

// 선거 광고 전단지 제공자
// 선거 날짜가 포함되어야함
class VoteAD implements LeafletHandler {
	private LocalDate day;

	public VoteAD(LocalDate day) {
		super();
		this.day = day;
	}

	@Override
	public String give() {
		return "투표날짜: " + day.toString();
	}
}

// ------------
// 광고대행사
// 일수광고/선거광고
class AdCompany {
	LeafletHandler ad;

	public AdCompany(LeafletHandler ad) {
		super();
		this.ad = ad;
	}

	public LeafletHandler getAd() {
		return ad;
	}

	public void setAd(LeafletHandler ad) {
		this.ad = ad;
	}
	
	public void consoleAD() {
		System.out.println(ad.give());
	}
}

public class Main {
	public static void main(String[] args) {
		AdCompany company = new AdCompany(new LoanAD("010-1111-2222"));
		
		company.consoleAD();
		
		company.setAd(new VoteAD(LocalDate.now()));
		
		company.consoleAD();
//		LeafletHandler h1 = new 일수광고();
//		String 일수광고전화번호가포함된문자열 = h1.give();
//		
//		LeafletHandler h2 = new 선거광고();
//		String 선거날짜가포함된광고문자열 = h2.give();
//		
//		광고대행사 p = new 광고대행사(일수광고);
//		p.광고() <<< 일수광고
//		
//		p.set고객(선거광고);
//		p.광고() <<< 선거광고
	}
}