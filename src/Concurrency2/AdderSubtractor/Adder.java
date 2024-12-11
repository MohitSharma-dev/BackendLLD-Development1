package Concurrency2.AdderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;

    Adder(Value value) {
        this.value = value;
    }
    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 10000; i ++){
            value.setVal(value.getVal() + i);
        }
        return null;
    }
}
