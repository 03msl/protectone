package com.msl.java.day9;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyReenrantLock implements Runnable{
   private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        for(int i= 0; i < 5; i++){
            System.out.println("当前线程名: "+Thread.currentThread().getName()+" "+i);
        }
        lock.unlock();

    }
}
public class MyLock {
    public static void main(String[] args) {
        MyReenrantLock m = new MyReenrantLock();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);
        t1.start();
        t2.start();
        t3.start();
    }
}
