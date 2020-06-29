package com.msl.java.day10;

import java.io.*;

public class Filerw {
    public static void main(String[] args) {

        FileReader fr = null;
        FileWriter fw = null;
        try {
            File srcfile = new File("D:\\project\\java\\protectone\\hello.txt");
            File destfile = new File("D:\\project\\java\\protectone\\hello2.txt");
            fr = new FileReader(srcfile);
            fw = new FileWriter(destfile);

            char[] cb = new char[5];
            int len;
            while ((len = fr.read(cb)) != -1) {
                fw.write(cb, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

