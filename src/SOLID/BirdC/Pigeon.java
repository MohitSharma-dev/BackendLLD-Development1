package SOLID.BirdC;

public class Pigeon extends Bird implements Flyable {
    private FlyingBehaviour flyingBehaviour;

    Pigeon(){
        flyingBehaviour = new LowFlying();
    }
    @Override
    void makeSound() {
        System.out.println("Pigeon makesound");
    }

    @Override
    public void fly() {
//        code duplication 
       flyingBehaviour.doFlying();
    }
}
