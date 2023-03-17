package chapter03;

public class Calculator {

    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double divide(int x, int y) {
        return (double) x/y;
    }

    // 매개변수의 개수를 모를 경우
    int sum1(int[] values) {
        int sum = 0;
        for(int i=0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
    int sum2(int...values) {
        int sum = 0;
        for(int i=0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }


}