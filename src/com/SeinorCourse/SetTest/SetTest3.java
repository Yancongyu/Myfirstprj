package com.SeinorCourse.SetTest;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Administrator on 2017/7/13.
 */
public class SetTest3 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        TreeSet<String> ts=new TreeSet<String>();
        hs.add("bb");
        hs.add("aa");
        hs.add("dd");
        hs.add("cc");
        hs.add("ee");
        ts.add("bb");
        ts.add("aa");
        ts.add("dd");
        ts.add("cc");
        ts.add("ee");


        System.out.println("hashset");
        for(String s:hs)
        {
            System.out.print(s+"\t");
        }
        System.out.println();
        System.out.println("TreeSet");
        for(String s:ts)
        {
            System.out.print(s+"\t");
        }
    }
}
