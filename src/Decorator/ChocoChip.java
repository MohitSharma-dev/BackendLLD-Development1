package Decorator;

public class ChocoChip extends AddOn{
    private Beverage beverage;

    public ChocoChip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void getDesc() {
        beverage.getDesc();
        System.out.println("Added Choco Chip");
    }

    @Override
    public int getCost() {
        return 5 + beverage.getCost();
    }
}
