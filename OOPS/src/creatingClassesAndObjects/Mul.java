package creatingClassesAndObjects;

import java.util.Scanner;
// creating multiple classes
class Data {

    // creating instance variable x and y
    int x ,y;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("input first value :");
        x = sc.nextInt();
        System.out.print("input second value : ");
        y = sc.nextInt();

    }

    void putData(){
        System.out.println(" Multiplication  is :  "+ (x *y));
    }
}

public class Mul {

    public static void main(String[] args) {
        Data multiply = new Data();
        multiply.getData();
        multiply.putData();
    }
}
