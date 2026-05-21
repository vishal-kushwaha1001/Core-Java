package com.inheritance;

class Shape{
    double l,b;
//    Shape( double area){
//        this.area = area;
//    }
    void display (){
        System.out.println("Area of ");
    }

}
class Rectangle extends Shape{
    Rectangle(int l, int b){
       super.l=l;
        super.b=b;
        //super.area = l*b;
    }
    void area(){
        super.display();
        System.out.println(l*b);
    }
}
class Circle extends Shape{
    Circle(double r){
        super.area = (2 *3.14 *r);
    }
    void display (){
        System.out.println(" Circle is :"+area);
    }
}
class Square extends Shape{
    Square(double l ){
        super.area = l*l;

    }
    void display (){
        System.out.println(" Square is :"+area);
    }
}
public class Area {
    public static void main(String[] args) {
        Circle c = new Circle(5.6);
        Rectangle r = new Rectangle(3, 5);
        Square s = new Square(8);
        s.display();
        c.display();
        r.display();
    }
}

