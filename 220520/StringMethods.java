public class StringMethods {
	public static void main(String[] args) {
		String hello = "hello";
		
		int index = hello.indexOf("o");
		System.out.println(index);
		
		int notFound = hello.indexOf("a");
		System.out.println(notFound); // 없으면 무조건 -1
		
		// int index2 = hello.indexOf("ll");
		// System.out.println(index2);
		
		int index2 = hello.indexOf("l", 3); // 세번째부터 찾아라
		System.out.println(index2);
		
		int index3 = hello.lastIndexOf("l");
		System.out.println(index3); // 오른쪽에서부터 찾는다
	}
}