package com.foxmula.assignment1.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String []args) {

        stack stk1=new stack();
        stack stk2=new stack();
        Scanner obj=new Scanner(System.in);

        while(true)
        {
            System.out.println("1. Stack-1\n");
            System.out.println("2. Stack-2\n");
            int choice=obj.nextInt();

            System.out.println("1. Push \n");
            System.out.println("2. Pop\n");
            System.out.println("2. Check Underflow\n");
            int option = obj.nextInt();

            if(choice == 0) //wont break in very 1st attempt. needs to be fixed.
                break;

            if(choice == 1)
            {
                switch(option)
                {
                    case 1:
                        int value=obj.nextInt();
                        stk1.push(value);
                        break;
                    case 2:
                        stk1.pop();
                        break;
                    default:
                        stk1.CheckEmpty();
                        break;
                }
            }

            else if(choice == 2)
            {
                switch(option)
                {
                    case 1:
                        int x=obj.nextInt();
                        stk2.push(x);
                        break;
                    case 2:
                        stk2.pop();
                        break;
                    default:
                        stk2.CheckEmpty();
                        break;
                }
            }

            if(stk1.size() == stk2.size())
                System.out.println("Both stacks are Equal in size = "+stk1.size());

        }

    }
}
