package com.Ashish.interfaces;

public class CDPlayer implements MediaPlayer{
    @Override
    public void start() {
        System.out.println("Music is start");
    }

    @Override
    public void stop() {
        System.out.println("Music is stop");
    }
}
