package com.msl.java.day2.protect;

/**
 * @ClassName Geometric
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/19 16:39
 * @Version 1.0
 **/

public class Geometric {
    protected String color;
    protected double weight;
    protected Geometric(){
        this.color="white";
        this.weight=1.0;
    }
    protected  Geometric(String color,double weight){
        this.color=color;
        this.weight=weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

