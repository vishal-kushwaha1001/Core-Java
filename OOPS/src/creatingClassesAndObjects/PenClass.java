package creatingClassesAndObjects;

import java.util.Scanner;

class Pen {
    String type;// ball ,jel
    String color;
    String brand;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input pen  type :");
        this.type = sc.next();
        System.out.print(" color :");
        this.color = sc.next();
        System.out.print(" brand :");
        this.brand = sc.next();
        sc.close();
    }

    void printInfo() {
        System.out.println("color Is :" + this.color);
        System.out.println("Brand Is :" + this.brand);
        System.out.println("Type Is :" + this.type);
    }

}

public class PenClass {
    public static void main(String[] args) {
        Pen p1 = new Pen();
//        Pen p2 = new Pen();
        System.out.println("data of 1st pen");
        p1.getData();
        p1.printInfo();


    }
}

