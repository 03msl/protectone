package com.msl.java.day6;

/**
 *
 */
public class DrawTest {
    public static void main(String[] args) {
        Account acct = new Account("10001",1000);
        new DrawThread("甲",acct,800).start();
        new DrawThread("乙",acct,800).start();
    }
}
