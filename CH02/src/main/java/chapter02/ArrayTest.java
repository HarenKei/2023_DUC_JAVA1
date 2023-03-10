package chapter02;

public class ArrayTest {
    public static void main(String[] args) {
        int[][] scores = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
        int sum = 0,  cnt = 0, avg = 0;

        for(int i = 0; i < scores.length; i++){
            for(int j = 0; j < scores[i].length; j++){
                sum += scores[i][j];
                cnt++;
            }
        }

        avg = sum / cnt;

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
