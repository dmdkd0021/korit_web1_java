package _05_String;

import java.util.Scanner;

public class PersonalNumber {
    public static void main(String[] args) {
        String pn = "991122-1234567";
        String birthDate;
        String genderCode;

        // 1. 앞 6자리만 추출(생년월일)
        // 2. 성별코드(뒷자리 첫 번째 숫자)
        // 출력

        birthDate = pn.substring(0,6); // 0-5 index 문자열 추출

        int dashIndex = pn.indexOf("-"); // dash의 index를 찾는댜
        birthDate = pn.substring(0, dashIndex); // 0-대시 직전까지의 문자열을 추출하랗

        genderCode = pn.substring(dashIndex + 1, dashIndex + 2); // 성별코드


        System.out.println("이메일을 입력하세요 >>");
        Scanner scanner = new Scanner(System.in); // 객체 생성
        String email = scanner.nextLine();

        boolean isValidEmail;
        String username;
        String domeinName;

        // 1. 입력한 이메일이 유효한가 - "@" 있는가? "." 있는가?
        // 2. 사용자 아이디 추출
        // 3. 도메인(naver, google) 추출

        boolean hasAt = email.contains("@");
        boolean hasDot = email.contains(".");

        isValidEmail = email.contains("@") && email.contains (".");

        int atIndex = email.indexOf("@");
        username = email.substring(0, atIndex);

        String ramain = email.substring(atIndex + 1); // @ 이후부터 끝까지 가져옴
        int dotIndex = ramain.indexOf("."); // 잘라온 것에서 "." 위치를 찾음
        domeinName = ramain.substring(0, dotIndex); // 잘라온 것에서 "." 직전까지

        System.out.println("유효한가요? " + isValidEmail);
        System.out.println("아이디 : " + username);
        System.out.println("도메인 : " + domeinName);

        scanner.close();



    }
}
