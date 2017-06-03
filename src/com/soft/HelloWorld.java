package com.soft; /**
 * Created by Administrator on 2017/5/9.
 */
    import java.util.Scanner;
    public class HelloWorld
    {
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入一串整数并在输入时用英文逗号隔开：");
            String inputString=sc.next().toString();
            String stringArray[]=inputString.split(",");
            int num[]=new int[stringArray.length];
            for(int i=0;i<stringArray.length;i++)
            {
                num[i]=Integer.parseInt(stringArray[i]);
                System.out.print(num[i]+" ");

            }
            int max = 0;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            for(int i = 0 ; i < num.length ; i++)
            {
                if(num[i] >= max)
                {
                    max = num[i];
                }
                if (num[i] <= min )
                {
                    min = num[i];
                }
                sum = sum + num[i];
            }
            System.out.println("\n" + "数组的最大值为" + max);
            System.out.println("数组的最小值为" + min);
            double avg = (double)sum/num.length;
            System.out.println("数组的平均值为" + avg);
        }
    }
