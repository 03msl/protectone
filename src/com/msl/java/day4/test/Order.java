package com.msl.java.day4.test;



public class Order {
    private  Order(){
    }
    private  static  Order instance = null;
    public static  Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}
