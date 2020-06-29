package com.msl.java.day3.protect;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/20 18:22
 * @Version 1.0
 **/

public class Circle {
    private  double radius;
    private  int id ;
    public Circle(){
        id = init++;
        total++;
    }
    private static int total;
    private static  int init = 1001;

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }

    public double findArea(){
        return 3.14 * radius * radius;
    }

    public int getId() {
        return id;
    }


}

