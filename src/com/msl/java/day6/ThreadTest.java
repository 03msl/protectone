package com.msl.java.day6;

/**
 *多线程创建
 * 重写Thread类的run()
 * 创建Thread类的子类的对象
 * 通过此对象调用start
 */
class MyThread extends  Thread{
    @Override
    public void run() {
        //将创建线程要做的事写在run方法中
        for(int i = 0;i < 100;i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("HELL0");
    }

}
