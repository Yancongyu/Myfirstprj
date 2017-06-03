package com.Course;

/**
 * Created by Administrator on 2017/5/18.
 */
public class Vehicle {
    protected String brand;
    protected String color;
    protected double speed;
    public Vehicle (){}
    public Vehicle(String brand , String color)
    {
        this.brand = brand;
        this.color = color;
        this.speed = 0;
    }
    public String setColor(String color)
    {
        this.color = color;
        return color;
    }
    public double setSpeed()
    {
        return speed;
    }
    public String getColor()
    {
        return color;
    }
    public double getSpeed()
    {
        return speed;
    }
    public void run()
    {
        System.out.println("the car is running");
    }
}
