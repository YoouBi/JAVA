// 2 ~ 100 사이의 모든 소수 출력하기

public class PrimeNumber {
	public static void main(String[] args) {
		int count = 0;
		int i;
		
		for ( i = 1; i <= 100; i++) {		
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