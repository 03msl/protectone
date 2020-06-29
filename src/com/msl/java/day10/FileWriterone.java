package com.msl.java.day10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterone {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\project\\java\\protectone\\hello1.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("i sddsd \n");
        fw.write("you also");
        fw.close();
    }
}
