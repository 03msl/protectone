package com.msl.java.day3.classtest;


import com.msl.java.day3.protect.Chinese;

public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
         c1.age = 40;
         c1.name = "张三";
         c1.nation = "asda";
         Chinese c2 = new Chinese();
         c2.age = 30;
         c2.name = "李四";
         System.out.println(c2.nation);
    }
}
