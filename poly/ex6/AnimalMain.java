package poly.ex6;

public class AnimalMain {
    public static void main(String[] args){
        Dog dog = new Dog();
        Chicken chicken = new Chicken();
        Bird bird = new Bird();

        animalSound(dog);
        animalSound(chicken);
        animalSound(bird);

        flyAnimal(chicken);
        flyAnimal(bird);

    }

    public static void animalSound(AbstractAnimal abstractAnimal){
        System.out.println("동물 소리 시작");
        abstractAnimal.sound();
        System.out.println("동물 소리 종료");
    }

    public static void flyAnimal(Fly fly){
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }
}
