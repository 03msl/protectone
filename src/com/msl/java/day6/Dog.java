package com.msl.java.day6;



public class Dog extends Animal implements Eatable,Sleepable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + "吃骨头");
    }

    @Override
    public void sleep() {
        System.out.println(name+"睡得香");
    }
}
