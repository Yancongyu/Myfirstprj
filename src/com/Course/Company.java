package com.Course;

/**
 * Created by Administrator on 2017/5/18.
 */
 public class Company {
    static  void getSalary(int month , ColaEmployee c)
    {
        System.out.println(month + "月" + c.name + "的工资：" + c.getSalary(month));
    }
}
