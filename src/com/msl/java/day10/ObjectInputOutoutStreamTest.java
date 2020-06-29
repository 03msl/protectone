package com.msl.java.day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ObjectInputOutoutStreamTest {
    //序列化过程：将内存中的java对象保存到磁盘中或通过网络传输出去
    public static void main(String[] args) {
        ObjectOutputStream os = null;
        try {
            os = new ObjectOutputStream(new FileOutputStream("D:\\project\\java\\protectone\\object.dat"));
            os.writeObject(new String("这是一行代码"));
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {

                }
            }
        }
    }
}
