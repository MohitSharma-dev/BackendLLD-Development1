package SOLID.BirdA;

public class Sparrow extends Bird implements Flyable{
    @Override
    void makeSound() {
        System.out.println("Sparrow makeSound");
    }

    @Override
    public void fly() {
        System.out.println("Fly Low");
    }
}
