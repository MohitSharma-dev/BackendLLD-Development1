package SOLID.BirdA;

public abstract class Bird {
    String type;
    int noOfWings;

    void eat(){
        System.out.println("Bird is eating");
    }

    abstract void makeSound();
}
