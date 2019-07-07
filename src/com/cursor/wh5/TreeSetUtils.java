package com.cursor.wh5;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Vasyl Kachala on 06.07.2019.
 */
public class TreeSetUtils {
    /**
     * Create method menuSelectionCase switch case:
     */
    public static void menuSelectionCase() {
        Scanner sc = new Scanner(System.in);
        String command;
        label:
        while (true) {
            System.out.println("/*********************/");
            System.out.println("Add number in TreeSet \"1\"");
            System.out.println("/*********************/");
            command = sc.nextLine();
            switch (command) {
                case "1":
                    numbersTreeSet();
                    break;
                case "0":
                    sc.close();
                default:
                    System.out.println("Error!");
                    break;
            }
        }
    }

    /**
     * Create method numbersTreeSet add different number:
     */
    public static void numbersTreeSet() {
        Set<Integer> treeSet = new TreeSet<>(new SortNumbersComparator());
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