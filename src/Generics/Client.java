package Generics;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Pair pair = new Pair();
//        String, double
        pair.setFirst("Mohit");
        pair.setSecond(20.0);

//        No type safety
        pair.setFirst(125);

        GenericPair<String, Integer> indiaPop = new GenericPair<>();
        indiaPop.setFirst("India");
        indiaPop.setSecond(20);

//        Compile time type safety is present
//        indiaPop.setFirst(25);
//        Double d = indiaPop.getFirst();

//        you are allowed to not mention anything
//        this is for backward compatibility : Raw types
        GenericPair gp = new GenericPair();

//        tie S to String
        String d2  = GenericPair.doSomething("Mohit", "Sharma");
        Integer d1 = GenericPair.<String, Integer>doSomething("Mohit", 2);


        Animal animal = new Animal();
        animal.setName("Animal1");
        Mammal mammal = new Mammal();
        mammal.setName("Mammal1");
        Dog dog = new Dog();
        dog.setName("Dog1");
        Cat cat = new Cat();
        cat.setName("Cat1");

        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(mammal);
        animals.add(dog);
        animals.add(cat);

        AnimalUtility.printAnimalNames(animals);


        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog);

        AnimalUtility.printAnimalNames(dogs);
    }
}
