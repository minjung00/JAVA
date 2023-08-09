package day6;

class Astract {
    String name; 
    int num;
    String department;
    int salary;
    

    public Astract(String name, int num, String department, int salary) {
        this.name = name;
        this.num = num;
        this.department = department;
        this.salary = salary;
    }

    public String getBookInfo() {
        return "책이름: " + title + ", 저자: " + author + ", 가격: " + price + "원";
    }
}

public class Company {
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