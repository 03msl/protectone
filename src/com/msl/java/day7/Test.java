package com.msl.java.day7;

import java.util.Date;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        new Eat().start();
        new Drink().start();

    }
}
     class Drink extends Thread {
        @Override
        public void run() {
            System.out.println("开始吃饭  " + new Date());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束吃饭  " + new Date());
        }

    }
     class Eat extends  Thread{
        @Override
        public void run() {
            System.out.println("开始喝酒  " + new Date());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束喝酒  " + new Date());
        }
    }
