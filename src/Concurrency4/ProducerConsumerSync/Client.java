package Concurrency4.ProducerConsumerSync;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);


        for(int i = 0; i < 8; i++){
            Producer producer = new Producer(store);
            new Thread(producer).start();
        }

        for(int i = 0; i < 20; i++){
            Consumer consumer = new Consumer(store);
            new Thread(consumer).start();
        }
    }
}
