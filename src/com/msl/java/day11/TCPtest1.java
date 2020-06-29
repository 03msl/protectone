package com.msl.java.day11;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPtest1 {

    public void sever() {


        ServerSocket ss = null;
        Socket socket = null;
        InputStream is= null;
        ByteArrayOutputStream baos = null;
        try {
            //创建服务器端的ServerSocket,指明自己的端口号
            ss = new ServerSocket(8899);
            //调用accept() 表示接受来自客户端的socket
            socket = ss.accept();
            //获取一个输入流
            is = socket.getInputStream();
//        byte[]  buffer =new byte[20];
//        int len;
//        while((len = is.read(buffer)) != -1){
//            String str = new String(buffer,0,20);
//            System.out.println(str);
//        }
            //读取输入流中的数据
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[5];
            int len;
            while ((len = is.read(buffer))!= -1){
                baos.write(buffer,0,len);
            }
            System.out.println(baos.toString());
            System.out.println("收到了来自" + socket.getInetAddress().getHostAddress());
//
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(baos != null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ss != null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    public static void main(String[] args) {
        TCPtest1 t = new TCPtest1();
        t.sever();
    }
}
