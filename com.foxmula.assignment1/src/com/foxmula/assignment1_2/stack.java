package com.foxmula.assignment1_2;

import java.util.*;

public class stack{ //error handling is not implemented

    public Stack<Integer> stk = new Stack<Integer>();

    public void push(int x)
    {
        System.out.println("Enter Value: ");
        this.stk.push(x);
    }

    public void pop()
    {
        this.stk.pop();
    }

    public void CheckEmpty()
    {
        if(this.stk.empty())
            System.out.println("Stack Underflow");
        else
            System.out.println("Stack is not empty");
    }
}