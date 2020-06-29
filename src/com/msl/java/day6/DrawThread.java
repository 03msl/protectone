package com.msl.java.day6;

import javax.swing.*;

/**
 *
 */
public class DrawThread extends Thread {
    private Account account;
    private double drawHAmount;

    public DrawThread(String name, Account account, double drawHAmount) {
        super(name);
        this.account = account;
        this.drawHAmount = drawHAmount;
    }

    @Override
    public void run() {
        synchronized (account) {
            if (account.getBalance() >= drawHAmount) {
                System.out.println(getName() + "取钱成功！吐出钞票:" + drawHAmount);
                try {
                      Thread.sleep(2);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
                account.setBalance(account.getBalance() - drawHAmount);
                System.out.println("\t余额为: " + account.getBalance());
            } else {
                System.out.println(getName() + "取钱失败！余额不足！");
            }
        }
    }

}

