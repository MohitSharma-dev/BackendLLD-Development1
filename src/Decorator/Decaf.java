package Decorator;

public class Decaf extends Beverage {
    @Override
    public void getDesc() {
        System.out.println("Decaf");
    }

    @Override
    public int getCost() {
        return 70;
    }
}
