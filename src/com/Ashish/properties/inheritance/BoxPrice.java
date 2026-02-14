package com.Ashish.properties.inheritance;

public class BoxPrice extends Boxweight {
    int rs;

    public BoxPrice(int l, int b, int h, int weight, int rs) {
        super(l, b, h, weight);
        this.rs = rs;
    }


}
