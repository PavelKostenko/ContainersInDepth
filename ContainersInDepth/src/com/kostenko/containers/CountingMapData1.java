/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.containers;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import net.mindview.util.*;

/**
 *
 * @author Pavel
 */

public class CountingMapData1 extends AbstractMap<Integer, String> {

    private int size;
    private static String[] chars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" ");

    public CountingMapData1(int size) {
        if (size < 0) {
            this.size = 0;
        }
        this.size = size;
    }

    private static class Entry implements Map.Entry<Integer, String> {

        int index;

        Entry(int index) {
            this.index = index;
        }

        public boolean equals(Object o) {
            return Integer.valueOf(index).equals(o);
        }

        public Integer getKey() {
            return index;
        }

        public String getValue() {
            return chars[index % chars.length] + Integer.toString(index / chars.length);
        }

        public String setValue(String value) {
            throw new UnsupportedOperationException();
        }

        public int hashCode() {
            return Integer.valueOf(index).hashCode();
        }
    }

    public Set<Map.Entry<Integer, String>> entrySet() {     // LinkedHashSet retains initialization order:
        return new EntrySet(size);

//        Set<Map.Entry<Integer, String>> entries = new LinkedHashSet<Map.Entry<Integer, String>>();
//        for (int i = 0; i < size; i++) {
//            entries.add(new Entry(i));
//        }
//        return entries;
    }

    static class EntrySet extends AbstractSet<Map.Entry<Integer, String>> {

        private int size;

        EntrySet(int size) {
            this.size = size;
        }

        public int size() {
            return size;
        }
        
        public Iterator iterator(){
            return new Iter();
        }
        
        private class Iter implements Iterator<Map.Entry<Integer, String>> {

            private Entry entry = new Entry(-1);

            public boolean hasNext() {
                return entry.index < size - 1;
            }

            public Map.Entry<Integer, String> next() {
                entry.index++;
                return entry;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public static void main(String[] args) {
            System.out.println(new CountingMapData1(60));
        }
    }
}