package com.company;

public class Square extends Shape {

    //Value for length and height
    private double length,height = 0.0;

    //Constructor
    public Square(String name) {
        super(name);
    }

    //Set the length and height
    public void setDimensions(double l, double h){
        length = l;
        height = h;
    }

    //Print the length and height
    @Override
    public void printDimensions(){
        System.out.println(getName() + " is: "+ length + " by " + height);
    }

    //Return the area of this square
    @Override
    public double getArea(){
        return length * height;
    }
}
