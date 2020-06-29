package com.msl.java.day3.classtest;


import com.msl.java.day3.protect.Account;

public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account("123",15);
        System.out.println(a1);
        System.out.println(a2);


    }
}
