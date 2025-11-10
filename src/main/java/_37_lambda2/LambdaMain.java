package _37_lambda2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMain {
    public static void main(String[] args) {
        // 메서드를 객체처럼 다루고 싶댜
        // 자바는 메서드가 단독으로 객체처럼 값이나 변수에 할당 불가능
        // -> 익명클래스의 객체를 쓰쟈!!(익명클래스는 포장지, 본체는 메서드)

        // 익명클래스를 포장지로 사용한 예시
        // add : Calculator 인터페이스를 이식(implements)받은 익명클래스 객체를 담은 변수
        Calculator add = new Calculator() { // 업캐스팅된 상태(실제 객체는 Calculator의 객체가 아님)
            @Override
            public int calculate(int number1, int number2) {
                return number1 + number2;
            }
        };

        // 생략이 가능하댜
        // Calculator 인터페이스에 선언된 추상 메서드가 하나밖에 없기 때문에
        // -> 시그니처 특정이 가능
        // 시그니처부분(메서드명, 매개변수타입, 리턴타입) 생략
        // 한줄로 리턴이 가능할 때만 중괄호 + return 키워드 생략 가능
        Calculator lambdaAdd = (num1, num2)  -> num1 + num2;

        // Modifier를 이식받아서 Integer -> String
        // 매개변수가 하나면 ()도 생략 가능(하나일 때만 가능)
        Modifier<Integer, String> numToString = (num) -> "" + num;
        System.out.println(numToString.modify(10)); // 문자열 10으로 변경됨

        List<String> names = List.of("홍길동", "김길동", "박길동", "이길동");
        // Modifier를 사용해서 names에 있는 이름들 뒤에(addNim)
        // "~님"으로 추가해서 nims에 담아주세요
        List<String> nims = new ArrayList<>();
        Modifier<String, String> addNim = name -> name + "님";

        for(String name : names) {
            String modifiedName = addNim.modify(name);
            nims.add(modifiedName);
        }

        // 제너릭 함수형인터페이스를 선언하니까
        // 많은 비슷한 역할의 인터페이스 중복을 피할 수 있녜~~
        // "표준" 함수형 인터페이스 -> stream API에서 사용하게 될 거시다.
        /*
        1. Function<T, R> : T를 받아서 R로 리턴(변환)
        2. Consumer<T> : T를 받아서 void(return 없음) (출력, 저장)
        3. Supplier<T> : 매개변수 X, T 타이블 생성(new)
        4. Predicate<T> : T를 받아서 boolean 반환(조건검사)
         */

        // Function<T, R> / 메서드시그니처 : R apply(T,t)
        Function<String, String> addNim2 = name -> name + "님";
        System.out.println(addNim.modify("이순신"));
        System.out.println(addNim2.apply("이순신"));

        // 인터페이스명 : Consumer<T> / 메서드시그니처 : void accept(T t)
        Consumer<String> printer = msg -> System.out.println(msg);
        printer.accept("람다로 만든 프린터예요!");

        // 인터페이스명 : Supplier<T> / 메서드시그니처 : T get() -> 매개변수 없고 return type만 존재
        // 객체생성, 커스텀에러(객체) 생성
        Supplier<String> anyName = () -> "아무개"; // 소괄호 생략 불가능
        System.out.println(anyName.get());

        // 인터페이스명 : Predicate<T> / 메서드시그니처 : boolean test(T t)
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(10));

        // addNim2 -> 메서드를 변수에 담는 것처럼 보임
        // 실제로는 익명클래스 객체에 포장된 메서드
        // 매개변수에 인라인으로 메서드를 정의하면서 전달
        test(name -> name + "님", "홍길동");

        // 실습)
        // 1. 이름이 3글자 이상인지 검사하는 Predicate 구현체 구현
        // 2. test2()에 "구마유시", Predicate 구현체를 전달해서 작동
        // 변수에 담아서!!
        Predicate<String> isOver3Name = name -> name.length() > 3;
        test2(isOver3Name, "구마유시");

    }

    // test같이 표준 함수형 인터페이스를 매개변수로 받는 표준 함수(stream에서 출현)
    public static void test(Function f, String name) {
        System.out.println(f.apply(name));

    }

    public static void test2(Function f, String name) {
        System.out.println(f.apply((name)));
    }
}
