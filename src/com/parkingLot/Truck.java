package com.parkingLot;

/**
 * Created by Administrator on 2017/5/23.
 */
public class Truck {
    double fee;
        public void getFee(double seconds){
            if(seconds > 0 && seconds < 2)
            {
                fee = seconds * 12;
            }
            else if(seconds >= 2 && seconds < 10)
            {
                fee = seconds * 15;
            }
            else if(seconds >= 10)
            {
                fee = seconds * 17;
            }
            else{System.out.println("时间错误");}
            System.out.println("您本次Truck停车时长为" + seconds + "时"+ "本次费用为" + fee);
        }
}