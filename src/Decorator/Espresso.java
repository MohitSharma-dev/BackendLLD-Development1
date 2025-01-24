package Decorator;

public class Espresso extends Beverage{
    @Override
    public void getDesc() {
        System.out.println("Espresso");
    }

    @Override
    public int getCost() {
        return 50;
    }
}

