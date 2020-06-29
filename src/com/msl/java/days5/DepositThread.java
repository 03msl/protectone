package com.msl.java.days5;

/**
 *
 */
public class DepositThread extends Thread {
    private Account account;
    private double depositeAmount;
    public DepositThread(String name, Account account,double depositeAmount){
        super(name);
        this.account=account;
        this.depositeAmount=depositeAmount;
    }

    @Override
    public void run() {
        account.deposite(depositeAmount);
    }
}
