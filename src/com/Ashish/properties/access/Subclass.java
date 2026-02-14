package com.Ashish.properties.access;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    static void main(String[] args) {
        A o = new A(78,"AS");
        System.out.println(o.num);
    }
}
