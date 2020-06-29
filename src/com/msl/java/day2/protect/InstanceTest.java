package com.msl.java.day2.protect;

/**
 * @ClassName InstanceTest
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/19 10:57
 * @Version 1.0
 **/

public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Student());
    }
    public void method(Person e){
        String info = e.getInfo();
        System.out.println(info);
        if(e instanceof Graduate){
        System.out.println("A Graduate");
        }else  if(e instanceof Student){
            System.out.println("A Student");
        }else{
            System.out.println("A Student");
        }


    }
}
class  Person{
    protected  String name = "person";
    protected  int age = 50;
    public String getInfo(){
        return "Name: " + name + "\n" + "age: " +age;
    }
}
class Student extends  Person{
    protected String school = "pku";
    public String getInfo(){
        return "Name: " + name + "\nage: " + age + " school: " + school;
    }
}
class  Graduate extends  Student{
    public  String major = "IT";
    public String getInfo(){
        return "Name: " + name + "\nage: " + age + " school: " + school + "major: " + major;
    }
}