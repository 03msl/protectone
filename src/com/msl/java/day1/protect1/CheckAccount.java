package com.msl.java.day1.protect1;

/**
 * @ClassName CheckAccount
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/18 16:56
 * @Version 1.0
 **/

public class CheckAccount extends Account{
    private  double overdraft;
    public CheckAccount(int id, double balance, double annuallnterestRate,double overdraft) {
        super(id, balance, annuallnterestRate);
        this.overdraft=overdraft;
    }
    public double  getoverdraft(){
        return overdraft;
           }


    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if(this.getBalance() >= amount ){
          super.withdraw(amount);
        }
        else if(overdraft >= amount - getBalance()){
            overdraft -=(amount - getBalance());
            setBalance(0);
        }else {
            System.out.println("超过透支限额");
        }
    }
    public void deposite(double amount){
        if(amount > 0){
            super.deposite(amount);
        }
    }

}
