package com.Ashish.Singleton;

import com.Ashish.properties.access.A;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    static void main(String[] args) {
        Subclass o = new Subclass(78,"AS");
        System.out.println(o.num);
    }
}
