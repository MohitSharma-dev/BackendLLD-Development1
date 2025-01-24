package Decorator;

public class Milk extends AddOn {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return 25 + beverage.getCost();
    }

    @Override
    public void getDesc() {
        beverage.getDesc();
        System.out.println("Added Milk");
    }
}
