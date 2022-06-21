import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 일기 관리 프로그램
// 일기 (날짜, 제목, 날씨, 내용 등등)

// 일기 등록
// 같은 일자에는 일기가 1개만 있어야 함 중복 X

// 일기 목록도 볼 수 있음
// 날짜 순
// 내용 길이 순

// 날짜를 선택해서 해당 일기 내용을 수정 가능

// 삭제 - 가장 오래된 일기가 삭제됨.
// 필요하다면 선택해서 삭제하는 것 구현해도 됨
class DiaryMe {
	private int date;
	private String title;
	private String weather;
	private String mainText;
//	private String dateStr;

	public DiaryMe(int date, String title, String weather, String mainText) {
		super();
		this.date = date;
		this.title = title;
		this.weather = weather;
		this.mainText = mainText;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getMainText() {
		return mainText;
	}
	
	public void setMainText(String mainText) {
		this.mainText = mainText;
	}

//	public String dateStr() {
//		return if(date.length == 8) {
//			(date / 10000 % 100) + "/" + (date /100 % 10000) + "/" + (date % 100);
//		} else {
//			(date / 100) + "/" + (date /100 % 100) + "/" + (date % 100);
//		}
//	}

	@Override
	public String toString() {
		return "\nDiary " + date + "weather : " + weather + "\nTitle " + title + "\n" + mainText + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiaryMe other = (DiaryMe) obj;
		if (date != other.date)
			return false;
		return true;
	}
}

public class Main {
	public static void main(String[] args) {
		List<DiaryMe> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		list.add(new DiaryMe(220617, "스콜", "흐림", "옐로우 펀치 맛있었당 >▽<)/ 담에 시켜서 먹어봐야지"));
		list.add(new DiaryMe(220620, "제타라멘", "맑음", "여긴 마제소바가 맛있구나 ._.)_"));

		System.out.println("일기 관리 프로그램을 시작합니다.");

		while (true) {
			System.out.println(
					"관리하고 싶은 내용의 번호를 선택해주세요.\n1.일기 목록\n2.일기 등록\n3.일기 수정\n4.일기 삭제\n5.종료\n=============================");
			int button = scan.nextInt();

			if (button == 1) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getTitle() + "\t" + list.get(i).getDate());
				}
				System.out.println("내용을 보고 싶은 일기의 날짜를 입력해주세요.");
				int date = scan.nextInt();
				scan.nextLine();

				System.out.println(list.get(list.indexOf(new DiaryMe(date, null, null, null))).getMainText());
				System.out.println("\n=============================");
			} else if (button == 2) {
				System.out.println("오늘의 년도와 월일은 어떻게 됩니까? ex.220605");
				int date = scan.nextInt();
				scan.nextLine();

				if (list.contains(new DiaryMe(date, null, null, null))) {
					System.out.println("적어주신 년월일에 해당하는 날짜의 일기가 있습니다.");
				} else {
					System.out.println("오늘의 날씨는 어떻게 됩니까? ex.맑음");
					String weather = scan.nextLine();
					System.out.println("오늘 일기의 제목을 무엇으로 쓸까요?");
					String title = scan.nextLine();
					System.out.println("오늘의 일기 내용을 적어주세요.\n내용을 끝내고 싶다면 1을 적어주세요.");
					String mainText = "";
					
					int count = 0;
					while (true) {
						String text = scan.nextLine();
						if (count == 0) {
							mainText += text;
						} else if (!text.equals("1")) {
							mainText += "\n" + text;
							count++;
						} else {
							break;
						}
					}
					
					list.add(new DiaryMe(date, title, weather, mainText));
				}
			} else if (button == 3) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getTitle() + "\t" + list.get(i).getDate());
				}
				
				System.out.println("수정하고 싶은 일기의 날짜를 입력해주세요.");
				int date = scan.nextInt();
				
				System.out.println("수정하고 싶은 일기의 내용을 입력해주세요.\n내용을 끝내고 싶다면 1을 적어주세요.");
				String mainText = "";
				
				int count = 0;
				while (true) {
					String text = scan.nextLine();
					if (count == 0) {
						mainText += text;
					} else if (!text.equals("1")) {
						mainText += "\n" + text;
						count++;
					} else {
						break;
					}
				}
			} else if (button == 4) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getTitle() + "\t" + list.get(i).getDate());
				}
				System.out.println("삭제하고 싶은 일기의 날짜를 입력해주세요.");
				int date = scan.nextInt();
				
				list.remove(list.get(list.indexOf(new DiaryMe(date, null, null, null))));
			}
		}
	}
}