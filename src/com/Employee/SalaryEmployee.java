package com.Employee;

/**
 * Created by Administrator on 2017/5/21.
 */
public class SalaryEmployee extends HEmployee{
    double salary;
    public SalaryEmployee(){}
    public SalaryEmployee(String name , int birthYear ,int birthMon , int birthDay , double salary)
    {
        super(name, birthYear, birthMon, birthDay);
        this.salary = salary;
    }
    public double getSalary(int month)
    {
        if(month == this.birthMon)
        {
            salary += 100;
        }
        return salary;
    }
}