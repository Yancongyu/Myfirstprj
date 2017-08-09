package com.SeinorCourse.Day7_17;

/**
 * Created by Administrator on 2017/7/17.
 */
public class ThreadTest implements Runnable{
    private int num = 1;
    public synchronized void show(){
        System.out.println(Thread.currentThread().getName() + ":" + num);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        num++;
    }

    @Override
    public void run() {
        while(true){
            show();
        }
    }
}
