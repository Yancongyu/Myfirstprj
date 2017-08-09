package com.SeinorCourse.SetTest;

/**
 * Created by Administrator on 2017/7/13.
 */
public class Student implements Comparable{
    private String name;
    private float scope;


    public Student(String name, float scope) {
        super();
        this.name = name;
        this.scope = scope;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getScope() {
        return scope;
    }
    public void setScope(float scope) {
        this.scope = scope;
    }
    @Override
    public int compareTo(Object o) {
        Student stu=(Student)o;
        if(this.scope>stu.scope)
        {
            return -1;
        }else
            return 1;
//		else
//		    return 0;
    }
}
