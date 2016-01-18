/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.containers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.mindview.util.Countries;

/**
 *
 * @author Pavel
 */
public class e2 {
    public static void main(String[] args) {
        Map <String,String> result = new HashMap<String,String>();
        for (Entry<String,String> e:Countries.capitals().entrySet()){
            if (e.getKey().startsWith("A")){
                result.put(e.getKey(), e.getValue());
            }
        }
        System.out.println(result);
        
        System.out.println(result.keySet());
    }
}
