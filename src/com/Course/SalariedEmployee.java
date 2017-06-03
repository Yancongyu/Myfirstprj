package com.Course;

/**
 * Created by Administrator on 2017/5/18.
 */
 class SalariedEmployee extends ColaEmployee {
    double salary;
    SalariedEmployee(){}
    SalariedEmployee(String name ,int year ,int month ,int day,double salary)
    {
        super(name, year, month, day);
        this.salary = salary;
    }

    double getSalary(int month)
    {
        if(month == this.month)
        {
            salary += 100;
        }
        return salary;
    }
}
