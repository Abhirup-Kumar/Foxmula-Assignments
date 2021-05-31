package com.foxmula.assignment2.Q6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {//assuming only +ve no. and k as a sum of pairs exists
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        System.out.println("Enter Elements to array: ");
        Scanner sc = new Scanner(System.in);
        int put;
        System.out.println("Enter Elements: {Enter -1 when done}");
        put = sc.nextInt();
        while(put != -1)
        {
            test.add(put);
            put = sc.nextInt();
        }
        FindPairs(test);
    }

    static void FindPairs(ArrayList<Integer> test) {
        System.out.println("Enter k: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int tempk= k;
        int it = test.size();
        for(int itr = 0; itr < it; itr++)
        {
            tempk = tempk-test.get(itr);
            if(tempk*2 == k && Collections.frequency(test,tempk) < 2)
                continue;
           if(test.contains(tempk)) {
               System.out.println("Pair found: (" + test.get(itr) + "," + tempk + ")");
               break;// pair has been found
           }
            tempk = k;
        }
    }
}