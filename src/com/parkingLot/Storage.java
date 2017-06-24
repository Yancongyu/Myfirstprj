package com.parkingLot;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Storage{
    //创建最大存储量
    private final int MAX_SIZE = 10;
    //创建仓库
    private LinkedList<Object> list = new LinkedList<Object>();
    //得到停车的数量
    public void getVehicles(String a){
        synchronized(list){
            boolean b = true;
            int sum = 0;
            while(b && sum < MAX_SIZE){
                System.out.println("请输入您要停的车类型");
                Scanner sc = new Scanner(System.in);
                a = sc.next();
                if (a.equals("轿车")) {
                    sum++;
                    Car c = new Car();
                    c.getFee(new Storage().getTime(0));
                } else if (a.equals("汽车")) {
                    sum++;
                    Bus bb = new Bus();
                    bb.getFee(new Storage().getTime(0));
                } else if (a.equals("卡车")) {
                    sum++;
                    Truck tt = new Truck();
                    tt.getFee(new Storage().getTime(0));
                } else if(a.equals("停止停车")){
                    b = false;
                }
                else {
                    System.out.println("输入错误");
                }
                System.out.println("已停" + sum + "辆车");
            }
            while(!b || sum > MAX_SIZE){
                try{list.wait();}
                catch (InterruptedException e){e.printStackTrace();}
            }
            list.notify();
        }
    }
    public double getTime(double seconds){
        synchronized(list){
            Scanner sc = new Scanner(System.in);
            System.out.println("输入开始则开始计时");
            String a = sc.next();
            if (a.equals("开始")) {
                Date d1 = new Date();
                System.out.println("输入停止即计时结束");
                String b = sc.next();
                if (b.equals("停止")) {
                    Date d2 = new Date();
                    seconds = (d2.getTime() - d1.getTime()) / 1000;
                    return seconds;
                } else {
                    System.out.println("输入错误");
                }
            } else {
                System.out.println("输入错误");
            }
            return seconds;
        }
    }
}
