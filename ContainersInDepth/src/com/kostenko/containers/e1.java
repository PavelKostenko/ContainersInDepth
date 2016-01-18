/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import net.mindview.util.Countries;

/**
 *
 * @author Pavel
 */
public class e1 {
    static void process (List <String> l){
        l.addAll(Countries.names());
        System.out.println("Unsorted: \n" + l);
        Collections.sort(l);
        System.out.println("Sorted: \n" + l);
        for (int i = 0; i<3; i++){
            Collections.shuffle(l);
            System.out.println("Shuffled: \n" + l);
        }
        System.out.println("***************************");
    }
    public static void main(String[] args) {
        process(new ArrayList<String>());
        process(new LinkedList<String>());
    }
}
