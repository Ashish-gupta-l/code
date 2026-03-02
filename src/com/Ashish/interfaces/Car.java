package com.Ashish.interfaces;


public class Car implements Engine,Brake, MediaPlayer {

    @Override
    public void brake() {
        System.out.println("Normal brake");
    }

    @Override
    public void start() {
        System.out.println("Normal start");

    }

    @Override
    public void stop() {
        System.out.println("Normal engine stop");

    }

    @Override
    public void acc() {
        System.out.println("Normal accelerate");

    }
}
