package com.SeinorCourse.Day7_15.One;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Test {
    public static void main(String []args){
        Tthread t1 = new Tthread();
        Tthread t2 = new Tthread();

        Rrannable r1 = new Rrannable();
        Thread t3 = new Thread(r1);

        t1.start();
        t2.start();
        t3.start();
    }
}
