package com.Course;

/**
 * Created by Administrator on 2017/5/17.
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getSingleton()
    {
        return instance;
    }
}
