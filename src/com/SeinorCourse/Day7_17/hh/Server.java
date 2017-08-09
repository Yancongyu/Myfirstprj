package com.SeinorCourse.Day7_17.hh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/7/17.
 */
public class Server {
    public static void main(String[] args) {
        BufferedReader br = null;
        String clientStr = "";
        try{
            ServerSocket ss = new ServerSocket(3838);
            System.out.println("服务器启动。。");
            Socket s = null;
            s = ss.accept();
            System.out.println("有客户端发送请求");
            Send send = new Send(s);
            Thread t1 = new Thread(send);
            t1.start();
            while(true){
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                clientStr = br.readLine();
                System.out.println("客户端" + clientStr);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
