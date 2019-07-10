package com.cursor.wh5;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Vasyl Kachala on 06.07.2019.
 */
public class Utils {
    /**
     * Create method addNumbers add different number:
     */
    public static void addNumbers() {
        Set<Integer> treeSet = new TreeSet<>(new AbsMathComparator());
        System.out.println("Enter number one digit like " + "2 or 10 or -1 or 19");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine() == true) {
            if (scanner.equals("exit")) {
                break;
            } else {
                treeSet.add(scanner.nextInt());
            }
            System.out.println(treeSet);
        }
    }
}