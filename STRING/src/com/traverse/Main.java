package com.traverse;
class Demo {
    void display(){
        System.out.println("Welcome");

    }
    static {
        System.out.println("java");
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
//        Demo d = new Demo();
//        d.display();
        Demo d = new Demo();
        System.out.println("hello");
        d.display();
    }
}
