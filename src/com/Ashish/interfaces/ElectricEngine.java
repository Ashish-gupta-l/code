package com.Ashish.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Engine of electric is start");
    }

    @Override
    public void stop() {
        System.out.println("Engine of electric is stop");
    }

    @Override
    public void acc() {
        System.out.println("Engine of electric is accelerate");
    }
}
