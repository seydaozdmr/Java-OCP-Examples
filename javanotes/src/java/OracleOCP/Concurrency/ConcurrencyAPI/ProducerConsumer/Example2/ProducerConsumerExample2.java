package java.OracleOCP.Concurrency.ConcurrencyAPI.ProducerConsumer.Example2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample2 {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue=new ArrayBlockingQueue<>(10);

        Producer producer=new Producer(blockingQueue);
        Consumer consumer1=new Consumer(blockingQueue);
        Consumer consumer2=new Consumer(blockingQueue);

        Thread producerThread=new Thread(producer);
        Thread consumerThread1=new Thread(consumer1);
        Thread consumerThread2=new Thread(consumer2);

        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();


    }
}
