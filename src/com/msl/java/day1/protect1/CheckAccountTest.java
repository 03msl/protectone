package com.msl.java.day1.protect1;

/**
 * @ClassName CheckAccountTest
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/18 17:20
 * @Version 1.0
 **/

public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount ca = new CheckAccount(1122, 20000, 0.045, 5000);
        ca.withdraw(5000);
        System.out.println("账户余额: " + ca.getBalance());
        System.out.println("透支额度: " + ca.getoverdraft());
        ca.withdraw(18000);
        System.out.println("账户余额: " + ca.getBalance());
        System.out.println("透支额度: " + ca.getoverdraft());
        ca.withdraw(3000);
        System.out.println("账户余额: " + ca.getBalance());


    }
}
