package Concurrency3.AdderSubtractorLock;

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
        lock.lock();
        for(int i = 1; i <= 100; i ++){
//            lock.lock();
            System.out.println("Subtracting : " + i);
            value.setVal(value.getVal() - i);
//            lock.unlock();
        }
        lock.unlock();
        return null;
    }
}
