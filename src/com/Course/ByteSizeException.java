package com.Course;

/**
 * Created by Administrator on 2017/5/19.
 */
public class ByteSizeException extends Exception {
    public ByteSizeException()
    {
        super("此数据超出byte类型表示的数的范围");
    }
}
