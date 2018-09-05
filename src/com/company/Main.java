package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Shape square = new Square("Square One");

        System.out.println("Please enter length and height for "+ square.getName());
        double l = input.nextDouble();
        double h = input.nextDouble();
        ((Square) square).setDimensions(l,h);

        System.out.println(square.getName());
        square.printDimensions();
        System.out.println("The area " + square.getArea());


    }
}
