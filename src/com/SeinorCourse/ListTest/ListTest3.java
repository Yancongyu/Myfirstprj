package com.SeinorCourse.ListTest;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Administrator on 2017/7/13.
 */
public class ListTest3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr2=new ArrayList<Integer>();
        arr2.add(100);
        arr2.add(1000);
        ArrayList<Integer> arr= new ArrayList<Integer>();

        arr.add(23);
        arr.add(45);
        arr.add(56);
        arr.add(12);
        arr.add(78);

        //Collections.reverse(arr);
        //Collections.sort(arr);
        Collections.copy(arr,arr2);
        for(Integer n:arr)
        {
            System.out.println(n);
        }
    }
}
