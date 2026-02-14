package com.Ashish.properties.inheritance;

public class Inheritance {
    static void main(String[] args) {
        Human Ashish = new Human();
        Ashish.age=50;
        System.out.println(Ashish.age);
    }
}
    class Species{
        int age;
    }
    class Human extends Species{

    }



