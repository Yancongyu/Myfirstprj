package com.parkingLot;

/**
 * Created by Administrator on 2017/5/23.
 */
public class Vehicle {
    public Vehicle(){}
    public void getVehicles(String a)
        {
            if(a.equals("轿车"))
            {
                Car c = new Car();
                Time t1 = new Time();
                c.getFee(t1.getTime());
            }
            else if (a.equals("汽车"))
            {
                Bus b = new Bus();
                Time t2 = new Time();
                b.getFee(t2.getTime());
            }
            else if(a.equals("卡车"))
            {
                Truck t = new Truck();
                Time t3 = new Time();
                t.getFee(t3.getTime());
            }
            else{System.out.println("输入错误");}
        }
    }

