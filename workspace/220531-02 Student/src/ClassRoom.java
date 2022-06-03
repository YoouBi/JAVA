public class ClassRoom {
	private Student stu1;
	private Student stu2;
	private Student stu3;
	
	public ClassRoom() {} // 생성자. 반은 생겼는데 관리할 학생은 아직 생기지 않았다
	// 필드 초기화 방법을 여러개 마련해 둔 것
	
	public ClassRoom(Student stu1, Student stu2, Student stu3) {
		this.stu1 = stu1;
		this.stu2 = stu2;
		this.stu3 = stu3;
	}
	
	public void printNames() {
		System.out.println("1번학생: " + stu1.getName());
		System.out.println("2번학생: " + stu2.getName());
		System.out.println("3번학생: " + stu3.getName());
	}
	
	public int getTotalAvg() {
		return (stu1.getAverage() 
				+ stu2.getAverage() 
				+ stu3.getAverage()) / 3;
	}
	
	public Student getTop() {
		return max(max(stu1, stu2), stu3);
	}
		
//		if (stu1.compare(stu2) && stu1.compare(stu3)) {
//			return stu1;
//		} else (stu2.compare(stu1) && stu2.compare(stu3)) {
//			return stu2;
//		}
//	}
	
	public Student max(Student left, Student right) {
		if (left.getAverage() >= right.getAverage()) {
			return left;
		} else {
			return right;
		}
	}

	public Student getStu1() { // 학생 한명에 대한 참조
		return stu1;
	}

	public void setStu1(Student stu1) {
		this.stu1 = stu1;
	}

	public Student getStu2() {
		return stu2;
	}

	public void setStu2(Student stu2) {
		this.stu2 = stu2;
	}

	public Student getStu3() {
		return stu3;
	}

	public void setStu3(Student stu3) {
		this.stu3 = stu3;
	}
}