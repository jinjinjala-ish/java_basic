package poly.diamond;

public class Child implements InterfaceB, InterfaceA{
    @Override
    public void methodB() {
        System.out.println("methodB");
    }
    @Override
    public void methodA() {
        System.out.println("methodA");
    }

    @Override
    public void methodCommon() {
        System.out.println("다이아몬드");
    }
}
