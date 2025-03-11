package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        SoundAnimal(dog);
        SoundAnimal(cat);
        SoundAnimal(caw);
    }

    private static void SoundAnimal(InterfaceAnimal interfaceAnimal) {
        System.out.println("동물 소리 테스트 시작");
        interfaceAnimal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
