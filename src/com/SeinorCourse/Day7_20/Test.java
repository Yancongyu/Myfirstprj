package com.SeinorCourse.Day7_20;

import com.SeinorCourse.Day7_20.dao.OpBankDao;
import com.SeinorCourse.Day7_20.dao.OpBankDaoImp;

/**
 * Created by Administrator on 2017/7/20.
 */
public class Test {
    public static void main(String[] args) {
//        OpBankBizImp obb = new OpBankBizImp();
//        boolean b = obb.trans(1002,1003,1000);
//        if(b){
//            System.out.println("转账成功");
//        }
//        else {
//            System.out.println("转账失败");
//        }
        OpBankDao obd = new OpBankDaoImp();
//        try {
//            obd.savePic("H:\\素材1.jpg");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            obd.getPic("H:\\mm.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
