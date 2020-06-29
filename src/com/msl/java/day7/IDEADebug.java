package com.msl.java.day7;

/**
 *
 */
public class IDEADebug {
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
    }

    public static void main(String[] args) {
        IDEADebug id = new IDEADebug();
        id.testStringBuffer();
    }
}
