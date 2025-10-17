package _06_If;

public class If {
    public static void main(String[] args) {
        /*
        if (boolean 데이터 - 비교 or 논리연산식) {
            // true일 때 실행되는 코드
        }
         */

        int height = 130;
        int age = 23;
        if (height >= 120) {
            System.out.println("탑승 가능");
        }

        if (height >= 120 && age < 14) {
            System.out.println("탑승 가능");
        }

        // if ~ else if ~ else
        // 하나의 조건이 만족되면, 나머지는 검사를 하지 않는댜.
        // 단 하나의 블록만 실행됨

        age = 15;

        // 코드는 위에서 아래로 읽는댜.
        // 오름차순, 내림차순으로 작성해야 한댜.
        // else if 조건이 검사되는 경우 : 위의 조건들이 모두 false였댜.
        if (age <= 7) {
            System.out.println("미취학 아동");
        } else if (age <= 13) { // age > 7
            System.out.println("초등학생");
        } else if (age <= 16) { // age < 7 and age > 13
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        boolean isLogin = false; // 로그인 되었는가?
        boolean isBanned =  true; // 가입된 계정이 밴 계정인가?

        if (!isLogin) { // 로그인 안되었을 대 실행
            System.out.println("로그인이 필요합니댜.");
        } else if (isBanned) { //로그인이 되었다고 가정하고 실행해야 함
            System.out.println("정지된 계정입니댜.");
        }

        // 등급제, 권한
        boolean isClient = true;

        // 실행할 때는 순서 상관 X, 유지보수 측면에서 오름, 내림차순이 편함
        boolean isVIP = false;
        boolean isGOLD = true;
        boolean isSILVER = false;

    }
}
