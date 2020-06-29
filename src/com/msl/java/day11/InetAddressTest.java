package com.msl.java.day11;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws IOException {
//        InetAddress ip = InetAddress.getByName("www.crazyit.org");
//        System.out.println("Crazyit是否可达: " + ip.isReachable(2000));
//        System.out.println(ip.getHostAddress());
//        InetAddress local = InetAddress.getByAddress(new byte[]{127,0,0,1});
//        System.out.println("本机是否可达: "+ local.isReachable(5000));
//        System.out.println(local.getCanonicalHostName());
//        System.out.println(local.getHostName());
        String keyword = URLDecoder.decode("%25E7%2596%25AF%25E7%258B%2582java","utf-8");
        System.out.println(keyword);
        String us = URLEncoder.encode("疯狂Android讲义","GBK");
        System.out.println(us);
    }
}
