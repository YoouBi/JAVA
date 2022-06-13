public class Box {
	int length;
	int width;
	int height;
	
	public Box(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	} // 이렇게 작성하고 자식 클래스를 보면 컴파일 에러가 난다
	
//	public Box() {
//		length = 5;
//		width = 5;
//		height = 5;
//	}
	
	public int getVolume() {
		return length * width * height;
	}
}