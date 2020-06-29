package com.msl.java.day1.classtest;

import com.msl.java.day1.protect.Account;
import com.msl.java.day1.protect.Customer;

/**
 * @ClassName Customertest
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/18 10:15
 * @Version 1.0
 **/

public class Customertest {
    public static void main(String[] args) {
        Customer c=new Customer("Jane","Smith");
        Account a=new Account(1000,2000,0.0123);
        c.setAccount(a);
        c.getAccount().deposit(100);
        c.getAccount().withdrow(960);
        c.getAccount().withdrow(2000);
        System.out.println("Customer [" +
                c.getLastName() + "," + c.getFirstName() + "] has a account: id is " +c.getAccount().getId()+", annualInterestRate is "+c.getAccount().getAnnuallnterestrRate()+", balance is "+c.getAccount().getBalance());
    }
}
