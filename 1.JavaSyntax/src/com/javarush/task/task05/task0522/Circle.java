package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this(x, y, 0);
    }
    public Circle(double x){
        this(x,0,0);
    }


    public static void main(String[] args) {

    }
}