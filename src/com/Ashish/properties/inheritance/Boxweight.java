package com.Ashish.properties.inheritance;

public class Boxweight extends Box{
    int weight;

    public Boxweight(int l, int b, int h, int weight) {
        super(l, b, h);
        this.weight = weight;
    }
}
