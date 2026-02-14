package com.Ashish.properties.access;

public class Main {
    static void main(String[] args) {
        A obj = new A(10, "Ashish Gupta");
//obj.setNum(15);
        System.out.println(obj.num);
        System.out.println( obj.getNum());
    }
}
