package IntroToMultiThreading;

import java.util.concurrent.Callable;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t = new Thread(helloWorldPrinter);
        t.start();
        helloWorldPrinter.run();
        System.out.println("Main is executing in " + Thread.currentThread().getName());

        for(int i = 1; i <= 100; i ++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t1 = new Thread(numberPrinter);
            t1.start();
        }
    }
}

// runnable interface

// Print 1 -> 100
// every number in a new thread
// order of printing is not important

// Should I create 100 classes ?

// Callable : return some values
// ExecutorService : ThreadPool
// Adder Subtractor : The issues which can arise in a multithreaded program


