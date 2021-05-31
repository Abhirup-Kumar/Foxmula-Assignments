package com.foxmula.assignment2.Q2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> test = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String put;
        System.out.println("Enter Elements: {Enter nothing when done}");
        put = sc.nextLine();
        while(!(put.isEmpty()))
        {
            test.add(put);
            put = sc.nextLine();
        }
        FindEelement(test);
    }

    static void FindEelement(Set<String> test) {
        System.out.println("Enter key: ");
        Scanner sc = new Scanner(System.in);
        String put = sc.nextLine();
        if(test.contains(put))
            System.out.println("Element is present");
        else
            System.out.println("Element not present");
    }
}
