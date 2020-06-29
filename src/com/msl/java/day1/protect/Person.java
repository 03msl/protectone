package com.msl.java.day1.protect;

/**
 * @ClassName Person
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/18 13:43
 * @Version 1.0
 **/

public class Person  {
    String name;
    private  int age;
    public Person(){}
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void eat(){
    System.out.println(name+"这个人在吃饭");
    }
    public void walk(){
        System.out.println(name+"人在走路");
    }

    public String getName() {
        return name;
    }
}
