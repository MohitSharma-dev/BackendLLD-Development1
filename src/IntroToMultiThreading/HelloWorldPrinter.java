package IntroToMultiThreading;

public class HelloWorldPrinter implements Runnable {

    void print(){
        System.out.println("Hello World is printed in " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        print();
    }
}

// Runnable interface has a method called run
// this is the method called by the threads internally
