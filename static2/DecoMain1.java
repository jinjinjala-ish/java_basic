package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 d = new DecoUtil1();
        String deco = d.deco(s);
        System.out.println(deco);
    }
}
