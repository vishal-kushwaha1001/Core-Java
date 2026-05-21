class Parent {
    Parent(){
        System.out.println("hello");
    }
}
class Child extends  Parent{
    Child(){
        System.out.println("welcome");
    }
}

public class Main {
    public static void main(String[] args)
    {
        Child c = new Child();
    }
}