package com.msl.java.day8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(99);
        list.add(87);
        list.add(97);
        list.add(88);
        for(Integer score : list ){
            System.out.println(score);
        }

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int s = iterator.next();
            System.out.println(s);
        }
    }
}
