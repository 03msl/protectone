package com.msl.java.day1.protect;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/18 13:43
 * @Version 1.0
 **/

public class Student extends  Person{
    private String major;
    public Student(){}
    public Student(String major){
        this.major=major;
    }
    public Student(String name,String major){
        this.name=name;
        this.major=major;
    }
    public Student(String name,int age,String major){
        super(name, age);
        this.major=major;
    }

    @Override
    public void eat() {
        System.out.println(major+"专业的学生在吃饭 他的名字是: "+super.name);
        super.walk();
    }

    @Override
    public void walk() {
        System.out.println("学生在走路");
    }
}
