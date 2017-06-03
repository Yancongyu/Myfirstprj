package com.Employee;

/**
 * Created by Administrator on 2017/5/21.
 */
public class Company {
    public static void show(int month, HEmployee h)
    {
        System.out.println(h.name + "的" + month + "月工资为" + h.getSalary(month));
    }
}
