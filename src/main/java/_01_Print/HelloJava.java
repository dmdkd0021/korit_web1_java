package _01_Print;

public class HelloJava { // HelloJava 클래스 시작
    // 주석 : 코드 설명 용도로 사용됨. -> 인간이 읽으라고 적는 것(컴파일러가 안 읽음)
    /*
    1. 자바는 객체지향언어 -> class 위주의 설계, 메모리 관리, 코드 작성
    2. 자바는 컴파일 과정을 거친다.
    .java(우리가 작성한 코드) -> .class(바이트코드) -> OS(윈도우, 맥) 호출 -> 출력
     */

    // main은 자바 프로그램의 현관문!
    // 자바는 main이라는 현관문을 통해 외부와 출입한다.
//    public static void main(String[] args) { // 메인 시작
//        System.out.println("Hello World!"); // 세미콜론 : 코드 끝
//
//    } // 메인 끝
    public static void main(String[] args) {
        // 실습) 콘솔창에
        /*
        이름: 내 이름
        나이: 내 나이
        주소: 지역
         */
        System.out.println("이름: 손주아");
        System.out.println("나이: 21");
        System.out.println("주소: 창원");
    }

} // 클래스 끝
