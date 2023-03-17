package chapter03;

public class Car1 {

    // 필드 또는 멤버변수
    String company = "현대자동차";
    String model = "그렌져";
    String color = "black";
    int maxSpeed = 350;
    int speed;

    Car1() {}

    Car1(String model) {
        this.model = model;
    }
    Car1(String color, int cc) {
        this.color = color;
        this.maxSpeed = cc;
    }
    Car1(String model, String color, int cc) {
        this.model = model;
        this.color = color;
        this.maxSpeed = cc;
    }

}