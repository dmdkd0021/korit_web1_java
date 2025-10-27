package _17_Class;

public class Car {
    String brand;
    String model;
    int year;

    public static void main(String[] args) {

        Car car = new Car();

        car.brand = "현대";
        car.model = "소나타";
        car.year = 2023;

        System.out.println(car.brand + "-" + car.model + "-" + car.year + "년식");
    }
}
