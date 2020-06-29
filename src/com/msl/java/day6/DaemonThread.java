package com.msl.java.day6;

/**
 *
 */
public class DaemonThread extends Thread {
    private int i;

    public void run() {
        for (; i < 1000; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        DaemonThread t = new DaemonThread();
        t.setDaemon(true);
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " ," + i);
        }
    }
}
