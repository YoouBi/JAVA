import java.util.Scanner;
public class VDme{
   public static void main(String args[]){
      //입력 돈, 번호 입력, 상품 가격
      int money=0;
        int choise=0;
        int price=0;

      //콜라, 사이다 개수
        int count = 0;
      int count1 = 0;
       
       // 1000,500,100 잔돈 개수
        int m1000=0;
        int m500=0;
        int m100=0;
        
        Scanner input = new Scanner(System.in);
      System.out.println("돈을 입력하세요");
      money = input.nextInt();
      //가장 낮은 가격의 사이다의 값 이상을 입력해야 반복문 실행 
      if(money>=1300){
         do{
            System.out.println("메뉴를 고르세요");
            System.out.print("1번 콜라 : 1500원 2번 사이다 : 1300원 3번 계산 >> ");
            choise = input.nextInt();
               if(choise == 1){
                  price += 1500;
                  count++;
               }
               else if(choise == 2){
                  price += 1300;
                  count1++;
               }
               else if(choise == 3){
                  System.out.println("계산하겠습니다");
               }
               else {
                  System.out.println("1,2,3번중 입력하세요");
               }
         } while(choise!=3);
      }
      else{
          System.out.println("입력한 돈이 부족합니다");
      }
         
   
        if (money<price) {
            System.out.println("입력한 돈이 부족합니다");
        } 
      // 계산이 성공한 경우에만 캔 개수 출력 
      else {
            money -= price;
         System.out.println("콜라 :" + count + "개" + "사이다 :" + count1 + "개");
        }
        // 잔돈은 계산이 실패한경우에도 거스름돈이 출력되기때문 출력
        System.out.println("잔돈 : " + money);
        
      //거스름돈 계산값
        m1000 = money/1000;
        money %= 1000;
        m500 = money/500;
        money %= 500;
        m100 = money/100;
        
        System.out.println("천원 : " + m1000 + "개, 오백원 : " + m500 + "개, 백원 : " + m100 + "개");
        
      }
   }