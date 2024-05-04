package com.java11.day4;

public class Rectangle extends Shape{
    protected double l;
    protected double b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public double area() {
        return l * b;
    }
}
