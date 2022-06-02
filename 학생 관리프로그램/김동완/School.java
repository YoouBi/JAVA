
public class School {
	private Student a;
	private Student b;
	private Student c;

	public School(Student a, Student b, Student c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void studentName() {
		System.out.printf("이름 : %s, %s, %s\n", a.getName(), b.getName(), c.getName());

	}
	
	void print() {
		System.out.println(totalAvg() + "점");
	}

	int totalAvg() {
		return (a.getAverage() + b.getAverage() + c.getAverage()) / 3;
	}

	void totalWin() {
		if (a.getAverage() == b.getAverage() && a.getAverage() == c.getAverage() && b.getAverage() == c.getAverage()) {
			System.out.println(a.getName() + " " + b.getName() + " " + c.getName());
		} else if (a.getAverage() == b.getAverage()) {
			if (a.getAverage() > c.getAverage()) {
				System.out.println(a.getName() + " " + b.getName());
			} else {
				System.out.println(c.getName());
			}
		} else if (b.getAverage() == c.getAverage()) {
			if (b.getAverage() > a.getAverage()) {
				System.out.println(b.getName() + " " + c.getName());
			} else {
				System.out.println(a.getName());
			}
		} else if (a.getAverage() == c.getAverage()) {
			if (a.getAverage() > b.getAverage()) {
				System.out.println(a.getName() + " " + c.getName());
			} else {
				System.out.println(b.getName());
			}
		} else if (a.getAverage() > b.getAverage() && a.getAverage() > c.getAverage()) {
			System.out.println(a.getName());
		} else if (b.getAverage() > c.getAverage()) {
			System.out.println(b.getName());
		} else {
			System.out.println(c.getName());
		}

	}

	void Wingrade() {
		if (a.getAverage() > b.getAverage() && a.getAverage() > c.getAverage()) {
			System.out.print(a.getName() + " ");
			System.out.println("국어: " + a.getKor() + " " + "영어: " + a.getEng() + " " + "수학: " + a.getMath());
		} else if (b.getAverage() > c.getAverage()) {
			System.out.print(b.getName() + " ");
			System.out.println("국어: " + b.getKor() + " " + "영어: " + b.getEng() + " " + "수학: " + b.getMath());
		} else {
			System.out.print(c.getName() + " ");
			System.out.println("국어: " + c.getKor() + " " + "영어: " + c.getEng() + " " + "수학: " + c.getMath());
		}
	}

}
