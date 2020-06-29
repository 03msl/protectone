package com.msl.java.day2.classtest;

import com.msl.java.day2.protect.Customer;
import com.msl.java.day2.protect.Customers;


public class Customertest {
    public static void main(String[] args) {
        Customer C = new Customer("MSL",12);
        Customer C1 = new Customer("MSL",12);
        Customers c2 = new Customers("l",16);
        Customer M =(Customer)c2;
        M.goshopoing();




    }
}
