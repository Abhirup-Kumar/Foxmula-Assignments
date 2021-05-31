package com.foxmula.assignment1.Q2;

import java.util.*;

public class stack{ //error handling is not implemented

    private LinkedList<Integer> list = new LinkedList<>();

    public void push(int x)
    {
        list.addLast(x);
    }

    public void pop()
    {
        if(!CheckEmpty())
            list.removeLast();
        else
            System.out.println("Stack is Empty");
    }

    public int size()
    {
        return list.size();
    }

    public boolean CheckEmpty()
    {
        if(list.isEmpty())
            System.out.println("Stack is Empty");
        return false;
    }
}