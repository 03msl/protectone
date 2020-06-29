package com.msl.java.day11;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import static org.junit.jupiter.api.Assertions.*;

public class TCPtest2TestTest {

    @Test
   public  void client() throws IOException {
        //
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9099);
         //获取一个输出流
        OutputStream os = socket.getOutputStream();
        //获取一个输入流 读数据
        FileInputStream fis = new FileInputStream("hello1.txt");
        byte[] buff = new byte[1024];
        int len;
        while ((len = fis.read(buff)) != -1){
            os.write(buff,0,len);
        }
        fis.close();
        os.close();
        socket.close();
    }

    @Test
    public void sever() throws IOException {
       ServerSocket ss = new ServerSocket(9099);
      Socket socket = ss.accept();
       InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream(new File("SD.txt"));
        byte[] buffer = new byte[1024];
        int len;
        while((len = is.read(buffer)) != -1){
            fos.write(buffer,0,len);
        }
        fos.close();
        is.close();
        socket.close();
        ss.close();
    }
}