package chapter02;

public class VariableExample {
    public static void main(String[] args) {
        int hour = 3;
        int minutes = 5;

        System.out.println(hour + "시간 " + minutes + "분");

        int totalMinutes = (hour * 60) + minutes;
        System.out.println("total : " + totalMinutes);

        int v1, v2 = 0;

        if(true) {
            v1 = 1;
            v2 = 2;
        }

        System.out.println(v1 + v2);
    }
}
