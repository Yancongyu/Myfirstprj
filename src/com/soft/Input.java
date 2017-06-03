package com.soft;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Administrator on 2017/5/24.
 */
public class Input {
        public static void main(String[] args) {
            ArrayList<String> array = new ArrayList<String>();
            Scanner scn = new Scanner(System.in);
            String line;
            String strings = "";
            while (!"end".equals(line = scn.nextLine())) {
                array.add(line);
                strings += line + " ";
            }
            for (String str : array) {
                System.out.println(str);
            }
            scn.close();
            System.out.println(strings);
        }
    }

