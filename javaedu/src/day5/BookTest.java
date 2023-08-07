package day5;

class Book {
    String title; // 책이름
    String author; // 저자
    int price; // 가격

    // 아규먼트를 받지 않는 생성자가 호출될 떄
    public Book() {
        this.title = "혼자공부하는자바";
        this.author = "신용권";
        this.price = 24000;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getBookInfo() {
        return "책이름: " + title + ", 저자: " + author + ", 가격: " + price + "원";
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("BOOK2", "AUTHOR2", 25000);
        Book book3 = new Book("BOOK3", "AUTHOR3", 26000);
        Book book4 = new Book("BOOK4", "AUTHOR4", 27000);
        Book book5 = new Book("BOOK5", "AUTHOR5", 28000);

        System.out.println(book1.getBookInfo());
        System.out.println(book2.getBookInfo());
        System.out.println(book3.getBookInfo());
        System.out.println(book4.getBookInfo());
        System.out.println(book5.getBookInfo());
    }
}