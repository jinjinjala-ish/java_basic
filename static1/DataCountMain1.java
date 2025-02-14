package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 d = new Data1("a");
        System.out.println("a count = " + d.count);
        Data1 d2 = new Data1("b");
        System.out.println("b count = " + d.count);
        Data1 d3 = new Data1("c");
        System.out.println("c count = " + d.count);
    }
}
