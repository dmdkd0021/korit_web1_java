package _07_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // 형변환 : 데이터 타입을 다른 타입으로 변경하는 것
        // 자료형 크기
        // 큰 -> 작은 : 넘칠 수 있다 -> 데이터 유실 가능성 존재
        // 작은 -> 큰 : 안전하3댜 -> 데이터 유실 가능성이 없댜.(자동 형변환)

        // 작은 -> 큰(자동 형변환)
        int intValue = 10;
        long longVaslue;
        double doubleValue;

        longVaslue = (long)intValue; // 140L로 자동 변환
        doubleValue = intValue ;// 10.0으로 자동 변환

        // 큰 -> 자근
        doubleValue = 1.5;
        intValue = (int) doubleValue; // 명시적 형변환
        System.out.println(intValue); // 1.5 -> 1 : 데이터 유실

        // 다른 타입끼리 연산할 때 형변환
        // 규칙 : 더 큰 범위 타입으로 자동 변환 후 연산
        intValue = 1;
        doubleValue = 1.5;
        // double이 더 큰 자료형이라서 자동으로 결과가 double로 변환
        System.out.println(intValue + doubleValue);

        // 평균 연산
        int kor = 80;
        int eng = 90;
        int math = 90;
        // 3 말고 3.0(실수)로 연산해서 소숫점 아래를 살려준댜.
        System.out.println((kor + eng + math) / 3.0);

        // 문잗열 -> 숫자
        int i = Integer.parseInt("34"); // parseInt : 문자열을 숫자로 바꿀 때 사용
        System.out.println(i + 1);
        double d = Double.parseDouble("34.44");
        System.out.println(d + 0.1);



    }
}
