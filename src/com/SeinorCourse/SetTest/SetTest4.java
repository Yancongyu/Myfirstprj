package com.SeinorCourse.SetTest;

import java.util.HashSet;

/**
 * Created by Administrator on 2017/7/13.
 */
public class SetTest4 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(4);
        hs.add(1);
        hs.add(23);
        hs.add(2);
        hs.add(7);
        hs.add(56);
        hs.add(9);
        hs.add(3);
        hs.add(5);
        hs.add(4);
        for(Integer n:hs)
        {
            System.out.print(n+"\t");
        }

    }
}
