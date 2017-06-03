package com.Course;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/18.
 */
public class Farmer {
    public Fruit creat()
    {
        Fruit f = null;
        Scanner input = new Scanner(System.in);
        String name = input.next();
        if(name.equals("苹果"))
        {
            f = new Apple();
        }
        else if(name.equals("香蕉"))
        {
            f = new banana();
        }
        else if(name.equals("葡萄"))
        {
            f = new Grape();
        }
        else{System.out.println("不会种");}
        return f;
    }
}
