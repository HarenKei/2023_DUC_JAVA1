package chapter02;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String birth;
        String phone;

        System.out.println("[필수 정보 입력]");
        System.out.print("1. 이름 : ");
        name = scanner.nextLine();
        System.out.print("2. 생년월일 : ");
        birth = scanner.nextLine();
        System.out.print("3. 전화번호 : ");
        phone = scanner.nextLine();

        System.out.println("[입력한 내용]");
        System.out.println("1. 이름 : " + name);
        System.out.println("2. 생년월일 : " + birth);
        System.out.println("3. 전화번호 : " + phone);
    }
}
