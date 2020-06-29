package com.msl.java.day1.protect1;

/**
 * @ClassName Account
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/18 16:29
 * @Version 1.0
 **/

public class Account {
    private  int id;
    private  double balance;
    private double annuallnterestRate;
    public  Account(int id,double balance,double annuallnterestRate){
        this.id=id;
        this.balance=balance;
        this.annuallnterestRate=annuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("账户余额不足,取款失败");
            return;
        }
           balance-=amount;

    }
    public  double getMonthlyInterest(){
        return  annuallnterestRate / 12;
    }
    public void deposite(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
}
