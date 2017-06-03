package com.Employee;

/**
 * Created by Administrator on 2017/5/21.
 */
public class Test {
    public static void main(String [] args)
    {
        HEmployee[] a = new HEmployee[1];
        a[0] = new SalaryEmployee("张" , 1996 , 4 , 16 , 8000);
        Company c = new Company();
        c.show(1,a[0]);
        Company.show(4,a[0]);
    }
}
