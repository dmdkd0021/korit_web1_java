package _31_NestedClass.nested;

// User 클래스에 빌더패턴을 적용시켜 쥬세요!!!
// -> 내부 정적 클래스(Builder)를 만들어서 필드 포기화를 맡겨야겟댜!!
// 1. static 메서드로 내부 정적 클래스 객체 생성
// 2. 메서드체이닝
// 3. 다 완성한 필드 구성은 바깥 클래스 생성자로 가져와야겠댜!!!

public class User {

    private String username;
    private String name;
    private String email;
    private String address;

    private User(Builder builder) {
        this.username = builder.username;
        this.name = builder.name;
        this.email = builder.email;
        this.address = builder.address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String username;
        private String name;
        private String email;
        private String address;
    }

    public User username(String username) {
        this.username = username;
        return this;
    }
}
