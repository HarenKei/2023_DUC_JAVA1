package chapter02;

import java.util.Scanner;

public class Ch02Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acount = 0;

        do {
            System.out.println("-------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-------------------------------------");

            int select = scanner.nextInt();
            int input;

            if(select == 4) break;

            switch(select){

                case 1:
                    System.out.print("예금액 > ");
                    input = scanner.nextInt();
                    acount += input;
                    break;
                case 2:
                    System.out.print("출금액 > ");
                    input = scanner.nextInt();

                    if(acount >= input){
                        acount -= input;
                        break;
                    } else {
                        System.err.println("잔고 부족");
                        break;
                    }

                case 3:
                    System.out.println("잔고 > " + acount);
                    break;
            }
        }while(true);

    }
}
