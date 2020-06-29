package com.msl.java.day4.protect;

/**
 * @ClassName Leaf
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/22 13:43
 * @Version 1.0
 **/

public class Leaf extends Mid {
    static {
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }
    public Leaf(){
        super("你好");
        System.out.println("Leaf的构造器");
    }
}
