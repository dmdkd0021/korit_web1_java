package _20_OOP.book;

public class Book {
    String title; // 책 제목
    String author; // 책 저자

    // 생성자 : 멤서드랑 비슷하지만 리턴 타입 X 이름은 클래스와 동일해야 한다.
    // title과 author를 초기화하는 생성자를 만들어 주세요.


    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String toString() {
        String bookInfo = "제목 : " + title + ", 저자 : " + author;
        return bookInfo;
    }
}

// 알트 인서트 누르면 생성자 바로 만들 수 이써!!