package com.Course;

/**
 * Created by Administrator on 2017/5/17.
 */
public class Student {
    private String name;
    private int id;
    private int score;
    public Student(){}
    public Student(String name, int id ,int score)
    {
        this.name =name;
        this.id = id;
        this.score =score;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public void setScore(int score)
    {
        this.score = score;
    }
    public int getScore()
    {
        return score;
    }
    public void sortByScore(Student[] students)
    {
        for(int i = 0 ; i < students.length ; i++)
        {
            for(int j = 0 ; j < students.length ; j++)
            {
                if(students[i].getScore() > students[j].getScore())
                {
                    Student s = students[i];
                    students[i] = students[j];
                    students[j] = s;
                }
            }
        }
        System.out.println("按成绩排序之后的结果如下");
        for(int i = 0 ; i < students.length ; i++)
        {
            System.out.println("姓名" + students[i].getName() + "学号" + students[i].getId() + "成绩" + students[i].getScore());
        }
    }
}
