package _31_NestedClass.anonymous;

public class Main {
    public static void main(String[] args) {
        /*
        익명 클래스(*중요*) - 람다와 이어진댜
        - 이름이 없는 클래스,
        - new(생성)과 동시에 정의를 같이 해준댜
        - 한번 쓰고 버릴 클래스
         */
        // 추상메서드를 모두  구현하라! (정의)
        // 추상 메서드 구현(정의)
        // -> new (Hello 인터페이스의 인스턴스가 아니댜!, 익명1, 익명2)
        // -> Hello 타입변수에 대입 (캐스팅) - 항상 업캐스팅된 상태
        Hello hello = new Hello() { // Hello 클래스의 인스턴스가 아니댜!(익명, 어떤 클래스의 인스턴스인지 모름)
            @Override
            public void bye() {
                System.out.println("안녕히 계세요");
            }

            @Override
            public void hello() {
                System.out.println("안녕하세여");
            }
        };

        System.out.println(hello.getClass().getName());

        // 실제 만들어진 객체타입은 익명타입이다
        // 항상 업캐스팅 되어진 상태로만 사용 가능하다
        Character character = new Character("마스터", 999, )
                @Override
    }
}
