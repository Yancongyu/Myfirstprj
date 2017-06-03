package com.soft;

/**
 * Created by Administrator on 2017/5/15.
 */
public class hhh {
    public static void main(String[]args)
    {
        int[][] a = {{2,3,4},{4,6,8}};
        int[][] b = {{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
        for(int i = 0 ; i < a.length ; i++)
        {
            for(int j = 0 ; j < b[0].length ; j++)
            {
                int sum = 0;
                for(int k = 0 ; k <b.length ; k++ )
                {
                sum += a[i][k]*b[k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.print("\n");
        }
    }
}
