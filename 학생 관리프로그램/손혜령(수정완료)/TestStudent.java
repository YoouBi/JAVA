/*
학생관리프로그램
콘솔입출력(사용자가 입력할 수 있게)
반에 학생을 등록3명
이름 목록 볼 수 있어야 하고
평균을 볼 수 있고
1등 학생의 정보도 볼 수 있는 프로그램. 
기존에 만들었던 클래스<수정한다면 이유와 전 후가 어떻게 바뀌었는지 다 기록하기.
 */

// 생성자로 만든거-> 입력할 수 있게(스캐너)-> 이거는 따로 메소드로 빼기 



public class TestStudent {
	public static void main(String[] args) {
		
/////학생의 정보를 입력하는 부분
		System.out.println("학생 정보를 등록합니다. ");
		Student s1=new Student();
		s1.setStudent();//사용자의 입력을 받는 메소드를 불러왔다. 
		
		System.out.println("학생 정보를 등록합니다. ");
		Student s2=new Student();
		s2.setStudent();
		
		System.out.println("학생 정보를 등록합니다. ");
		Student s3=new Student();
		s3.setStudent();
////////		
		
		
		//방금 생성한 Student 들을 Room 클래스에서 참조한다
		//참조하고 있어서 Room클래스에서 따로 생성자를 통해 참조할 필요가 없다. 
		Room myRoom= new Room(s1,s2,s3);
		//입력한 이름 나열하는거 
		System.out.println("입력한 학생의 이름은:");
		myRoom.printAllName();
		//원하는 사람의 이름을 입력하면, 그 사람의 정보를 선택해서 보고싶다!!
		System.out.println();
		myRoom.selectName();
		
		System.out.println("--------------------");
		
		
		System.out.println("학생 3명 각각의 평균 점수 입니다.");
		System.out.print(s1.getName()+"평균점수: "+s1.getAverage() +" / ");
		System.out.print(s2.getName()+"평균점수: "+s2.getAverage() +" / ");
		System.out.print(s3.getName()+"평균점수: "+s3.getAverage());
		
		System.out.println("\n--------------------");
	
		
		myRoom.printAllName();
		System.out.println("3명 학생의 평균은: "+myRoom.roomAver()+" 입니다.");
		System.out.printf("가장 평균이 높은 학생의 이름은 %s 입니다.",myRoom.roomTop().getName());
		myRoom.lookFor();// 평균 점수가 가장 높은 학생의 조회하고 싶은 정보를 선택하여 출력하는 메소드
		

		
		/*
		 이전에 생성자-파라미터 입력으로 만든거
		Student s1=new Student("서강준",100,90, 80);
		Student s2 = new Student("차은우", 60, 70, 80);
		Student s3= new Student("송강",80,90,100);
		
		
		Room myRoom= new Room(s1,s2,s3);//생성자로 만든 3명을 새로운 클래스에서 사용할려고 만듬
		
		myRoom.printAllStudent();//잘 참조됐는지 확인하기
		System.out.println(s1.getName()+"평균점수: "+s1.getAverage());
		System.out.println(s2.getName()+"평균점수: "+s2.getAverage());
		System.out.println(s3.getName()+"평균점수: "+s3.getAverage());
		
		System.out.println(myRoom.roomAver());
		System.out.println(myRoom.roomTop());
		System.out.println(myRoom.roomTop().getName());
		*/
				
	}
}