package SOLID.BirdB;

public class Sparrow extends Bird implements Flyable {
    private LowFlying lowFlying;

    Sparrow(){
        lowFlying = new LowFlying();
    }
    @Override
    void makeSound() {
        System.out.println("Sparrow makeSound");
    }

    @Override
    public void fly() {
//
        lowFlying.dofly();
    }
}
