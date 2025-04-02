package re1.extends1;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "HAN","12345");
        Album album = new Album("ALBUM1", 15000,"SEO");
        Movie movie = new Movie("movie1", 18000,"감독1","배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);

    }
}
