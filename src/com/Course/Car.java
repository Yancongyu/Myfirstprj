package com.Course;

/**
 * Created by Administrator on 2017/5/18.
 */
public class Car extends Vehicle {
    private int loader;
    public Car(){}
    public Car(String brand , String color , int loader)
    {
        this.brand = brand;
        this.color = color;
        this.speed = 0;
        this.loader =loader;
    }
    public Car(int loader)
    {
        this.loader = loader;
    }
    public int setLoader(int loader)
    {
        this.loader = loader;
        return loader;
    }
    public int getLoader()
    {
        return loader;
    }
    public void run()
    {
        System.out.println("跑车的牌子是" + brand + "颜色是" + getColor() + "初始速度是" + getSpeed() + "荷载人数是" + getLoader());
    }
}
