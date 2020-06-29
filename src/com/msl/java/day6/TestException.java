package com.msl.java.day6;


import javafx.scene.chart.ScatterChart;

public class TestException {

    // 1、空指针  2、数组越界  3、类型转换  4 IO   5、语法异常

    public static void main(String[] args) {
        int[] a =new int[10];
        try {
            System.out.println(a[10]);
        }catch(Exception e){
            //System.out.println(e.getMessage());
      //e.printStackTrace();
            e.printStackTrace();

        }finally {
             System.out.println("ASJDHAHD");
        }

    }

}
