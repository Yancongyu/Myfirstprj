package com.parkingLot;

/**
 * Created by Administrator on 2017/5/23.
 */
public class Bus {
    double fee;
    public void getFee(double seconds){
        if(seconds > 0 && seconds < 2)
        {
            fee = seconds * 14;
        }
        else if(seconds >= 2 && seconds < 10)
        {
            fee = seconds * 17;
        }
        else if(seconds >= 10)
        {
            fee = seconds * 19;
        }
        else{System.out.println("时间错误");}
        System.out.println("您本次Bus停车时长为" + seconds + "时"+ "本次费用为" + fee);
    }
}
