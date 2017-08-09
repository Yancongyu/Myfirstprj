package com.SeinorCourse.Day7_17.hh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2017/7/17.
 */
public class Client {
    public static void main(String[] args) {
        BufferedReader br = null;
        String clientStr = "";
        try{
            Socket s = new Socket("127.0.0.1",3838);
            System.out.println("与服务器建立连接");
            Send send = new Send(s);
            Thread t1 = new Thread(send);
            t1.start();
            while(true){
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                clientStr = br.readLine();
                System.out.println("服务器端说" + clientStr);
            }
        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
