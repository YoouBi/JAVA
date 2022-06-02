import java.util.Scanner;

public class ClassA {
	private Student kang;
	private Student park;
	private Student kim;

	public ClassA(Student kang, Student park, Student kim) {
		this.kang = kang;
		this.park = park;
		this.kim = kim;
	}

	public Student getKang() {
		return kang;
	}

	public void setKang(Student kang) {
		this.kang = kang;
	}

	public Student getPark() {
		return park;
	}

	public void setPark(Student park) {
		this.park = park;
	}

	public Student getKim() {
		return kim;
	}

	public void setKim(Student kim) {
		this.kim = kim;
	}

	public void printAll() {

		System.out.println(kang.getName());
		System.out.println(park.getName());
		System.out.println(kim.getName());
	}

	public void totalAvg() {
		int kangAvg = (kang.getKor() + kang.getEng() + kang.getMath()) / 3;
		int parkAvg = (park.getKor() + park.getEng() + park.getMath()) / 3;
		int kimAvg = (kim.getKor() + kim.getEng() + kim.getMath()) / 3;
		System.out.println("총 평균 " + (kangAvg + parkAvg + kimAvg) / 3);
	}

	public void bestOne() {
		int kangAvg = (kang.getKor() + kang.getEng() + kang.getMath()) / 3;
		int parkAvg = (park.getKor() + park.getEng() + park.getMath()) / 3;
		int kimAvg = (kim.getKor() + kim.getEng() + kim.getMath()) / 3;
		if (kangAvg > parkAvg && kangAvg > kimAvg) {
			System.out.println("1등은 " + kang.getName());
		} else if (parkAvg > kangAvg && parkAvg > kimAvg) {
			System.out.println("1등은 " + park.getName());
		} else if (kimAvg > kangAvg && kimAvg > parkAvg) {
			System.out.println("1등은 " + park.getName());
		} else if (kangAvg == parkAvg && kangAvg == kimAvg) {
			System.out.print("공동1등: ");
			System.out.print(kang.getName());
			System.out.print(" " + park.getName());
			System.out.print(" " + kim.getName());
		}

	}

	public void korAvg() {
		int korAvg = (kang.getKor() + park.getKor() + kim.getKor()) / 3;
		System.out.println(korAvg);
	}

	public void engAvg() {
		int engAvg = (kang.getEng() + park.getEng() + kim.getEng()) / 3;
		System.out.println(engAvg);
	}

	public void mathAvg() {
		int mathAvg = (kang.getMath() + park.getMath() + kim.getMath()) / 3;
		System.out.println(mathAvg);
	}
}
