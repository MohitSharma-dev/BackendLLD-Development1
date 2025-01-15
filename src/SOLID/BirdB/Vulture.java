package SOLID.BirdB;

public class Vulture extends Bird implements Flyable {
    private HighFlying highFlying;

    Vulture(){
        highFlying = new HighFlying();
    }
    @Override
    void makeSound() {
        System.out.println("Vulture MakeSound");
    }

    @Override
    public void fly() {
//        redundancy has been removed
        highFlying.makefly();
    }
}
