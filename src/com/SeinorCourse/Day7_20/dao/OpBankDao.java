package com.SeinorCourse.Day7_20.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/7/20.
 */
public interface OpBankDao {
    //存钱
    public boolean saveMoney(int id, float m, Connection con)throws SQLException;
    //取钱
    public boolean getMoney(int id, float m, Connection con)throws SQLException;
    //存图片
    public boolean savePic(String path) throws Exception;
    //读取图片
    public void getPic(String path) throws Exception;
}
