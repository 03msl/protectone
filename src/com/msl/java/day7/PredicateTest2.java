package com.msl.java.day7;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 *
 */
public class PredicateTest2 {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(new String("轻量级Java EE企业应用实战"));
        books.add(new String("疯狂Java讲义"));
        books.add(new String("疯狂ios讲义"));
        books.add(new String("疯狂Android讲义"));
        System.out.println(calALL(books, ele->((String)ele).contains("疯狂")));
    }
    public  static  int calALL(Collection books, Predicate p){
        int total = 0;
        for(Object obj : books){
            if(p.test(obj)){
                total++;
            }

        }
        return total;
    }
}
