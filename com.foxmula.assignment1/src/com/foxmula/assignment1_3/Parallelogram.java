package com.foxmula.assignment1_3;

public class Parallelogram extends Quadrilateral
{
    private
    int height;
    public
    Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int height )
    {
        Coordinates(x1, y1, x2, y2, x3, y3, x4, y4);
        this.height = height;
    }
    int area()
    {
        int a= (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return  a*height;
    }
}
