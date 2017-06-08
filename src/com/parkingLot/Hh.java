package com.parkingLot;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/23.
 */
public class Hh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要停的车类型");
        String a = sc.next();
        Vehicle v = new Vehicle();
        v.getVehicles(a);
    }
}
