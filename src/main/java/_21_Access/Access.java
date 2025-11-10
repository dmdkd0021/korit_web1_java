package _21_Access;

public class Access {
    // 접근 제어자 - 클래스, 메서드, 필드 모두 통일
    /*
    - 접근제어자를 사용하는 이요?
    데이터 보호 : 주소로 직접참조하는 걸 막기 위함 -> 메서드로 접근하게 강제
    왜 메서드로 접근? : 검증된 값만 객체에 할당하려고
    정해진 방법으로만 데이터를 변경하게 하여서 오류를 방지

    - 접근제어자의 종류
    1. public
        가장 개방적, 어디서든 접근 가능("."으로 참조 가능)
        외부에 완전히 공개되는 API 등에 사용

    2. protected
        같은 패키지 내부 && 상속관계일 때만 접근("."으로) 가능

    3. default
        같은 패키지 내부에서만 접근 가능
        접근제어자를 생략할 때의 기본값

    4. private
        가장 제한적, 클래스 내부가 아니면 접근 불가능
        완전히 숨길 수 있음(student.age, student.name... 같은 것들을 불가능하게)
        -> 메서드로 접근(메서드는 public이 되어야 한다)
     */

    // 접근제어자를 생략하면 default가 기본값이 된다.

    private String data;

    public Access(String data) {
        this.data = data;
    }

    public String getData() {
        return data;


    }
}
