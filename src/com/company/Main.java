package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Shape square = new Square("Square One");
        Shape circle = new Circle("Circle One");

        System.out.println("Please enter length and height for "+ square.getName());
        double l = input.nextDouble();
        double h = input.nextDouble();
        ((Square) square).setDimensions(l,h);

        System.out.println("Please enter radius for "+ circle.getName());
        double r = input.nextDouble();
        ((Circle) circle).setDimensions(r);

        //Preform Square Ops and Print
        System.out.println(square.getName());
        square.printDimensions();
        System.out.println("The area " + square.getArea() +"\n");

        //Preform Circle Ops and Print
        System.out.println(circle.getName());
        circle.printDimensions();
        System.out.println("The area " + circle.getArea());

    }
}
