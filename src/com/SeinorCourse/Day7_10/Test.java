package com.SeinorCourse.Day7_10;

import java.util.*;

/**
 * Created by Administrator on 2017/7/10.
 */
public class Test {
    public static void main(String []args){
        Random r = new Random();
        HashSet<Integer> hs = new HashSet<Integer>();
        while(hs.size() != 60){
            int a = r.nextInt(60)+1;
            hs.add(a);
        }
        Iterator<Integer> it = hs.iterator();
//        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
//        for(int i = 0 ; i < 60 ; i++){
//            hm.put(i,it.next());
//        }
//
//        Set<Integer> s = hm.keySet();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }
    }
}
