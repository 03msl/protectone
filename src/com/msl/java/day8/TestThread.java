package com.msl.java.day8;

import com.msl.java.day7.Test;

/**
 *
 */
public class TestThread {
    static  final  int distance = 200;
    static  String winner;

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tortoise tortoise = new Tortoise();
        new Thread(rabbit).start();
        new Thread(tortoise).start();
        System.out.println("开始赛跑，兔子跑起来了！");
    }
}
class  Rabbit implements Runnable{
private  int speed = 5;
private  int r_distance = 0;
private boolean sleep = false;
    @Override
    public void run() {
        while (TestThread.winner == null){
            r_distance += speed;
            System.out.println("兔子跑了" + r_distance + "米");
            try {
                Thread.sleep(50);
                if(r_distance >= 100 && !sleep){
                    System.out.println("兔子跑累了，兔子在睡觉");
                    Thread.sleep((long)(Math.random()*10000));
                    System.out.println("兔子醒了，以为乌龟在后面，速度减慢了");
                    speed = 3;
                    sleep = true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(r_distance >= TestThread.distance){
                TestThread.winner = "兔子";
                System.out.println(  "胜利!");
            }

        }

    }
}
class Tortoise implements Runnable{
    private int speed = 2;
    private int t_distance = 0;

    @Override
    public void run() {
        while (TestThread.winner == null){
            t_distance += speed;
            System.out.println("乌龟跑了" + t_distance + "米");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(t_distance >= TestThread.distance){
                TestThread.winner = "乌龟";
                System.out.println(TestThread.winner + "胜利!");
            }
        }

    }
}
