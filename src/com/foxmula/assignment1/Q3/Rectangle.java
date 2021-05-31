package com.foxmula.assignment1.Q3;

class Rectangle extends Quadrilateral
{
    Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        Coordinates(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    int area(){
        int a =(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        int b =(int)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
        return a*b;
    }

}