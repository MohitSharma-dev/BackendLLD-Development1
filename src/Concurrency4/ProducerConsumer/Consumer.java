package Concurrency4.ProducerConsumer;

public class Consumer implements Runnable{
    private Store store;

    Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(true){
//           currSize =  2, Number of consumer on line 14 = 8
            if(store.getItems().size() > 0){
                store.removeItem();
            }
        }
    }
}
