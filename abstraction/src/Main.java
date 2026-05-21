abstract  class Animal{
    abstract void address();

}
class Dog extends Animal{
    void address(){
        System.out.println("living in the town ,village");
    }
}
class lion extends Animal{
    void address(){
        System.out.println("living  deep inside the forest ");
    }
}
public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.address();
        lion l = new lion();
        l.address();
    }
}