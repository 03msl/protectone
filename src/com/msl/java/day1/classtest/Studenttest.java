package com.msl.java.day1.classtest;

import com.msl.java.day1.protect.Person;
import com.msl.java.day1.protect.Student;

/**
 * @ClassName Studenttest
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/18 15:50
 * @Version 1.0
 **/

public class Studenttest {
    public static void main(String[] args) {
        Person P =new Person("李四",15);
        Student s=new Student("张三",12,"IT");
        Student s1=new Student("生物");
        Student s2=new Student();
        Student s3=new Student("EA","数学");
        System.out.println();

        s1.eat();
        s1.walk();
        System.out.println();
        s.eat();
        s.walk();
        System.out.println();
        P.eat();

        s3.eat();
    }
}
