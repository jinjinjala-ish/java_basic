package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        //추상 클래스는 생성 불가능
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();
    }
}
