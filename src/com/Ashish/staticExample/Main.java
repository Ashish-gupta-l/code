package com.Ashish.staticExample;

public class Main {
    static void main(String[] args) {
        Human Ashish = new Human(13,"Ashish", 70000);
        Human Harsh = new Human(13,"Harsh", 75000);


        //Static variable are not dependent on any other reference/object
        // use to count population
//        System.out.println(Ashish.population);
        System.out.println(Human.population);
    }
}
