package com.msl.java.day2.protect;

/**
 * @ClassName Customer
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/19 14:52
 * @Version 1.0
 **/

public class Customer {
    private String name;
    private  int  age;
    public Customer(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
     public void goshopoing(){
        System.out.println("父类买衣服");
     }

    @Override
    public boolean equals(Object obj) {
        System.out.println("ASDSDJ");
        if(this == obj){
            return true;
        }
        else if(obj instanceof Customer){
            Customer cus = (Customer)obj;
            if (this.age==cus.age && this.name.equals(cus.name)){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
}
