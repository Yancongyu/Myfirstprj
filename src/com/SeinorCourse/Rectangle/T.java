package com.SeinorCourse.Rectangle;

/**
 * Created by Administrator on 2017/5/28.
 */
public class T implements Runnable{
    int time = 1000;
    String name;
    public T(String name)
    {
        this.name = name;
    }
    public void run() {
        try{
            while(true)
            {
                System.out.println(name + "休眠了" + time/1000 + "秒");
                Thread.sleep(time+=1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("哈哈，出错啦");
        }
    }
    public static void main(String[]args)
    {
        T t1 = new T("线程1");
        new Thread(t1).start();
        T t2 = new T("线程2");
        new Thread(t2).start();
    }
}
