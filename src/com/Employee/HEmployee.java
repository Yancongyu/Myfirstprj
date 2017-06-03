package com.Employee;

/**
 * Created by Administrator on 2017/5/21.
 */
public abstract class HEmployee {
    String name;
    int birthYear;
    int birthMon;
    int birthDay;
    public HEmployee(){}
    public HEmployee(String name , int birthYear ,int birthMon , int birthDay)
    {
        this.name = name;
        this.birthYear = birthYear;
        this.birthMon = birthMon;
        this.birthDay = birthDay;
    }
    public abstract double getSalary(int month);
}
