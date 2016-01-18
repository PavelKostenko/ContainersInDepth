/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.containers;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import net.mindview.util.Countries;

/**
 *
 * @author Pavel
 */
public class e3 {

    static void check(Set set) {
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (String s : Countries.names()) {
                set.add(s);
                k++;
            }
        }
        
        System.out.println(set);
        System.out.println("\nSize is " + set.size());
        System.out.println("\nIterations: " + k);
        System.out.println("*********************************");
    }

    public static void main(String[] args) {
        check(new HashSet());
        check(new LinkedHashSet());
        check(new TreeSet());
    }
}
