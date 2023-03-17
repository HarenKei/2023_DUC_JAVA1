package chapter03.practice;

public class Tire {
    protected int maxRotation;
    protected int accumulatedRotation;
    protected String location;

    //생성자는 타이어의 위치와 최대 회전수를 매개값으로 받아서 저장

    public Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        accumulatedRotation++;
        if(accumulatedRotation < maxRotation) {
            System.out.printf("%s Tire 수명 : %d 회\n", location, maxRotation - accumulatedRotation );
        } else {
            System.out.printf("*** %s Tire 펑크 ***\n", location);
            return false;
        }

        return true;
    }
}
