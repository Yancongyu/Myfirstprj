package com.Course;

/**
 * Created by Administrator on 2017/5/18.
 */
public class HourlyEmployee extends ColaEmployee{
    double hourSalary;
    int hour;
    HourlyEmployee(){}
    HourlyEmployee(String name ,int year ,int month ,int day,double hourSalary,int hour)
    {
        super(name, year, month, day);
        this.hourSalary = hourSalary;
        this.hour = hour;
    }

    @Override
    double getSalary(int month) {
        double salary = 0;
        if(hour <= 160)
        {
            salary = hourSalary * hour;
        }
        else
        {
            salary = 160 * hourSalary + (hour-160) * 1.5 *hourSalary;
        }
        if(month == this.month)
        {
            salary += 100;
        }
        return salary;
    }
}
