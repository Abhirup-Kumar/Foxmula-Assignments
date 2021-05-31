package com.foxmula.assignment2.Q3;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<String> test = new HashSet<String>();
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

    static void Traverse(HashSet<String> test) {
        System.out.println("Traversingll!\n");
        for (String i : test) {
            System.out.println(i);
        }
    }

}
