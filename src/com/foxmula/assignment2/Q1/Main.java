package com.foxmula.assignment2.Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();
        System.out.println("Enter Elements to array: ");
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

    static void FindEelement(ArrayList<String> test) {
        System.out.println("Enter key: ");
        Scanner sc = new Scanner(System.in);
        String put = sc.nextLine();
        if(test.contains(put))
            System.out.println("Element is present");
        else
            System.out.println("Element not present");
    }
}
