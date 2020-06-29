package com.msl.java.day10;


import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriterTest {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            //实例化File类的对象，指明要操作的文件
            File file = new File("D:\\project\\java\\protectone\\hello.txt");
            fr = new FileReader(file);
            int data;
            while ((data = fr.read()) != -1) {
                System.out.println((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr != null){
                fr.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }}
