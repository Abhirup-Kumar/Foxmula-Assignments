package com.foxmula.assignment2.Q5;

import java.util.ArrayList;
import java.util.Collections;
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
        Traverse(test);
    }

    static void Traverse(ArrayList<String> test) {
        System.out.println("Traversing!\n");
        for (String i : test) {
            System.out.println("The frequency of the word "+ i +" is "+
                    Collections.frequency(test,i));
            //test.removeAll(Collections.singleton(i));
        }
    }
}