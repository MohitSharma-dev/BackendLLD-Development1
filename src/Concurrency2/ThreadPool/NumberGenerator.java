package Concurrency2.ThreadPool;

import java.util.concurrent.Callable;

// takes the input number and generate multiple of 5
public class NumberGenerator implements Callable<Integer> {
    int input;

    NumberGenerator(int input) {
        this.input = input;
    }

    @Override
    public Integer call() throws Exception {
        return input * 5;
    }
}
