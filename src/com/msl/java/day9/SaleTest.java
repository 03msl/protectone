package com.msl.java.day9;


public class SaleTest {
    public static void main(String[] args) {
        SaleTicket sa = new SaleTicket();
        new Thread(sa).start();
        new Thread(sa).start();
        new Thread(sa).start();
    }
}
