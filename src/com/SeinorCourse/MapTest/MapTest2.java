package com.SeinorCourse.MapTest;

import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/7/13.
 */
public class MapTest2 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=
                new TreeMap<Integer, String>();
        tm.put(3,"aa");
        tm.put(1,"cc");
        tm.put(4,"vv");
        tm.put(2,"dd");

		Set<Integer> keys=tm.keySet();
		for(Integer key:keys)
		{
		  System.out.println(key+":"+tm.get(key));
		}

//        Set<Map.Entry<Integer,String>> ens=tm.entrySet();
//
//        for(Map.Entry<Integer,String> e:ens)
//        {
//            System.out.println(e.getKey()+":"+e.getValue());
//        }

    }
}
