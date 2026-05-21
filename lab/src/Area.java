class Shape{
    double l,b;
    void display (){
        System.out.print("Area of ");
    }
}
class Rectangle extends Shape{
    Rectangle(double l, double b){
        super.l=l;
        super.b=b;
    }
    void area(){
        super.display();
        System.out.println("Rectangle is :"+l*b);
    }
}
class Square extends Shape{
    Square(double l ,double b){
        super.l=l;
        super.b=b;
    }
    void area (){
        super.display();
        System.out.println("Square is :"+l*b);
    }
}
public class Area {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(3, 5);
        Square s = new Square(8,9);
        r.area();
        s.area();
    }
}

