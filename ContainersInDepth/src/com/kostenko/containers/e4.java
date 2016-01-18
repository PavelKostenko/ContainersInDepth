/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import net.mindview.util.TextFile;

/**
 *
 * @author Pavel
 */
public class e4 {
    public static void main(String[] args) {
        String fileName = "c:\\TNC.txt";
        String [] fullFile = TextFile.read(fileName).split(" ");
        Collection col = new ArrayList(Arrays.asList(fullFile));
        System.out.println(col);
    }
}
