package com.Course;

/**
 * Created by Administrator on 2017/5/18.
 */
public class Circle extends Shape{
    private double radius;
    public Circle(double radius , String color){
        this.radius = radius;
        this.color = color;
    }
    public double setRadius(double radius)
    {
        this.radius = radius;
        return radius;
    }
    public String setColor(String color)
    {
        this.color = color;
        return color;
    }
    public double getPer(double per)
    {
        per = 2 * 3.14 * radius;
        return per;
    }
    public double getArea(double area)
    {
        area = 3.14 * radius * radius;
        return area;
    }
    public String getColor(String color)
    {
        return color;
    }
    public void showAll()
    {
        System.out.println("园的周长为" + getPer(per) + "园的面积为" + getArea(area) + "园的颜色为" + getColor(color));
    }
}
