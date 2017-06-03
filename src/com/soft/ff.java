package com.soft;

/**
 * Created by Administrator on 2017/5/16.
 */
public class ff
{
    public static void func()
        {
            for(int i = 2 ; i <= 500 ; i++)
            {
                boolean  b = true;
                for(int j = 2 ; j < i ; j++)
                {
                    if(i%j == 0)
                    {
                        b = false;
                        break;
                    }
                }
                if(!b)
                {
                    continue;
                }
                System.out.println(i);
            }
        }
    public static void main(String[]args)
    {
        ff.func();
    }
}