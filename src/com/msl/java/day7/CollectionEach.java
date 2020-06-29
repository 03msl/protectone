package com.msl.java.day7;

import java.util.Collection;
import java.util.HashSet;

/**
 *
 */
public class CollectionEach{

    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("轻量级Java");
        books.add("疯狂讲义");
        books.add("Android");
        books.forEach(obj -> System.out.println("迭代集合元素: "+ obj));
    }
}
