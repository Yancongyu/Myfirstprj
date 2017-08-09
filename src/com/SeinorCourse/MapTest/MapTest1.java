package com.SeinorCourse.MapTest;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/7/13.
 */
public class MapTest1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap
                <Integer,String>();
        hm.put(12, "张三");
        hm.put(20, "李四");
        hm.put(34, "王二麻子");
        hm.put(21, "李六");

        //��������=��ǰ����Ԫ�ظ���/Ĭ������

        hm.remove(12);
        System.out.println(hm.get(12));
//        Set<Integer> keys=hm.keySet();
//        for(Integer key:keys)
//        {
//            System.out.println(key+":"+hm.get(key));
//        }


    }
}
