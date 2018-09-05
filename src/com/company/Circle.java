package com.company;

public class Circle extends Shape {

    public Circle(String name) {
        super(name);
    }

    private double radius = 0.0;

    public void setDimensions(double r){
        radius = r;
    }

    @Override
    public void printDimensions(){
        System.out.println(getName() + "radius is: "+ radius);
    }

    @Override
    public double getArea(){
        return (3.14 * (Math.pow(radius,2)));
    }
}
