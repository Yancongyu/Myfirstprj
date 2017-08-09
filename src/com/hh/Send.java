package com.hh;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Send implements Runnable{
    Socket s;
    Scanner sc = new Scanner(System.in);

    public Send(Socket s){
        this.s = s;
    }

    public void run(){
        PrintWriter out = null;

        try {
            out = new PrintWriter(new ObjectOutputStream(s.getOutputStream()),true);
            String str = sc.next();
            out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
