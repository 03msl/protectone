package com.msl.java.day2.protect;

/**
 * @ClassName FieldMethodTest
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/19 10:19
 * @Version 1.0
 **/
class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);    }
}
class Sub extends Base{
    int count = 20;
    public void display(){
        System.out.println(this.count);

    }
}

public class FieldMethodTest {
    public static void main(String[] args) {
       Sub s = new Sub();
       System.out.println(s.count);
       s.display();
       Base b = s;//多态性
       //== 对于引用数据类型来讲，比较的是两个引用数据类型变量的地址值是否相等
       System.out.println(b == s);
       System.out.println(b.count);//属性跟多态性无关
       b.display();
    }
}
