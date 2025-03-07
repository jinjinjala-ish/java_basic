package poly.ex2;

public class AnimalSoundMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animal = new Animal[]{dog, cat, caw};

        for (Animal animal1 : animal) {
            System.out.println("시작");
            animal1.sound();
            System.out.println("종료");
        }
    }
}

