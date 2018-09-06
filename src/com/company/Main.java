package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Create one instance for each class
        Shape square = new Square("Square One");
        Shape circle = new Circle("Circle One");
        Shape triangle = new Triangle("Triangle One");
        Shape equalTriangle = new EquilateralTriangle( "Equal Triangle One");

        //This section gets input for all dimensions of the different shapes.
        //User input for square only takes two inputs for length and height
        System.out.println("Please enter length and height for "+ square.getName());
        double l = input.nextDouble();
        double h = input.nextDouble();
        ((Square) square).setDimensions(l,h);

        //User input for circle radius only takes one input as double
        System.out.println("Please enter radius for "+ circle.getName());
        double r = input.nextDouble();
        ((Circle) circle).setDimensions(r);

        //User input for Triangle takes in three inputs as doubles
        System.out.println("Please enter three sides for "+ triangle.getName());
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        ((Triangle)triangle).setDimensions(s1,s2,s3);

        //User input for the Equilateral Triangle only takes one input
        System.out.println("Please enter side for "+ equalTriangle.getName());
        double side = input.nextDouble();
        ((EquilateralTriangle)equalTriangle).setDimensions(side);

        //This sections prints the information to the user.
        System.out.println("\nYour shapes information: ");
        //Preform Square Ops and Print
        System.out.println(square.getName());
        square.printDimensions();
        System.out.println("The area " + square.getArea() +"\n");

        //Preform Circle Ops and Print
        System.out.println(circle.getName());
        circle.printDimensions();
        System.out.println("The area " + circle.getArea() +"\n");

        //Preform Triangle Ops and Print
        System.out.println(triangle.getName());
        triangle.printDimensions();
        System.out.println("The area " + triangle.getArea() +"\n");

        //Preform EqualTriangle Ops and Print
        System.out.println(equalTriangle.getName());
        equalTriangle.printDimensions();
        System.out.println("The area " + equalTriangle.getArea());

    }
}
