package chapter03.practice;

public class CarExample {

    public static void main(String[] args) {
        Car car = new Car();

        //Car 클래스의 run 메소드의 반환형은 String

        for(int i=0; i<5; i++) {

            String punk = car.run();

            switch (punk) {
                case "앞왼쪽":
                    System.out.println(punk+" HankookTire로 교체");
                    car.frontLeftTire = new HankookTire(punk, 15);
                    break;
                case "앞오른쪽":
                    System.out.println(punk+" KumhoTire로 교체");
                    car.frontRightTire = new KumhoTire(punk, 15);
                    break;
                case "뒤왼쪽":
                    System.out.println(punk+" HankookTire로 교체");
                    car.backLeftTire = new HankookTire(punk, 15);
                    break;
                case "뒤오른쪽":
                    System.out.println(punk+" KumhoTire로 교체");
                    car.backRightTire = new KumhoTire(punk, 15);
                    break;

            }

            System.out.println("-------------------");
        }
    }

}