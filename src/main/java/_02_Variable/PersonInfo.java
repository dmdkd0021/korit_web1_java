package _02_Variable;

public class PersonInfo {
    // 실습
    /*
        아래의 데이터를 적절한 자료형과 변수명으로 저장하고,
        각 변수들을 콘솔에 출력해 주세요.
        변수를 출력해 주세요
        1. 이름, 2. 출생년도, 3. 키(소숫점 포함), 4. 혈액형, 5. 학생여부(true/false)
     */
    public static void main(String[] args) {
        String name = "손주아";
        int age = 2005;
        float height = 165.0F;
        char blood = 'B';
        boolean isStudents = true;
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(blood);
        System.out.println(isStudents);
    }
}
