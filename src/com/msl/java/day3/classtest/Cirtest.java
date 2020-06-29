package com.msl.java.day3.classtest;

import com.msl.java.day3.protect.Circle;

/**
 * @ClassName Cirtest
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/20 18:27
 * @Version 1.0
 **/

public class Cirtest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("c1的id: "+c1.getId());
        System.out.println("c2的id："+c2.getId());
        System.out.println("创建的圆的个数: "+Circle.getTotal() );
    }
}
