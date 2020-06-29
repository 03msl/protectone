package com.msl.java.day11;
//懒汉式
public class Singleton1 {

    private Singleton1() {
    }

    private static Singleton1 instance = null;
//当两个线程同时访问这这个方法时 instance 被构建了两次
    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
class Singeleton2{
    private Singeleton2(){}
    private static  Singeleton2 instance = null;
    public static Singeleton2 getInstance() {
        if (instance == null) {
            synchronized (Singeleton2.class) {
                if (instance == null) {
                    instance = new Singeleton2();
                }
            }
        }
                return instance;
            }
        }
