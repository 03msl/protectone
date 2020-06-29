package com.msl.java.days5;

/**
 *
 */
public class Account {
    private String accountNO;
    private double balance;
    private boolean flag = false;
    public Account(){
    }

    public String getAccountNO() {
        return accountNO;
    }

    public void setAccountNO(String accountNO) {
        this.accountNO = accountNO;
    }

    public Account(String accountNO, double balance){
        this.accountNO = accountNO;
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }
    public synchronized  void draw(double drawAmount){
        try {
            if(!flag){
                wait();
            }
        else {
            System.out.println(Thread.currentThread().getName()+"取钱:"+drawAmount);
            balance-=drawAmount;
            System.out.println("账户余额为:"+balance);
            flag = false;
            notifyAll();         }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void deposite(double depositeAmount){
        try {
            if(flag){
                wait();
            }
            else {
                System.out.println(Thread.currentThread().getName()+"存款: "+depositeAmount);
                balance+=depositeAmount;
                System.out.println("账户余额为: " + balance);
                flag=true;
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
