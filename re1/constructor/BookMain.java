package re1.constructor;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book(",",",");
        book1.displayInfo();
        Book book2 = new Book("Hello java","Seo");
        book2.displayInfo();
        Book book3 = new Book("jpa program","kim",700);
        book3.displayInfo();
    }
}
