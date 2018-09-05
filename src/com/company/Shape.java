package com.company;

public class Shape {
    private String name;

    public Shape(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getArea(){
        return 0.0;
    }

    public void printDimensions(){
        System.out.println("No Dimensions");
    }

    // if i have just public void setDimensions(){} i get an error or
    // have to call the method from main within triangle like ((Triangle) triangle).setDimensions(...)
    // however I thought in java you can overload (not override) a method if you change the signatures
    // Example:
    // such as having public void setDimensions(){} here in the shape class and then
    // have public void setDimensions(double s1, double s2, double s3) {} in the subclass Triangle
    // then I thought in main you could just call triangle.setDimensions(s1,s2,s3)
    // am I incorrect here? thanks
    public void setDimensions(double s1, double s2, double s3) {
    }

    public void setDimensions(double side) {
    }
}
