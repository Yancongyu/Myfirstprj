package com.Course;

/**
 * Created by Administrator on 2017/5/18.
 */
public class SalesEmployee extends ColaEmployee {
    double monthSalary;
    double rate;
    SalesEmployee(){}
    SalesEmployee(String name ,int year ,int month ,int day,double monthSalary,double rate)
    {
        super(name, year, month, day);
        this.monthSalary = monthSalary;
        this.rate = rate;
    }

    @Override
    double getSalary(int month) {
        double salary = monthSalary * rate;
        if(month == this.month)
        {
            salary += 100;
        }
        return salary;
    }
}
