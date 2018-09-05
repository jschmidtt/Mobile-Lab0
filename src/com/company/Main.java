package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Shape square = new Square("Square One");
        Shape circle = new Circle("Circle One");
        Shape triangle = new Triangle("Triangle One");
        Shape equalTriangle = new EquilateralTriangle( "Equal Triangle One");

        System.out.println("Please enter length and height for "+ square.getName());
        double l = input.nextDouble();
        double h = input.nextDouble();
        ((Square) square).setDimensions(l,h);

        System.out.println("Please enter radius for "+ circle.getName());
        double r = input.nextDouble();
        ((Circle) circle).setDimensions(r);

        System.out.println("Please enter three sides for "+ triangle.getName());
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        triangle.setDimensions(s1,s2,s3);

        System.out.println("Please enter side for "+ equalTriangle.getName());
        double side = input.nextDouble();
        equalTriangle.setDimensions(side);

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
