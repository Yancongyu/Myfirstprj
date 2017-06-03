package com.Course;

/**
 * Created by Administrator on 2017/5/19.
 */
public class Exercise {
    public static void wrong (int number) throws ByteSizeException
    {
        if(number > 127 || number < -128)
        {
            throw new ByteSizeException();
        }
    }
    public static void main(String[] args)
    {
        try{
            wrong(566);
        }catch (ByteSizeException b)
        {
            b.printStackTrace();
        }
    }
}
