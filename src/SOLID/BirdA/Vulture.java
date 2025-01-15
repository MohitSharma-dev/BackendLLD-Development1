package SOLID.BirdA;

public class Vulture extends Bird implements Flyable{
    @Override
    void makeSound() {
        System.out.println("Vulture MakeSound");
    }

    @Override
    public void fly() {
        System.out.println("Fly High");
    }
}
