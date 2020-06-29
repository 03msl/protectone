package com.msl.java.day8;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("Tom",87);
        map.put("sddd",97);
        map.put("weq",99);
        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer>  entry1 = iterator.next();
            String key = entry1.getKey();
            Integer v =  entry1.getValue();

        }
    }
}
