package com.soft;

/**
 * Created by Administrator on 2017/5/18.
 */
public class randomNum {
    public static int[] randomCommon(int min, int max, int n){
        if (n > (max - min + 1) || max < min) {
            return null;
        }
        int[] result = new int[n];
        int count = 0;
        while(count < n) {
            int num = (int) (Math.random() * (max - min)) + min;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if(num == result[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                result[count] = num;
                count++;
            }

        }
        for(int i = 0 ; i < n ;i++)
        {
            System.out.print(result[i] + " ");
        }
        return result;
    }
    public static void main(String[]args)
    {
        randomNum r = new randomNum();
        r.randomCommon(0,60,59);
    }
}
