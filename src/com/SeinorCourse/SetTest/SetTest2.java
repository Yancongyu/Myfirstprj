package com.SeinorCourse.SetTest;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Administrator on 2017/7/13.
 */
public class SetTest2 {
    public static void main(String[] args) {
        TreeSet<Student> arr=new TreeSet<Student>();
        arr.add(new Student("张三", 89));
        arr.add(new Student("李四", 22));
        arr.add(new Student("王五", 67));
        arr.add(new Student("李六", -1));
        System.out.println(arr.size());
        Iterator<Student> it=arr.iterator();
        while(it.hasNext())
        {
            Student s=it.next();
            System.out.println(s.getName()+":"+s.getScope());
        }

    }
}
