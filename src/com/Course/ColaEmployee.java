package com.Course;

/**
 * Created by Administrator on 2017/5/18.
 */
public abstract class ColaEmployee {
    String name;
    int year;
    int month;
    int day;
    ColaEmployee(){}

    ColaEmployee(String name ,int year ,int month ,int day) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
    }
    abstract double getSalary(int month);
}
