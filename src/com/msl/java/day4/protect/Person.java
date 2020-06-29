package com.msl.java.day4.protect;

/**
 * @ClassName Person
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/22 11:21
 * @Version 1.0
 **/

public class Person {
    String name;
    int age;
    public  static  String desc = "我是";
    public Person(){

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    static {
        System.out.println("HELLO");
    }

    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
