package com.company;

public class Shape {
    private String name;

    //Default constructor
    public Shape(String name){
        this.name = name;
    }

    //Return name of this shape
    public String getName(){
        return name;
    }

    //Return area of this shape
    public double getArea(){
        return 0.0;
    }

    //Print dimensions of this shape
    public void printDimensions(){
        System.out.println("No Dimensions");
    }

}
