package com.SeinorCourse.Rectangle;


/**
 * Created by Administrator on 2017/5/24.
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){

    }
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double getPer(){
        return((this.length+this.width)*2);
    }
    public double getArea(){
        return(this.length*this.width);
    }
    public void showAll() {
        System.out.println("长方形的长为"+this.length);
        System.out.println("长方形的宽为"+this.width);
        System.out.println("长方形的面积为"+this.getArea());
        System.out.println("长方形的长周长为"+this.getPer());
    }
    public static void main(String[] args) {
        Rectangle rec =new Rectangle(100,30);
        rec.showAll();
    }
}



