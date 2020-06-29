package com.msl.java.day2.classtest;

import com.msl.java.day2.protect.Circesss;
import jdk.jfr.StackTrace;

/**
 * @ClassName Circlessstest
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/19 17:19
 * @Version 1.0
 **/

public class Circlessstest {
    public static void main(String[] args) {
        Circesss c1 = new Circesss(2.3);
        Circesss c2 = new Circesss(2.3, "white", 1);
        System.out.println("颜色是否相等 " + c1.getColor().equals(c2.getColor()));
        System.out.println("颜色是否相等" + c1.getColor() == c2.getColor());
        System.out.println(c1.equals(c2));
    }

}
