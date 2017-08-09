package com.SeinorCourse.Day7_17.hh;

import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/17.
 */
public class Send implements Runnable{
    Socket s;
    Scanner in = new Scanner(System.in);

    public Send(Socket s){
        this.s = s;
    }

    public void run(){
        PrintWriter out = null;
        try{
            while(true){
                out = new PrintWriter(new ObjectOutputStream(s.getOutputStream()),true);
                String str = in.next();
                out.println(str);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
