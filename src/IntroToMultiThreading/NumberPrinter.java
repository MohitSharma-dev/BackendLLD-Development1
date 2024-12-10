package IntroToMultiThreading;

public class NumberPrinter implements Runnable{
    private int noToPrint;

    NumberPrinter(int noToPrint){
        this.noToPrint = noToPrint;
    }

    @Override
    public void run() {
        System.out.println("Number : " + noToPrint + " Thread : " + Thread.currentThread().getName()) ;
    }
}
// run method doesn't take any argument
