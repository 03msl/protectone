package com.msl.java.day10;

public class Account {
    private int id;
    private int balance;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }
}

class DrawMoney extends  Thread{
    private Account acc;
    private int drawAmount;

    public DrawMoney(String name,Account acc, int drawAmount) {
        super(name);
        this.acc = acc;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        synchronized (acc){
        if(acc.getBalance() > drawAmount){
            System.out.println(getName() + "取钱成功" + "金额" + drawAmount);
            acc.setBalance(acc.getBalance() - drawAmount);
            System.out.println(getName() + "取完，余额" + acc.getBalance());}
            else{
                System.out.println("取钱失败");
            }
        }
    }}
    class DrawTest{
        public static void main(String[] args) {
            Account acct = new Account(1234,1000);
            new DrawMoney("甲",acct,800).start();
            new DrawMoney("乙",acct,800).start();
            new DrawMoney("丙",acct,800).start();


        }
    }

