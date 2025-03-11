package poly.ex5;

public class Cat implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    public void move() {
        System.out.println("나용이 이동");
    }
}
