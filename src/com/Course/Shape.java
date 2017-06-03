package com.Course;

/**
 * Created by Administrator on 2017/5/18.
 */
public abstract class Shape {
    protected double area;
    protected double per;
    protected String color;
    public Shape(){}
    public Shape(String color)
    {
        this.color = color;
    }
    public abstract double getArea(double area);
    public abstract double getPer(double per);
    public String getColor()
    {
        return color;
    }
    public abstract void showAll();
}
