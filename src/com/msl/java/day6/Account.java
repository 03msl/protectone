package com.msl.java.day6;

/**
 *
 */
public class Account {
    private String accountNo;
    private double balance;
    public Account(){
    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }


    @Override
    public int hashCode() {
        return accountNo.hashCode();
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj !=null &&obj.getClass() == Account.class)
        {
            Account targrt =(Account)obj;
            return targrt.getAccountNo().equals(accountNo);}
        return false;
        }
    }

