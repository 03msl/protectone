package com.msl.java.day1.protect;

/**
 * @ClassName Bank
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/18 11:00
 * @Version 1.0
 **/

public class Bank {
    private Customertwo[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers=new Customertwo[10];
    }

    public void addCustomer(String f, String l) {
        Customertwo c = new Customertwo(f, l);
        customers[numberOfCustomer] = c;
        numberOfCustomer++;

    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customertwo getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomer) {
            return customers[index];
        }
        return null;
    }
}