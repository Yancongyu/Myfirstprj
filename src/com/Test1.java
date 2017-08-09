package com;

import java.util.Random;

/**
 * Created by Administrator on 2017/7/13.
 */
public class Test1 {
    public static void main(String[]args){
        Random r = new Random();
        int a = 1;
        while(a <= 60){
            int i = r.nextInt(60);
            System.out.println("第" + a + "个数字是" + i);
            a++;
        }
    }
}
