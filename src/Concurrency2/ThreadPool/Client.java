package Concurrency2.ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService =  Executors.newCachedThreadPool();

        for(int i = 0; i < 100; i ++){
            if(i == 80){
                System.out.println();
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
            NumberGenerator numberGenerator = new NumberGenerator(i);
            Future<Integer> number = executorService.submit(numberGenerator);

            Integer x = number.get();
//            Thread thread = new Thread(numberPrinter);
//            thread.start();
        }

    }
}

// fixed : No extra threads can be created
// cached : extra thread can be created iff
// there are no ideal threads and there is a waiting task
