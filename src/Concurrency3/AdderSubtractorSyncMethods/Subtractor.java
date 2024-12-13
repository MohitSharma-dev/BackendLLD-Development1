package Concurrency3.AdderSubtractorSyncMethods;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value value;
    private Lock lock;
    Subtractor(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }
    @Override
    public Void call() throws Exception {

        for(int i = 1; i <= 100; i ++){
//            lock.lock();

                System.out.println("Subtracting : " + i);
                value.incrementBy(-i);
//            lock.unlock();
        }
        return null;
    }
}
