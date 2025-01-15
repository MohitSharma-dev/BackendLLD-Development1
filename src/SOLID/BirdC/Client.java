package SOLID.BirdC;

import java.util.Scanner;

public class Client {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("In which way do you want to fly today ?");
        String input = sc.nextLine();
        FlyingBehaviour flyingBehaviour = null;
        if(input.equalsIgnoreCase("High")) {
            flyingBehaviour = new HighFlying();
        } else {
            flyingBehaviour = new LowFlying();
        }
        Sparrow sparrow = new Sparrow(flyingBehaviour);
        sparrow.fly();
    }
}
