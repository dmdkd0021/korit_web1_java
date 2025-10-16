package _02_Variable;

public class Variable {
    public static void main(String[] args) {
        // 변수 사용 이유
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        // "hello" -> "world!" 변경
        // 노가다 -> 변수를 통해 특정 값 저장(Ram - 주기억장치)
        // ram에 데이터를 저장하는 행위

        // 변수 선언(빈 박스 생성)
        // 변수 선언(ram에 메모리주소를 지정했다)
        // 자료형 변수명
        String greeting;

        // 변수 초기화
        // "="은 같다는 의미 아님
        // 우변의 데이터를 좌변의 변수에 저장하겠다
        greeting = "hello";

        // 변수 선언 및 초기화
        String academy = "Korea IT";

        // 변수 재할당(이전에 있던 Hello는 사라짐)
        greeting = "World!";

        // 여러 개를 한번에 선언 및 초기화
        String city = "부산", name = "dmdkd";

        /*
        명명법
        1. 필수 규칙
            String 1name // 숫자로 시작할 수 없다.
            String my name // 공백을 포함할 수 없다.
            Srting class
            String if // 자바 예약어(이미 문법으로 정해진 것들) 금지
        2. 관례(국룰)
            파스칼 표기법 LastName, PascalCase - 띄어쓰기 하고 첫 글저를 대문자로, 보통 클래스명, 파일명
            카멜 표기법 lastName, pascalCase - 첫글자 소문자 띄어쓰기 첫 글자 대문자, 보통 변수명, 함수(메소드)명
        3. 매너
            의미없는 변수명을 사용하지 말자
            bad ex) num1, a, b, c, temp(tmp, t)
            good ex) 현재 쇼핑카트에 담긴 물품 개수
                    numberOfItemsCurrentlyInShoppingCart // ㅋㅋㅋㅋㅋㅋㅋㅋ 진짜 상관없다 함
         */
    }
}
