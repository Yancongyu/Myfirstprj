package com.SeinorCourse.Day7_20.db;

import java.sql.Connection;

/**
 * Created by Administrator on 2017/7/20.
 */
public class Test {
    public static void main(String[] args) {
        Connection con = DBUtil.getConnection();
        if(con != null){
            System.out.println("连接成功");
        }
        else{
            System.out.println("连接失败");
        }
    }
}
