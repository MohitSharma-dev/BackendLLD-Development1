package Decorator;

public class Client {
    public static void main(String[] args) {
        Beverage b = new Decaf();
        System.out.println("Description of current Beverage");
        b.getDesc();

        b = new Milk(b);
        System.out.println("Description of current Beverage");
        b.getDesc();

        b = new ChocoChip(b);
        System.out.println("Description of current Beverage");
        b.getDesc();
    }
}