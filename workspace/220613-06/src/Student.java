public class Student {
	String name;
	int classNumber;
	String department;
	int grade;
	int credit;
	
	public Student(String name, int classNumber, String department, int grade, int credit) {
		this.name = name;
		this.classNumber = classNumber;
		this.department = department;
		this.grade = grade;
		this.credit = credit;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public String toString() {
		return classNumber + "학번 " + department + " 학과 소속의 " + grade + "학년 " + name + "는 " + credit + "학점을 이수하여야한다.";
	} 
}

class UnderGraduate extends Student {
	String club;

	public UnderGraduate(String name, int classNumber, String department, int grade, int credit, String club) {
		super(name, classNumber, department, grade, credit);
		this.club = club;
	}
	
	public String toString() {
		return club + "동아리에 가입한 학부생 " + super.toString();
	} 
}

class Graduate extends Student {
	String category;
	double scholarship;
	
	public Graduate(String name, int classNumber, String department, int grade, int credit, String category,
			double scholarship) {
		super(name, classNumber, department, grade, credit);
		this.category = category;
		this.scholarship = scholarship;
	}
		
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public double getScholarship() {
		return scholarship;
	}

	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}

	public String toString() {
		return "대학원생 " + category + " 조교 유형(장학금 " + scholarship + "비율)으로 들어온 " + super.toString();
	} 
}
