package Front.Day7_28;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/28.
 */
public class Test implements Serializable{
    public static void main(String[] args) {
        String s1 = "0.5";
        String s2 = "12";
        double d = Double.parseDouble(s1);
        int i = Integer.parseInt(s2);
        System.out.println(s2 + s1);
        String arr[] = new String[]{"1","1","1"};
    }
}
