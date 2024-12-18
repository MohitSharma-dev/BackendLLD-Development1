package Generics;

import java.util.Collection;
import java.util.List;

public class AnimalUtility {
    public static <T extends Animal> void printAnimalNames(List<T> animals) {
        T firstAnimal = animals.get(0);
        for (T animal : animals){
            System.out.println(animal.getName());
        }
    }


    public static void printAnimal(List<? extends Animal> animals) {
        for (Animal animal : animals){
            System.out.println(animal.getName());
        }
    }

      void addSomeDogs(List<? super Dog> temp) {
//        super is used when we want to insert in a list any type
        temp.add(new Dog());
//            List<Animal> , List<Mammal>
     }

//    void addSomeDogsInAnimalsList(List<Animal> temp) {
////        super is used when we want to insert in a list any type
//        temp.add(new Dog());
////            List<Animal> , List<Mammal>
//    }


}
