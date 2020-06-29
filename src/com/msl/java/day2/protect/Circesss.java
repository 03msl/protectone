package com.msl.java.day2.protect;

import java.util.concurrent.Callable;

/**
 * @ClassName Circesss
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/19 16:46
 * @Version 1.0
 **/

public class Circesss extends Geometric{
    private double radius;
    public Circesss(){
        this.color="white";
        this.weight=1.0;
        this.radius=1.0;
    }
    public Circesss(double radius){
        this.color="white";
        this.weight=1.0;
        this.radius=radius;
    }
    public Circesss(double radius,String color,double weight){
        this.radius=radius;
        this.color=color;
        this.weight=weight;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void findArea(){
        System.out.println("圆的面积是:"+radius*radius*3.14);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return  true;
        }
        if(obj instanceof Circesss){
            Circesss c = (Circesss)obj;
            return this.radius == c.radius;
            }
        return  false;
    }

    @Override
    public String toString() {
        return  "radius=" +radius;
    }
}
