package com.Ashish.properties.polymorphism;

public class Main {
    static void main(String[] args) {
        Shapes shape = new Circle();
        Shapes circle = new Circle();  //this is called upcasting
        Triangle triangle = new Triangle();

        circle.area();
//        triangle.area();
    }
}
