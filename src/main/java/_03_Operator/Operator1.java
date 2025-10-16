package _03_Operator;

public class Operator1 {
    public static void main(String[] args) {
        /*
        연산자 : 계산을 수행하는 기호
        // 3 + 4 // "+"가 연산자, 3, 4는 피연산자
        // a + b // "+"가 연산자, a, b는 피연산자
         */

        // 산술연산자(+, -, *, /, %) : 사칙연산
        int num1 = 1;
        int num2 = 2;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num2 / num1);

        // 나머지 연산 - 1 / 2 -> 몫0 나머지1
        System.out.println(num1 % num2);

        int even1 = 128;
        // % 2를 했을 때 나머지가 있으면 홀수 없으면 짝수
        System.out.println(even1 % 2);

        // 비교연산자 - 결과값이 boolean 타입
        System.out.println(num1 == num2); // 같은지
        System.out.println(num1 != num2); // 다른지
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 >= num2);

        // 실습1) 오후 22시에서 50시간을 더하면 몇 시인지 구하세요
        // System.out.println((22 + 50) % 24); // 나는 이건줄 알았음
        int now = 22;
        int after50hour = now + 50 % 24; //괄호 -> 우선연산
        System.out.println(after50hour);

        // 실습2) x개의 게시물이 있다.
        // 게시글은 한 페이지에 20개씩 표시된다.
        // 총 몇 페이지가 나올지 논리적으로 설계해 주세욥
        // x를 20으로 나누고 나머지가 0이 아니면 1을 더하고 나머지가 0이면 그대로
        // (x % 20) == 0 의 결과가 true -> x / 20
        // (x % 20) == 0 의 결과가 false -> (x / 20) + 1이 총 페이지 수

    }
}
