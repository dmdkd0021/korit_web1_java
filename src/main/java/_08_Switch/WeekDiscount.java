package _08_Switch;

import java.util.Scanner;

public class WeekDiscount {
    public static void main(String[] args) {
        // 요일마다 할인율이 달라진댜!
        // 1. 스캐너를 통해 요일을 입력받는댜
        // 2. switch - case문을 통해 요일마다 다른 할인율 적용
        // 월 10%, 화/수/목 5%, 금 15%, 토/일 20%, 그 외 0%

        /*
        최종 출력
        오늘 : -요일
        정가 : -원
        할인 금액 : -원
        최종 가격 : -원

         */
        int basePrice = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("요일을 입력하세요 : ");
        String week = scanner.nextLine();

        double discount;

        switch (week) {
            case "월요일" :
                discount = 0.9;
                break;
            case "화요일" :
            case "수요일" :
            case "목요일" :
                discount = 0.95;
                break;
            case "금요일" :
                discount = 0.85;
                break;
            case "토요일" :
            case "일요일" :
                discount = 0.8;
                break;
            default:
                discount = 0;
                System.out.println("잘못된 입력입니다");
                break;
        }

        double lastDiscountPricce = basePrice*(1 - discount);
        System.out.println("오늘 : " + week);
        System.out.println("정가 : " + basePrice + "원");
        System.out.println("할인 금액 : " + lastDiscountPricce + "원");
        System.out.println("최종 가격 : " + basePrice * discount);

    }
}
