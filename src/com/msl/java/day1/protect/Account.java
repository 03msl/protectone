package com.msl.java.day1.protect;

/**
 * @ClassName Account
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/18 9:42
 * @Version 1.0
 **/

public class Account {
    private  int id;
    private double balance;
    private double annuallnterestrRate;
    public Account(int id,double balance,double annuallnterestrRate){
        this.id=id;
        this.balance=balance;
        this.annuallnterestrRate=annuallnterestrRate;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnuallnterestrRate() {
        return annuallnterestrRate;
    }

    public void setAnnuallnterestrRate(double annuallnterestrRate) {
        this.annuallnterestrRate = annuallnterestrRate;
    }
    public void withdrow(double amount){
        if(balance < amount){
            System.out.println("余额不足，取款失败");
            return;
        }
        balance-=amount;
        System.out.println("成功取出: " + amount);
    }
    public void deposit(double amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("成功存入:"+amount);
        }
    }
}
