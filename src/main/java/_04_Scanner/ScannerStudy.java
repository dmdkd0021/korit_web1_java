package _04_Scanner;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        // 스캐너 - 외부(키보드)에서 데이터를 받아오는"객체"
        // 스캐너 객체 생성(우변에 있는 new) / scanner라는 변수에 대입
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력받기
        // println -> 문자열 출력 이후에 엔터까지 출력
        // print -> 문자열 출력하고, 엔터는 출력하지 X
        System.out.println("문자열을 입력하세요 >>");
        // 엔터키까지 인식해서 데이터를 가져옴
        String myStr = scanner.nextLine();
        System.out.println("입력한 문자열 : " + myStr);

        // 정수 입력받기
        System.out.println("숫자를 입력하세요 >>");
        int myInt = scanner.nextInt(); // 정수만 읽어서 가져옴
        System.out.println("입력한 정수 : " + myInt);

        // 문자열과 정수 두 개를 입력받아보자
        System.out.println("나이를 입력 >>"); // 키보드 입력(I/O버퍼)에서 정수까지만 잘라옴
        // 33 엔터에서 33까지만 가져오고 엔터는 남게 됨

        scanner.nextLine(); // 남아있는 엔터키 제거용

        int age = scanner.nextInt();

        System.out.println("이름을 입력 >>");
        String name = scanner.nextLine(); // 엔터까지 인식
        // 남은 엔터를 먹고 사라짐

        System.out.println("나이 : " + age); // 줄바꿈용
        System.out.println("이름 : " + name);

        scanner.close(); // 스캐너 반납

    }
}
