package com.SeinorCourse.Day7_20.dao;

import com.SeinorCourse.Day7_20.db.DBUtil;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/7/20.
 */
public class OpBankDaoImp implements OpBankDao{

    public boolean saveMoney(int id, float m, Connection con) throws SQLException {
        boolean b = false;
        PreparedStatement pps = null;
        String sql = "update bankinfo set cmoney = cmoney + ?" + "where customerid = ?";
        pps = con.prepareStatement(sql);
        pps.setFloat(1,m);
        pps.setInt(2,id);
        int n = pps.executeUpdate();
        if(n>0){
            b = true;
        }
        DBUtil.Close(pps);
        return b;
    }

    public boolean getMoney(int id, float m, Connection con) throws SQLException {
        boolean b = false;
        PreparedStatement pps = null;
        String sql = "update bankinfo set cmoney = cmoney - ?" + "where customerid = ?";
        pps = con.prepareStatement(sql);
        pps.setFloat(1,m);
        pps.setInt(2,id);
        int n = pps.executeUpdate();
        if(n > 0){
            b = true;
        }
        DBUtil.Close(pps);
        return b;
    }

    public boolean savePic(String path) throws Exception {
        Connection con = DBUtil.getConnection();
        boolean b = false;
        PreparedStatement pps = null;
        File f = new File(path);
        FileInputStream is = new FileInputStream(f);
        String sql = "insert into pic values (?,?)";
        pps = con.prepareStatement(sql);
        pps.setInt(1,1);
        pps.setBlob(2,is);
//        int l = (int) f.length();
//        pps.setBinaryStream(2,is,l);
        boolean n = pps.execute();
        if(n){
            b = true;
        }
        DBUtil.Close(pps);
        return b;
    }

    public void getPic(String path) throws Exception{
        Connection con = DBUtil.getConnection();
        ResultSet rs = null;
        PreparedStatement pps = null;

        pps = con.prepareStatement("select * from pic");
        rs = pps.executeQuery();
        if(rs.next()){
            System.out.println(rs.getInt(1));
            InputStream is = rs.getBinaryStream(2);
            File f = new File(path);
            OutputStream out = new FileOutputStream(f);
            int n;
            while ((n = is.read()) != -1){
                out.write(n);
            }
            out.close();
            is.close();
        }
        DBUtil.Close(rs,pps,con);

    }
}
