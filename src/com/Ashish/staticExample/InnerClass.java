package com.Ashish.staticExample;

public class InnerClass {
    static void main(String[] args) {
        A a= new A("Ashish");
        System.out.println(a);
    }

    static class A{
        String name;

        public A(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Ashish Gupta";
        }
    }

}
