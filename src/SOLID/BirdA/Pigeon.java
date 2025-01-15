package SOLID.BirdA;

public class Pigeon extends Bird implements Flyable{
    @Override
    void makeSound() {
        System.out.println("Pigeon makesound");
    }

    @Override
    public void fly() {
//        code duplication
        System.out.println("Fly Low");
    }
}
