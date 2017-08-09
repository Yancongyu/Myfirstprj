package com.SeinorCourse.ListTest;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest1 {

    public static void main(String[] args) {

        ArrayList<Integer> carr=new ArrayList<Integer>();
        carr.add(1);

        carr.add(2);
        LinkedList<Integer> arr=new LinkedList<Integer>();

        arr.add(23);
        arr.add(45);
        arr.add(56);
        arr.add(12);
        arr.add(78);
        arr.add(100);
        //arr.remove(0);
        //arr.remove(new Integer(23));//remove 位数，超过的时候用new Integer
        //arr.remove(new Integer(12));
        //arr.removeAll(carr);
        //arr.retainAll(carr);
//        int n=arr.indexOf(new Integer(100));
//        System.out.println(n);
//        for(int i:arr){
//            System.out.println(i);
//        }
        //int n=arr.lastIndexOf(12);
        //System.out.println(n);

//		List<Integer> arr3=arr.subList(0, 2);
//		for(Integer n:arr3)
//		{
//			System.out.println(n);
//		}
        arr.add(0, 45);
        arr.set(0, 455);

        System.out.println(arr.get(0));
        System.out.println(arr.size());
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}

//		for(int n:arr)
//		{
//			System.out.println(n);
//		}
        arr.clear();

    }

}




