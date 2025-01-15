package SOLID.BirdB;

public class Pigeon extends Bird implements Flyable {
    private LowFlying lf;

    Pigeon(){
        lf = new LowFlying();
    }
    @Override
    void makeSound() {
        System.out.println("Pigeon makesound");
    }

    @Override
    public void fly() {
//        code duplication 
       lf.dofly();
    }
}
