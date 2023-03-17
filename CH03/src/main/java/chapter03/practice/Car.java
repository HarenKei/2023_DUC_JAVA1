package chapter03.practice;

public class Car {
    //### [실습] 아래 조건을 만족하는 Car 클래스를 작성하시오.
    //
    //- 패키지 : chapter03.practice
    //- Car 클래스의 필드
    //    - Tire 타입의 frontLeftTire : 앞왼쪽, 최대 수명 6
    //    - Tire 타입의 frontRightTire : 앞오른쪽, 최대 수명 2
    //    - Tire 타입의 backLeftTire: 뒤왼쪽, 최대 수명 3
    //    - Tire 타입의 backRightTire: 뒤오른쪽, 최대 수명 4
    //- run() 메소드
    //    - 4개의 타이어를 1번씩 회전시킨다. >> 각 Tire 객체의 roll() 메소드 호출
    //    - 각 Tire 가 펑크가 나면 stop() 메소드를 호출하고 해당 타이어의 위치를 리턴한다.
    //- stop() 메소드 : 타이어에 펑크가 날때 자동차를 멈추는 메소드로 “[자동차가 멈춥니다.]”를 출력

    protected Tire frontLeftTire = new Tire("앞왼쪽", 6);
    protected Tire frontRightTire = new Tire("앞오른쪽", 2);
    protected Tire backLeftTire = new Tire("뒤왼쪽", 3);
    protected Tire backRightTire = new Tire("뒤오른쪽", 4);



    public String run() {
        String runResult = "";

        if(!frontLeftTire.roll()){
            stop();
            runResult = frontLeftTire.location;
        }

        if(!frontRightTire.roll()) {
            stop();
            runResult = frontRightTire.location;
        }

        if(!backLeftTire.roll()) {
            stop();
            runResult = backLeftTire.location;
        }

        if(!backRightTire.roll()){
            stop();
            runResult = backRightTire.location;
        }
        return runResult;
    }

    public void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }

}
