package com.msl.java.day7;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 */
public class BlockingQueueTest {
    public static void main(String[] args) {
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(1);
        new Producer(bq).start();
        new Producer(bq).start();
        new Producer(bq).start();
        new Consumer(bq).start();
    }
}
