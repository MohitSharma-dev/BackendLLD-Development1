package SOLID.BirdC;

public class Sparrow extends Bird implements Flyable {
    private FlyingBehaviour flyingBehaviour;

    Sparrow(FlyingBehaviour flyingBehaviour){
        this.flyingBehaviour = flyingBehaviour;
    }
    @Override
    void makeSound() {
        System.out.println("Sparrow makeSound");
    }

    @Override
    public void fly() {
//
        flyingBehaviour.doFlying();
    }
}
