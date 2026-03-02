package com.Ashish.abstracts;

public class Son extends Jeevan{

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am software developer");
    }

    @Override
    void partner() {
        System.out.println("She is queen of my heart");
    }
}
