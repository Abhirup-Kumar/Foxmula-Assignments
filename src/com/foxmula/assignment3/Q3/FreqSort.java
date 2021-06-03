package com.foxmula.assignment3.Q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FreqSort {
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
        Collections.sort(test);
        Traverse(test);
    }

    static void Traverse(ArrayList<String> test) {

        String matchedI = null; // sorted list so just check next string to not print redundant strings repetitively
        int flag = 1;           //used to enter the loop for first time

        for (String i : test)
        {
            if(flag == 1|| !(i.equals(matchedI)))
            {
                System.out.println( i + " appeared " +
                        Collections.frequency(test, i) + " times");
                matchedI = i;
                flag =0;
            }

//            test.removeAll(Collections.singleton(i));// Why this doesnt work
        }
    }
}
