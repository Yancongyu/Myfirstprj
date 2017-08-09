package com.SeinorCourse.Day7_15.One;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Tthread extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
