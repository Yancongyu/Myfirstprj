package com.parkingLot;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Stop extends Thread{
    private String a = " ";
    private Storage storage;
    public Stop(Storage storage){this.storage = storage;}
    public void run(){getVehicles(a);}
    public void getVehicles(String a){storage.getVehicles(a);}
}
