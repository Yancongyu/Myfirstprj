package com.soft;

import java.util.Calendar;

/**
 * Created by Administrator on 2017/5/21.
 */
public class Test {
    public void getTime( int y , int m , int d ,int h , int mi )
    {
        Calendar c = Calendar.getInstance();
        //巴黎
        c.set(y,m,d,h-7,mi);
        System.out.println("巴黎时间是" + c.get(Calendar.YEAR) +"年" + c.get(Calendar.MONTH) + "月" + c.get(Calendar.DAY_OF_MONTH) + "日"
                + c.get(Calendar.HOUR_OF_DAY) +"点" + c.get(Calendar.MINUTE) + "分");
        c.set(y,m,d,h-12,mi);
        System.out.println("纽约时间是" + c.get(Calendar.YEAR) +"年" + c.get(Calendar.MONTH) + "月" + c.get(Calendar.DAY_OF_MONTH) + "日"
                + c.get(Calendar.HOUR_OF_DAY) + "点" +c.get(Calendar.MINUTE) + "分");
    }
    public static void main(String[]args)
    {
        /*String s = "10";
        //第一种
        Integer a = new Integer(s);
        int I = a.intValue();
        System.out.println(I);
        //第二种
        int I1 = Integer.parseInt(s);
        System.out.println(I1);
        //int转String
        int b = 10;
        Integer bb = new Integer(b);
        String c = bb.toString();
        System.out.println(c);
        String a = "as.df";
        char c = a.charAt(0);
        String b = a.toUpperCase();
        String d = a.substring(0,1);
        System.out.print(a.indexOf('.',0));
        StringBuffer sb = new StringBuffer(0);
        System.out.print(sb.capacity());*/
        Test t = new Test();
        t.getTime(2017,5,21,22,02);
    }
}
