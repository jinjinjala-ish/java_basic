package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 d1= new Data2("A", counter);
        System.out.println("a count " + counter.count);
        Data2 d2 = new Data2("B", counter);
        System.out.println("a count " + counter.count);
        Data2 d3 = new Data2("C", counter);
        System.out.println("a count " + counter.count);

    }
}
