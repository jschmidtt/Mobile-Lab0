package com.company;

//Extends the triangle class and makes it so that accepts only one side length and sets all sides
//to that given length.
public class EquilateralTriangle extends Triangle {

    //Side values
    private double s1,s2,s3 = 0.0;

    //Constructor
    public EquilateralTriangle(String name) {
        super(name);
    }

    //Set Dimensions of this equal triangle
    public void setDimensions(double side){
        s1 = side;
        s2 = side;
        s3 = side;
    }

    //Set supers sides to this equal triangles sides then call supers getArea()
    @Override
    public double getArea(){
        super.s1 = s1;
        super.s2 = s2;
        super.s3 = s3;
        return super.getArea();
    }

    //Print sides of equal triangle
    @Override
    public void printDimensions(){
        System.out.println(getName() + " sides are all: "+ s1);
    }
}
