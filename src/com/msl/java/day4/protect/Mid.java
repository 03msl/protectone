package com.msl.java.day4.protect;



public class Mid extends Root {
    static{
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }
    public Mid(){
        System.out.println("Mid的无参数的构造器");
    }
    public  Mid(String msg){
        this();
        System.out.println("Mid的带参数构造器，其参数值："+msg);
    }
}
