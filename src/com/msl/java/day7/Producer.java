package com.msl.java.day7;

import com.msl.java.day2.protect.GeometricTest;

import java.util.concurrent.BlockingQueue;

/**
 *
 */
public class Producer extends Thread {
    public BlockingQueue<String> bq;
    public Producer(BlockingQueue<String> bq){
        this.bq = bq;
    }

    @Override
    public void run() {
        String[] strArr = new String[]{
                "Java","Struts","Spring"
        };
        for(int i = 0;i < 99999999; i++){
            System.out.println(getName() + "生成者准备生产元素!");
            try {
                Thread.sleep(200);
                bq.put(strArr[i % 3]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "生产完成: " + bq);
        }
    }
}
