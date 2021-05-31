package com.foxmula.assignment1.Q1;

public class Time {

    private int hour, min, sec, carry = 0;

    public Time(int hour, int min, int sec) {
        this.hour = hour % 24;
        this.min = min % 60;
        this.sec = sec % 60;
    }

    Time add(Time t1, Time t2) {
        t1.sec = (t1.sec + t2.sec);
        if (t1.sec >= 60) {
            t1.sec = t1.sec % 60;
            carry = 1;
        }

        t1.min = t1.min + t2.min + carry;
        carry = 0;

        if (t1.min >= 60) {
            t1.min = t1.min % 60;
            carry = 1;
        }

        t1.hour = (t1.hour + t2.hour + carry) % 24;

        System.out.println("Added time is " + t1.hour + ":" + t1.min + ":" + t1.sec);

        return t1;
    }

}

/*



public class Main{
    public static void main(String []args) {


}
 */