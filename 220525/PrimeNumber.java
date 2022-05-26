// 2 ~ 100 사이의 모든 소수 출력하기

public class PrimeNumber {
	public static void main(String[] args) {
		int count = 0;

		for (int i = 2; i <= 100; i++) {
			// int count = 0; 아예 지역변수로 두면 마지막에 0 초기화 둘 필요없이 for문 한번 끝날때엔 돌아가서 없어지고 다시 생긴다			
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			
			switch(count) {
				case 2:
				System.out.println(i);
			}
			count = 0;
		}
	}
}