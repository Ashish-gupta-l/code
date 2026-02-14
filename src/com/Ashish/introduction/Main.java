package com.Ashish.introduction;
public class Main {
    public static void main(String[] args) {
//        int[] rno= new int[5];            this is how you can declare array
//      Main s1 = new Main();
        Student s1 = new Student();
        s1.marks=6.3f;

        System.out.println(s1.marks);
        s1.changename("Aryan");
        s1.Greeting();
    }


    }
class Student {
    int rno;
    String name;
    float marks=4.8f;

    void Greeting(){
        System.out.println("Hello everyone..!  I am "+ this.name);
    }
    void changename(String newname){
        this.name=newname;
    }
    Student(){
        this.rno=13;
        this.name="Ashish";
        this.marks=9.0f;
    }

}