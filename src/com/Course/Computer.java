package com.Course;

/**
 * Created by Administrator on 2017/5/17.
 */
public class Computer {
    private char color;
    private int cpuNum;
    public Computer(){}
    public void setComputer(char color , int cpuNum)
    {
        this.color = color;
        this.cpuNum =cpuNum;
    }
    public char getColor()
    {
        return color;
    }
    public int getCpuNum()
    {
        return cpuNum;
    }
}
