class Animal{
    String move ;
//    Animal(String m){
//        this.move=m;
//    }
  void display (){
      System.out.println("movement is :");
  }
}

class Dog extends Animal{
   Dog(String str){
//       super(str);
       super.move=str;
   }
    void display (){
        System.out.println(move);
    }
}
class Cat  extends Animal{
    Cat(String str){
//       super(str);
        super.move=str;
    }
    void display (){
        System.out.println(move);
    }
}

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("crouch");
        Dog d = new Dog("running");
        c.display();
        d.display();
    }
}