package com.msl.java.day1.classtest;

import com.msl.java.day1.protect.Accountwo;
import com.msl.java.day1.protect.Bank;
import com.msl.java.day1.protect.Customertwo;

/**
 * @ClassName Banktest
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/18 11:12
 * @Version 1.0
 **/

public class Banktest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jan","Smith");
        bank.getCustomer(0).setAccountw(new Accountwo(2000));
        bank.getCustomer(0).getAccountw().withdraw(500);
        bank.getCustomer(0).getAccountw().getBalance();
        double balance = bank.getCustomer(0).getAccountw().getBalance();
        System.out.println("客户: " + bank.getCustomer(0).getFirstName()+" 的账户余额为" + balance);

    }
}
