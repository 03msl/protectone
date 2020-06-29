package com.msl.java.day8;

/**
 *
 */
public class Synchronizedtest {
    public void add(){
        for(int i = 0;i < 0; i++){
            System.out.println(i);}

    }
}
class A extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        }
    }