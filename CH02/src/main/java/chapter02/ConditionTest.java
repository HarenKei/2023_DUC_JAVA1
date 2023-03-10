package chapter02;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID 입력 : ");
        String id = scanner.nextLine();
        System.out.print("PW 입력 : ");
        int password = Integer.parseInt(scanner.nextLine());

        if(id.equals("java") && password == 1234) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
    }
}