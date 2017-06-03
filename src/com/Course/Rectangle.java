package com.Course;

/**
 * Created by Administrator on 2017/5/17.
 */
public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(){}
    public Rectangle(double length , double width , String color)
    {
        this.length = length;
        this.width = width;
        this.color =color;
    }
    public double getPer(double per)
    {
        per = 2 * (length + width);
        return per;
    }
    public double getArea(double area)
    {
        area = length * width;
        return area;
    }
    public String getColor(String color)
    {
        return color;
    }
    public void showAll()
    {
        System.out.println("矩形周长为" + getPer(per) + "面积为" + getArea(area) + "颜色为" + getColor(color));
    }
}
