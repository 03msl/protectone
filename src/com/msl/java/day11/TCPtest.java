package com.msl.java.day11;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPtest {
   public void client()   {
       Socket socket = null;
       OutputStream os = null;
       try {
           //创建Socket对象，指明服务器端的ip和端口号
           InetAddress inet = InetAddress.getByName("127.0.0.1");
           socket = new Socket(inet, 8899);
           //获取一个输出流 用于输出数据
           os = socket.getOutputStream();
           //写出数据的操作
           os.write("你好，我是客户端".getBytes());
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           if (os != null) {
               try {
                   os.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
           if (socket != null) {
               try {
                   socket.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }

   }

    public static void main(String[] args) {
        TCPtest tc = new TCPtest();
        tc.client();
    }}