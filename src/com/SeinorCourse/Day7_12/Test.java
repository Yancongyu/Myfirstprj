package com.SeinorCourse.Day7_12;

import java.io.File;

/**
 * Created by Administrator on 2017/7/12.
 */
public class Test {
    public static void main(String[] args) {
        String fileName="H:"+File.separator;
        File f=new File(fileName);
        print(f);
    }
    public static void print(File f){
        if(f!=null){
            if(f.isDirectory()){
                File[] fileArray=f.listFiles();
                if(fileArray!=null){
                    for (int i = 0; i < fileArray.length; i++) {
                        //递归调用
                        print(fileArray[i]);
                    }
                }
            }
            else{
                System.out.println(f);
            }
        }
    }

}
