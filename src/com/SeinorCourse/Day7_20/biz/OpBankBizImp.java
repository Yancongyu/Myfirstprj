package com.SeinorCourse.Day7_20.biz;

import com.SeinorCourse.Day7_20.dao.OpBankDao;
import com.SeinorCourse.Day7_20.dao.OpBankDaoImp;
import com.SeinorCourse.Day7_20.db.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/7/20.
 */
public class OpBankBizImp implements OpBankBiz{
    OpBankDao obd = new OpBankDaoImp();

    public boolean trans(int from, int to, float money) {
        Connection con = DBUtil.getConnection();
        boolean b = false;
        try {
            con.setAutoCommit(false);
            boolean b1 = obd.getMoney(from,money,con);
            boolean b2 = obd.saveMoney(to,money,con);
            if(b1 && b2){
                b = true;
                con.commit();
            }
            else{
                con.rollback();
            }
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
        finally {
            DBUtil.Close(con);
        }
        return b;
    }
}
