package com.company;

//Extends the triangle class and makes it so that accepts only one side length and sets all sides
//to that given length.
public class EquilateralTriangle extends Triangle {

    //Side value
    private double mySide = 0.0;

    //Constructor
    public EquilateralTriangle(String name) {
        super(name);
    }

    //Set Dimensions of this equal triangle
    public void setDimensions(double side){
        mySide = side;
    }

    //Set supers sides to this equal triangles sides then call supers getArea()
    @Override
    public double getArea(){
        super.s1 = super.s2 = super.s3 = mySide;
        return super.getArea();
    }

    //Print sides of equal triangle
    @Override
    public void printDimensions(){
        System.out.println(getName() + " sides are all: "+ mySide);
    }
}
