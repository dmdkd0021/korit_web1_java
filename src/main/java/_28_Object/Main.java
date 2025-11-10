package _28_Object;

public class Main {
    public static void main(String[] args) {
        /*
        Object 클래스 - 자바의 모든 클래스의 최상위 부모 클래스
        모든 클래스는 Object를 상속받고 있다.
        -> Object가 가진 메서드를 사용할 수 있다.
        1. toString()
        2. equals()
        3. hashCode()
        */


        ObjectStudent st1 = new ObjectStudent("홍길동", 20);
        // printf(), println() ->
        // 1. 원시값을 문자열로 변환해서 출력
        // 2. 객체들은 .toStr: 미리 누군가가 toString()을 오버라이딩 해놓은 것
        // pringln 내무에서는 toString()을 호출하고 있음
        // 호출당하는 객체마다 서로 다른 결과 -> 다형성,
        System.out.println(st1);

    }
}