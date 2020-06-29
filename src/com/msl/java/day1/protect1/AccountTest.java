package com.msl.java.day1.protect1;

/**
 * @ClassName AccountTest
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/18 16:47
 * @Version 1.0
 **/

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account(1122,20000,0.045);
        a.withdraw(30000);
        a.withdraw(2500);
        System.out.println("账户余额："+a.getBalance());
        a.deposite(3000);
        System.out.println("账户余额为："+a.getBalance());
        System.out.println("月利率: "+a.getMonthlyInterest()*100+"%");
    }
}
