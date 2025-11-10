package _20_OOP;

public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("친구1");
        Friend friend2 = new Friend("친구2");
        Friend friend3 = new Friend("친구3");

        Person person = new Person("홍길동", 20, 3);
        // Person? 클래스(타입, 자료형)
        // persosn? 인스턴스, 객체 - 클래스로부터 생성된 객체
        person.sefFriend(friend1); // person 객체가 friend1 객체를 알게 됨
        person.sefFriend(friend2); // person 객체가 friend2 객체를 알게 됨
        person.sefFriend(friend3); // person 객체가 friend3 객체를 알게 됨
    }
}
