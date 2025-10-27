package _18_Class2;

public class CarMain1 {
    public static void main(String[] args) {
        /*
        절차지향 프로그래밍
            객체지향 프로그래밍의 반댓말이 아니댜
            실행 "순서" 중심
        객제지향 프로그래밍
            객체 중심(내부 코드를 숨긴다 - 캡슐화)
            객체간 상호작용 중심
         */

        Car car = new Car();
        car.speed = 0;
        car.inEngineOn = false;

        // 자동차 시동 켜기
        System.out.println("자동차 시동을 켭니다");
        car.isEngineOn = true;

        // 속도 증가
        car.speed += 20;

        // 속도 감속
        car.speed =+100; // 실행은 된다.
        if(car.speed < 0) {
            car.speed = 0;
        }
        System.out.println(car.speed); // 0

        // 객체의 상태(speed, isEngineOn의 값)가 바뀔 때마다
        // 검증하는 코드를 작성해 줘야 한댜
    }
}
