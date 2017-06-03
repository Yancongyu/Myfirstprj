package com.parkingLot;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/27.
 */
public class Time {
    public double getTime()
    {
        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入开始则开始计时");
        String a = sc.next();
        if(a.equals("开始"))
        {
            Date d1 = new Date();
            System.out.println("输入停止即计时结束");
            String b = sc.next();
            if(b.equals("停止"))
            {
                Date d2 = new Date();
                result = (d2.getTime() - d1.getTime())/1000;
                return result;
            }
            else{System.out.println("输入错误");}
        }
        else{System.out.println("输入错误");}
        return result;
    }
    public void show()
    {
       Time t = new Time();
        System.out.println("停车时间为" + t.getTime());
    }
}
