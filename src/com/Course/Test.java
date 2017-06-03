package com.Course;

/**
 * Created by Administrator on 2017/5/17.
 */
public class Test {
    public static void main(String[]args)
    {
       //计算工资
        ColaEmployee[] a = new ColaEmployee[3];
        a[0] = new SalariedEmployee("张",1988,2,29,3500);
        a[1] = new HourlyEmployee("家",1855,5,6,3522,180);
        a[2] = new SalesEmployee("瑞",1855,2,3,3500,0.2);
        for(int i = 0 ; i < a.length ; i++)
        {
            Company.getSalary(2,a[i]);
        }
        //接口的实验
        /*Farmer farmer = new Farmer();
        Fruit f = farmer.creat();*/
    }
}
