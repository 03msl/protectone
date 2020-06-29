package com.msl.java.day10;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress i1= InetAddress.getByName("192.168.10.4");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
