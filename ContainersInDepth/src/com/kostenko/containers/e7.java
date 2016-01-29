/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.containers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import net.mindview.util.Countries;

/**
 *
 * @author Pavel
 */
public class e7 {

    public static void main(String[] args) {
        ArrayList<String> aL = new ArrayList<String>(Countries.names(5));
        LinkedList<String> lL = new LinkedList<String>(Countries.names(5));

        Iterator<String> iterator = aL.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("");

        iterator = lL.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ListIterator<String> listIterator = aL.listIterator();

        for (int i = 0; i < lL.size(); i++) {
            if (listIterator.hasNext()) {
                listIterator.next();
                listIterator.add(lL.get(i));
            } else {
                listIterator.add(lL.get(i));
            }
        }

        System.out.println("");
        System.out.println(aL);
        
        listIterator = lL.listIterator(lL.size());
        
        for (int i = 0; i < aL.size(); i++) {
            
            if (listIterator.hasPrevious()) {
                listIterator.previous();
                listIterator.add(aL.get(i));
            } else {
                listIterator.add(aL.get(i));
            }
        }

        System.out.println("");
        System.out.println(lL);
    }
}
