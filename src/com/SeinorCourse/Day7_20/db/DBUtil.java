package com.SeinorCourse.Day7_20.db;

import java.io.*;
import java.sql.*;
import java.util.Properties;

/**
 * Created by Administrator on 2017/7/20.
 */
public class DBUtil {
    private static String url;
    private static String user;
    private static String pwd;

    static{
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        File f = new File("H:\\jdbc.properties");
        Properties p = new Properties();
        InputStream is = null;
        try{
            if(f.exists()){
                is = new FileInputStream(f);
                p.load(is);
                url = p.getProperty("url");
                user = p.getProperty("user");
                pwd = p.getProperty("pwd");
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(url,user,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void Close(ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void Close(Statement st){
        if(st != null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void Close(Connection con){
        if(con != null){
            try {
                 con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void Close(ResultSet rs,Statement st,Connection con){
        try{
            if(rs != null){
                rs.close();
            }
            if(st != null){
                st.close();
            }
            if(con != null){
                con.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
