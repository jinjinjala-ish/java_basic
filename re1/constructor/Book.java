package re1.constructor;

public class Book {
    String title;
    String author;
    int page;

    Book(String title, String author, int page) {
        this(title, author);
        this.page = page;
    }
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        page = 0;
    }

    public void displayInfo() {
        System.out.println("제목: " + title + "wjwk: " + author + "vpdlwl" + page);

    }
}
