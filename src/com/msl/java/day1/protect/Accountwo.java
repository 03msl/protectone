package com.msl.java.day1.protect;

/**
 * @ClassName Accountwo
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/18 10:47
 * @Version 1.0
 **/

public class Accountwo {
    private double balance;
    public Accountwo(double init_balance){
        balance=init_balance;
    }
    public double getBalance(){
        return balance;
    }
    public void  deposit(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("存钱成功");
        }
    }
    public void withdraw(double amt){
        if(balance >= amt){
            balance-=amt;
            System.out.println("取钱成功");
        }else{
            System.out.println("余额不足");
        }
    }
}
