package re1.array;

public class MovieMain {
    public static void main(String[] args) {
        Movie m1 = new Movie("인셉션","인생은 무한 루프");
        Movie m2 = new Movie("어바웃 타임","인생 시간 영화!");

        Movie[] movies = new Movie[]{m1, m2};

        for (Movie m : movies) {
            System.out.println("영화 제목: " + m.title + ", 리뷰:" + m.review);
        }
    }
}
