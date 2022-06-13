public class Student extends Human {
    private String major; // 6. 휴먼을 부모클래스로 하여 메이저 필드 추가

    public Student(String name, int age, String profession, String major) {
    	// 매개 변수의 값으로 필드를 초기화한다.
    	super(name, age, profession); // 7. 부모 클래스의 생성자 호출하여 생성자 정의
    	// 부모 클래스의 필드값이 추가되니 자식에게도 영향이 가서 오류가 뜬다 이처럼 상속으로 모든 걸 해결할 수는 없다
    	this.major = major;
    }
    
    @Override
    public String getProfession() {
    	return "학생";
    }
    
    // 8. 각 필드에 대하여 접근자와 변경자 작성
    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
    	this.major = major;
    }
    
    @Override
    public String toString(){ // 9. 객체 현재값을 부모 toString()을 호출하여 문자열로 반환
//        return name + "의 나이는 " + age + "고 전공은 " + major + "이다.";
        // 부모 클래스에 정의되어있는 필드가 자식에겐 볼 수 없는 프라이빗한 필드라서 접근하는게 안되기 때문에 컴파일 오류가 난다
//        return getName() + "의 나이는 " + getAge() + "고 전공은 " + major + "이다.";
        // 퍼블릭한 친구들의 메소드를 호출하거나
    	return super.toString() + " 전공은 " + major + "를 선택했다.";
    	// 이미 문자열 형태로 반환할 수 있는 부모 toString 메소드가 있으니 그걸 활용해보자!
    }
}
