package com.Ashish.staticExample;

//Domo of Static Initilization.

public class StaticBlock {
    static int a =5;
    static int b;
//   static{
//
//   b=25;
//   }


    static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        b=8;
        System.out.println(obj.b);
    }

}
