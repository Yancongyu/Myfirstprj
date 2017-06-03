package com.parkingLot;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/23.
 */
public class Hh {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要停的车类型");
        String a = sc.next();
        if(a.equals("轿车"))
        {
            Car c = new Car();
            Time t1 = new Time();
            c.getFee(t1.getTime());
        }
        else if(a.equals("卡车"))
        {
            Truck t = new Truck();
            Time t2 = new Time();
            t.getFee(t2.getTime());
        }
        else if(a.equals("汽车"))
        {
            Bus b = new Bus();
            Time t3 = new Time();
            b.getFee(t3.getTime());
        }
        else
        {
            System.out.println("输入错误");
        }
    }
}
