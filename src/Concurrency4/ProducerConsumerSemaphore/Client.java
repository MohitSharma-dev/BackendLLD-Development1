package Concurrency4.ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);

        Semaphore producerSemaphore = new Semaphore(store.getMaxSize());
        Semaphore consumerSemaphore = new Semaphore(0);

        for(int i = 0; i < 8; i++){
            Producer producer = new Producer(store, producerSemaphore, consumerSemaphore);
            new Thread(producer).start();
        }

        for(int i = 0; i < 20; i++){
            Consumer consumer = new Consumer(store, producerSemaphore , consumerSemaphore);
            new Thread(consumer).start();
        }
    }
}
