package com.company;

public class Triangle extends Shape {

    double s1,s2,s3 = 0.0;

    public Triangle(String name){
        super (name);
    }

    //Set the sides of the triangle
    public void setDimensions(double side1, double side2, double side3){
        this.s1 = side1;
        this.s2 = side2;
        this.s3 = side3;
    }

    //Print the sides of the triangle
    @Override
    public void printDimensions(){
        System.out.println(getName() + " sides are side 1: "+ s1 + " side 2: " + s2 + " side 3: " + s3);
    }

    //Get Area of Triangle
    @Override
    public double getArea(){
        double perimeter = s1 + s2 + s3;
        double halfPerimeter = perimeter/2;

        double inside = halfPerimeter*(halfPerimeter-s1)*(halfPerimeter-s2)*(halfPerimeter-s3);
        double area = Math.pow(inside,0.5);
        return area;
    }
}
