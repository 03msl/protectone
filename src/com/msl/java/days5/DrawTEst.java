package com.msl.java.days5;

/**
 *
 */
public class DrawTEst {
    public static void main(String[] args) {
        Account acc =new Account("123",0);
        new DrawThread("取钱者",acc,800).start();
        new DepositThread("存款者1",acc,800).start();
        new DepositThread("存款者2",acc,800).start();
        new DepositThread("存款者3",acc,800).start();
    }
}
