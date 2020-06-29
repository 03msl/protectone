package com.msl.java.day4.test;


import com.msl.java.day4.protect.Employee;
import com.msl.java.day4.protect.Manager;

import java.util.Collection;

public class Employeetest {
    public static void main(String[] args) {
        Employee a = new Manager(256);
        a.work();

    }
}
