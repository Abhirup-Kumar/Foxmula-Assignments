package com.foxmula.assignment3.Q2;

import java.util.Scanner;

import static java.lang.Math.sqrt; // tested for 10 , 7 and 15 as input.

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter numbers: ");

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        try
        {
            if(test%2 != 0 && isPrime(test))
                throw new PrimeOddException();
        } catch (PrimeOddException e)
        {
            System.out.println("Invalid Number!!");
        }

    }
    static boolean isPrime(int test)
    {
        if(test ==0 || test == 1)
            return false;

        for( int i=2; i<sqrt(test); i++)
            if(test%i == 0) return false;

        return true;
    }
}
