package com.msl.java.day9;

/**
 *
 */
public class SaleTicket implements Runnable {
    private int ticket = 20;
    @Override
    public void run() {
        while(true) {
            synchronized (this) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ticket == 1) {
                    --ticket;
                    System.out.println(Thread.currentThread().getName() + "售一张,票售完了");
                    break;
                } else if (ticket == 0) {
                    System.out.println(Thread.currentThread().getName() + "票售完了");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "售一张,还剩:" + (--ticket));
                }

            }
        }
    }
}
