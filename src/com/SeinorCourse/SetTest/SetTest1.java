package com.SeinorCourse.SetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2017/7/13.
 */
public class SetTest1 {
    public static void main(String[] args) {

        //set
        //hashset--
        //treeSet-->Comparable(-1,1)--->
        //int []arr2=new int[5];
        Set<Integer> set=new HashSet<Integer>();
        set.add(12);
        set.add(34);
        set.add(23);
        set.add(100);
//            for(Integer n:set)
//            {
//                System.out.print(n + " ");
//            }
        //{34,23,12}
		Iterator<Integer> it=set.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
    }
}
