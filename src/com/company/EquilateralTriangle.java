package com.company;

public class EquilateralTriangle extends Triangle {

    private double s1,s2,s3 = 0.0;

    public EquilateralTriangle(String name) {
        super(name);
    }

    public void setDimensions(double side){
        s1 = side;
        s2 = side;
        s3 = side;
    }

    @Override
    public double getArea(){
        double perimeter = s1 + s2 + s3;
        double halfPerimeter = perimeter/2;

        double inside = halfPerimeter*(halfPerimeter-s1)*(halfPerimeter-s2)*(halfPerimeter-s3);
        double area = Math.pow(inside,0.5);
        return area;
    }

    @Override
    public void printDimensions(){
        System.out.println(getName() + " sides are all: "+ s1);
    }
}
