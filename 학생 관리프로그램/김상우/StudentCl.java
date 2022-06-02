
public class StudentCl {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		ClRoom student = new ClRoom(s1, s2, s3);
		student.printNameAll();
		student.printAver();
		student.printBestAver();
		student.manage();
	}

}
