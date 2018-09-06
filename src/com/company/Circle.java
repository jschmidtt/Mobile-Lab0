package com.company;

public class Circle extends Shape {

    //Constructor
    public Circle(String name) {
        super(name);
    }

    //Radius
    private double radius = 0.0;

    //Set the radius
    public void setDimensions(double r){
        radius = r;
    }

    //Print the radius
    @Override
    public void printDimensions(){
        System.out.println(getName() + " radius is: "+ radius);
    }

    //Return the area of a circle based on set radius
    @Override
    public double getArea(){
        return (3.14 * (Math.pow(radius,2)));
    }
}
