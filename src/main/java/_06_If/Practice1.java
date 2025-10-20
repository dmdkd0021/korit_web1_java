package _06_If;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // 10마넌 이상이면 10% 할인, 아니면 할인 없음
        // 가격에 따라 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("가격을 입력하세요 >>");
        int price = scanner.nextInt();
        scanner.nextLine(); // 엔터 처리용 코드

        if (price >= 100000) {
            // 10% 할인 코드 작성
            double discountPrice = price * 0.9;  // 정수 * 실수 -> 타입변환
            System.out.println("최종 가격 : " + discountPrice);
        } else {
            // 아무런 할잉 없음
            System.out.println("최종 가격 : " + price);
        }

        // 실습 2) 로그인
        String realId = "java";
        String realPW = "1234";

        // 사용자 입력
        System.out.println("아이디 입력 : ");
        String inputId = scanner.nextLine();

        System.out.println("패스워드 입력 : ");
        String inputPW = scanner.nextLine();

        // 입력값과 실제값 비교 ->
        // 아이디 패스워드가 일치할 경우에 "로그인 성공" 출력
        // 아이디 패스워드가 둘 중 하나라도 일치 X -> "로그인 실패" 출력

        // == 연산자는 String 자료형 비교시 사용
        boolean isValidId = inputId.equals(realId);
        boolean isValidPW = inputPW.equals(realPW);
        boolean isValidLogin = isValidId && isValidPW;

        if (isValidLogin) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }






    }
}
