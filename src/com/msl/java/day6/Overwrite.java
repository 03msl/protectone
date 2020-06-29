package com.msl.java.day6;


import java.io.IOException;

public class Overwrite {
    public static void main(String[] args) {
        Overwrite test = new Overwrite();
        test.display(new SubClass());

    }
    public void display(SuperClass s)  {
        try {
            s.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
class SuperClass{
    public  void method() throws IOException{}
}
class SubClass extends  SuperClass{
    @Override
    public void method() throws IOException {
     System.out.println("SDAD");
    }
}