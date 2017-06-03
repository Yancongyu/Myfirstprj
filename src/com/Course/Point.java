package com.Course;

/**
 * Created by Administrator on 2017/5/17.
 */
public class Point {
    private int x;
    private int y;
    public  Point(){}
    public  Point(int x , int y){}
    public void setPoint(int x , int y)
    {
        this.x = x;
        this.y = y;
    }
    public void movePoint(int dx , int dy)
    {
        this.x = x + dx;
        this.y = y + dy;
    }
    public void showPoint()
    {
        System.out.println("坐标为(" + x + "," + y +")");
    }
}
