package com.msl.java.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderone {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);
            char[] cb = new char[5];
            int len;
            while((len = fr.read(cb))!= -1){
                for(int i = 0;i < len;i++){
                    System.out.print(cb[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fr != null){
                try {
                    fr.close();

                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }
    }
}