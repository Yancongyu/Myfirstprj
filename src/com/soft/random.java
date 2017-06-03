package com.soft;
/**
 * Created by Administrator on 2017/5/22.
 */
public class random {
    public static void getRandom()
    {
        int[] a = new int[72];
        for(int i = 0 ; i < a.length ; i++)
        {
            a[i] = (int)(Math.random()*72+1);
            for(int j = 1 ; j < i ; j++)
            {
                while(a[i] == a[j])
                {
                    i--;
                }
            }
        }
        for(int k = 0 ; k < 72 ; k +=3)
        {
            System.out.print( "第"+(k/3+1)+"次"+ a[k] + " " + a[k+1] + " " + a[k+2] + "\n");
        }
    }
    public static void main(String[]args)
    {
        random.getRandom();
    }
}