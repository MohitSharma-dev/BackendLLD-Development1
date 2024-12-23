package StreamsAndLambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdasClient {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Hello World");
        };

        Runnable task2 = () -> System.out.println("Hello World2");

        Thread t = new Thread(task);
        t.start();

        List<Integer> l =new ArrayList<>();
        l.add(31);
        l.add(22);
        l.add(13);
        l.add(46);
        l.add(5);
//        even numbers should come first , also higher magntiude comes first
//        Instead of separate class, we use lambda expression


        Collections.sort(l, (a , b) -> {
            if(a % 2 == b % 2){
                return b - a;
            } else if (a % 2 == 0){
                return -1;
            } else {
                return 1;
            }
        });

//        () -> {}

    }
}
// with functional interfaces, instead of creating a class, you can
// definition of the method via lambdas

// class R1 {
//    run() {
//        def
//    }
// }