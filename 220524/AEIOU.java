// 사용자가 입력한 영단어(latin 문자열)에서 모음(a e i o u)이 몇 개인지 출력하세요

import java.util.Scanner;

public class AEIOU {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("영단어를 써주세요.");
		String line = input.next();
		
		int length = line.length();
		int count = 0;
		
		for (int i = 0; i < length; i++) {
			char c = line.charAt(i);
			if (c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u') {
				count++;
			}
		}
		System.out.printf("이 단어에 쓰여진 모음의 갯수는 총 %d개입니다.", count);
	}
}