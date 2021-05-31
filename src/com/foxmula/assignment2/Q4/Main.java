package com.foxmula.assignment2.Q4;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> test = new TreeSet<String>();
        Scanner sc = new Scanner(System.in);
        String put;
        System.out.println("Enter Elements: {Enter nothing when done}");
        put = sc.nextLine();
        while(!(put.isEmpty()))
        {
            test.add(put);
            put = sc.nextLine();
        }
        Traverse(test);
    }

    static void Traverse(Set<String> test) {
        System.out.println("Traversing!\n");
        for (String i : test) {
            System.out.println(i);
        }
    }

}