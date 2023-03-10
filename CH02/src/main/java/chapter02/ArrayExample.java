package chapter02;

public class ArrayExample {
    public static void main(String[] args) {
        int[] scores = {80, 75, 93};
        int sum = 0;

        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }

        System.out.println(sum);
    }
}
