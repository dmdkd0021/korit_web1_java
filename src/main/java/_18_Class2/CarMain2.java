package _18_Class2;

public class CarMain2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 0;
        car.isEngineOn = false;

        // 시동 걸기
        car.engineStart(); // 객체의 상태(필드값)을 메서드로 접근하여 변경
        car.accelerate();
        car.accelerate();
        car.brake();
        car.showStatus();
        car.engineStop();

        // 객체(주어) + 동사(메서드) -> 가독성이 좋아진댜
        // 자동차.엑셀밟기(), 자동차.브레이크밟기() 이런 느낌...

        // 객체지향 프로그래밍에서 가장 중요한 것
        // 객체의 상태값을 검증할 수 있다. -> 문법적으로 강제하쟈!
        /*
        1. 캡슐화 - 데이터의 속성과 메서드를 하나의 캡슐에 담는 것
                 - **상태값을 주소로 접근하는 것을 막는 것(검증되지 않은 값들이 함부로 들어오지 못하게)**
        2. 추상화(나중)
        3. 상속(나중)
        4. 다형성(나중)
         */
    }
}
