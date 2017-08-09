package com.SeinorCourse.Day7_17;

/**
 * Created by Administrator on 2017/7/17.
 */
public class Test {
    public static void main(String[]args){
        ThreadTest t1 = new ThreadTest();

        Thread t = new Thread(t1);
        Thread tt = new Thread(t1);

        t.start();
        tt.start();
    }
}
