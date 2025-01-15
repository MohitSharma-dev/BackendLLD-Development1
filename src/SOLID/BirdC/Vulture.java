package SOLID.BirdC;

public class Vulture extends Bird implements Flyable {
    private FlyingBehaviour flyingBehaviour;

    Vulture(){
        flyingBehaviour = new HighFlying();
    }
    @Override
    void makeSound() {
        System.out.println("Vulture MakeSound");
    }

    @Override
    public void fly() {
//        redundancy has been removed
        flyingBehaviour.doFlying();
    }
}
