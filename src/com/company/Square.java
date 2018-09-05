package com.company;

public class Square extends Shape {

    private double length,height = 0.0;

    public Square(String name) {
        super(name);
    }

    public void setDimensions(double l, double h){
        length = l;
        height = h;
    }

    @Override
    public void printDimensions(){
        System.out.println(getName() + " is: "+ length + " by " + height);
    }

    @Override
    public double getArea(){
        return length * height;
    }
}
